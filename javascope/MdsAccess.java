/* $Id$ */
import java.net.*;
import java.util.*;
import java.io.IOException;

public class MdsAccess implements DataAccess
{
    String ip_addr = null;
    String shot_str = null;
    String signal = null;
    String experiment = null;
    MdsDataProvider np = null;
    String error = null;
    String encoded_credentials = null;

    
    public static void main(String args[])
    {
        MdsAccess access = new MdsAccess();
        String url = "mds:://150.178.3.80/a/14000/\\emra_it";
        boolean supports = access.supports(url);
        try
        {
            Signal s = access.getSignal(url);
            s = access.getSignal(url);
            //float x [] = access.getX(url);
            //float y [] = access.getY(url);
         }
        catch (IOException e) {}
    }

    public boolean supports(String url)
    {
        StringTokenizer st = new StringTokenizer(url, ":");
        if(st.countTokens() < 2) return false;
        return st.nextToken().equals("mds");
    }
    
    public String setProvider(String url) throws IOException
    {
        StringTokenizer st1 = new StringTokenizer(url, ":");
        String content = st1.nextToken();
        content = st1.nextToken("");
        content = content.substring(2);
        StringTokenizer st2 = new StringTokenizer(content, "/");
        if(st2.countTokens() < 4) //ip addr/exp/shot/signal
            return null;
        String addr = st2.nextToken();
        if(addr == null) return null;
        if(ip_addr == null || !ip_addr.equals(addr))
        {
            np = new MdsDataProvider(addr);
            /*
            if(encoded_credentials == null ||( ip_addr != null && !ip_addr.equals(addr)))
            {
                encoded_credentials = new String();
                np.InquireCredentials(null, encoded_credentials);
            }
            */
            ip_addr = addr;
        }
        experiment = st2.nextToken();
        if(experiment != null && !experiment.equals(""))
        {
            //String shot_str = st2.nextToken();
            shot_str = st2.nextToken();
            int shot = (new Integer(shot_str)).intValue();
            np.Update(experiment, shot);
        }
        signal = st2.nextToken();
        return signal;
    }
    
    public String getShot()
    {
        return shot_str;
    }

    public String getSignal()
    {
        return signal;
    }

    public String getExperiment()
    {
        return experiment;
    }

    public DataProvider getDataProvider()
    {
        return np;
    }

    public void close()
    {
        if(np != null)
            np.Dispose();
        np = null;
        ip_addr = null;
    }
    
    public float [] getX(String url) throws IOException
    {
        signal = setProvider(url);
        if(signal == null) return null;
        return np.GetFloatArray("DIM_OF("+signal+")");
    }
    
    public float [] getY(String url) throws IOException
    {
        String signal = setProvider(url);
        if(signal == null) return null;
        return np.GetFloatArray(signal);
    }
    
    public Signal getSignal(String url) throws IOException
    {
        Signal s = null;
        error = null;
        
        float y[] = getY(url);
        float x[] = getX(url);
                
        if(x == null || y == null)
        {
            error = np.ErrorString();
            return null;
        }
        s = new Signal(x, y);
        return s;
    }
 
    public Frames getImages(String url, Frames f) throws IOException
    {
        byte buf[];
        String signal = setProvider(url);
        
        if(signal == null) return null;
        try
        {
            if( (buf = np.GetAllFrames(signal)) != null )
            {
                if(f == null)
                    f = new Frames();
                if(!f.AddMultiFrame(buf, (float)-1E8, (float)1E8))
                {
	                error = " Can't decode multi frame image "; 
                } else {
                    f.WaitLoadFrame();
                    f.setName(signal);
                }
                buf = null;            
            } 
            else
                error = " Frames not found ";
        }   
        catch (Exception e) 
        {
            error = new String(e.getMessage());
        }
        
        return f;
    }
    
    public void setPassword(String encoded_credentials)
    {
        this.encoded_credentials = encoded_credentials;
    }
    
    
    public String getError()
    {   
        if(np == null)
           return("Cannot create MdsDataProvider");
        if(error != null)
            return error;
        return np.ErrorString();
    }
}
        
