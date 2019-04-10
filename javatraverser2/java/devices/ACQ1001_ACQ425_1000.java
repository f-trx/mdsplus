package devices;

import java.awt.Frame;
import devices.acq4xx.ACQ1001;
import devices.acq4xx.ACQ425_1000;
import mds.data.descriptor_s.NODE;

public class ACQ1001_ACQ425_1000 extends ACQ1001{
    public ACQ1001_ACQ425_1000(final Frame frame, final NODE<?> head, final boolean editable){
	super(frame, head, editable, ACQ425_1000.class);
    }
}
