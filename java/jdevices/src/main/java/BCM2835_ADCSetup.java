/*

 * To change this template, choose Tools | Templates

 * and open the template in the editor.

 */



/*

 * BCM2835_ADCSetup.java

 *

 * Created on Dec 22, 2011, 9:59:13 AM

 */



/**

 *

 * @author manduchi

 */

public class BCM2835_ADCSetup extends DeviceSetup {



    /** Creates new form NI6368AISetup */

    public BCM2835_ADCSetup() {

	initComponents();

    }



    /** This method is called from within the constructor to

     * initialize the form.

     * WARNING: Do NOT modify this code. The content of this method is

     * always regenerated by the Form Editor.

     */

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deviceButtons1 = new DeviceButtons();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        deviceField2 = new DeviceField();
        deviceField1 = new DeviceField();
        deviceDispatch1 = new DeviceDispatch();
        jPanel3 = new javax.swing.JPanel();
        deviceChoice51 = new DeviceChoice();
        deviceField3 = new DeviceField();
        deviceField4 = new DeviceField();
        jPanel4 = new javax.swing.JPanel();
        deviceChoice4 = new DeviceChoice();
        deviceField5 = new DeviceField();
        deviceField6 = new DeviceField();
        jPanel5 = new javax.swing.JPanel();
        deviceChoice2 = new DeviceChoice();
        deviceField11 = new DeviceField();
        jPanel6 = new javax.swing.JPanel();
        deviceChoice52 = new DeviceChoice();
        deviceField7 = new DeviceField();
        deviceField8 = new DeviceField();
        deviceField9 = new DeviceField();
        deviceField10 = new DeviceField();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        deviceChannel1 = new DeviceChannel();
        jPanel25 = new javax.swing.JPanel();
        deviceChannel2 = new DeviceChannel();
        jPanel26 = new javax.swing.JPanel();
        deviceChannel3 = new DeviceChannel();
        jPanel27 = new javax.swing.JPanel();
        deviceChannel4 = new DeviceChannel();

        setDeviceProvider("scstkl.nbtf:9000");
        setDeviceTitle("\"BCM 2835 Serial Periferal Interface ADC acquisition");
        setDeviceType("BCM2835_ADC");
        setHeight(390);
        setWidth(1100);

        deviceButtons1.setCheckExpressions(new String[] {});
        deviceButtons1.setCheckMessages(new String[] {});
        deviceButtons1.setMethods(new String[] {"init", "start_store", "stop_store", "wait_store"});
        getContentPane().add(deviceButtons1, java.awt.BorderLayout.PAGE_END);

        jPanel1.setLayout(new java.awt.GridLayout(5, 1));

        deviceField2.setIdentifier("");
        deviceField2.setLabelString("Comment: ");
        deviceField2.setNumCols(40);
        deviceField2.setOffsetNid(2);
        deviceField2.setTextOnly(true);
        jPanel2.add(deviceField2);

        deviceField1.setIdentifier("");
        deviceField1.setLabelString("Board IP: ");
        deviceField1.setNumCols(20);
        deviceField1.setOffsetNid(1);
        deviceField1.setTextOnly(true);
        jPanel2.add(deviceField1);
        jPanel2.add(deviceDispatch1);

        jPanel1.add(jPanel2);

        deviceChoice51.setChoiceItems(new String[] {"TRANSIENT REC.", "CONTINUOUS"});
        deviceChoice51.setIdentifier("");
        deviceChoice51.setLabelString("Acq. Mode: ");
        deviceChoice51.setOffsetNid(10);
        deviceChoice51.setUpdateIdentifier("");
        jPanel3.add(deviceChoice51);

        deviceField3.setIdentifier("");
        deviceField3.setLabelString("Buf. Size (Samples): ");
        deviceField3.setOffsetNid(5);
        jPanel3.add(deviceField3);

        deviceField4.setIdentifier("");
        deviceField4.setLabelString("Segment Size (Samples): ");
        deviceField4.setOffsetNid(6);
        jPanel3.add(deviceField4);

        jPanel1.add(jPanel3);

        deviceChoice4.setChoiceItems(new String[] {"INTERNAL", "EXTERNAL"});
        deviceChoice4.setIdentifier("_clock_mode");
        deviceChoice4.setLabelString("Clock Mode: ");
        deviceChoice4.setOffsetNid(3);
        deviceChoice4.setUpdateIdentifier("");
        jPanel4.add(deviceChoice4);

        deviceField5.setIdentifier("_frequency");
        deviceField5.setLabelString("Frequency (Hz): ");
        deviceField5.setOffsetNid(4);
        jPanel4.add(deviceField5);

        deviceField6.setIdentifier("");
        deviceField6.setLabelString("Ext. Clock: ");
        deviceField6.setNumCols(30);
        deviceField6.setOffsetNid(7);
        jPanel4.add(deviceField6);

        jPanel1.add(jPanel4);

        deviceChoice2.setChoiceItems(new String[] {"INTERNAL", "EXTERNAL"});
        deviceChoice2.setIdentifier("");
        deviceChoice2.setLabelString("Trigger Mode: ");
        deviceChoice2.setOffsetNid(11);
        deviceChoice2.setUpdateIdentifier("");
        jPanel5.add(deviceChoice2);

        deviceField11.setIdentifier("_trig_time");
        deviceField11.setLabelString("Ext. Trigger: ");
        deviceField11.setNumCols(30);
        deviceField11.setOffsetNid(12);
        jPanel5.add(deviceField11);

        jPanel1.add(jPanel5);

        deviceChoice52.setChoiceItems(new String[] {"YES", "NO"});
        deviceChoice52.setIdentifier("");
        deviceChoice52.setLabelString("Use Time: ");
        deviceChoice52.setOffsetNid(13);
        deviceChoice52.setUpdateIdentifier("");
        jPanel6.add(deviceChoice52);

        deviceField7.setIdentifier("_start_time");
        deviceField7.setLabelString("Start Time (s): ");
        deviceField7.setOffsetNid(14);
        jPanel6.add(deviceField7);

        deviceField8.setIdentifier("");
        deviceField8.setLabelString("End Time (s): ");
        deviceField8.setOffsetNid(15);
        jPanel6.add(deviceField8);

        deviceField9.setIdentifier("");
        deviceField9.setLabelString("Start Idx: ");
        deviceField9.setOffsetNid(9);
        jPanel6.add(deviceField9);

        deviceField10.setIdentifier("");
        deviceField10.setLabelString("End Idx:");
        deviceField10.setOffsetNid(8);
        jPanel6.add(deviceField10);

        jPanel1.add(jPanel6);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Channels Status"));
        jPanel23.setLayout(new java.awt.GridLayout(1, 4));

        deviceChannel1.setLabelString("Channel 1");
        deviceChannel1.setOffsetNid(17);
        deviceChannel1.setShowVal("");
        deviceChannel1.setUpdateIdentifier("");
        jPanel24.add(deviceChannel1);

        jPanel23.add(jPanel24);

        deviceChannel2.setLabelString("Channel 2");
        deviceChannel2.setOffsetNid(23);
        deviceChannel2.setShowVal("");
        deviceChannel2.setUpdateIdentifier("");
        jPanel25.add(deviceChannel2);

        jPanel23.add(jPanel25);

        deviceChannel3.setLabelString("Channel 3");
        deviceChannel3.setOffsetNid(29);
        deviceChannel3.setShowVal("");
        deviceChannel3.setUpdateIdentifier("");
        jPanel26.add(deviceChannel3);

        jPanel23.add(jPanel26);

        deviceChannel4.setLabelString("Channel 1");
        deviceChannel4.setOffsetNid(35);
        deviceChannel4.setShowVal("");
        deviceChannel4.setUpdateIdentifier("");
        jPanel27.add(deviceChannel4);

        jPanel23.add(jPanel27);

        getContentPane().add(jPanel23, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DeviceButtons deviceButtons1;
    private DeviceChannel deviceChannel1;
    private DeviceChannel deviceChannel2;
    private DeviceChannel deviceChannel3;
    private DeviceChannel deviceChannel4;
    private DeviceChoice deviceChoice2;
    private DeviceChoice deviceChoice4;
    private DeviceChoice deviceChoice51;
    private DeviceChoice deviceChoice52;
    private DeviceDispatch deviceDispatch1;
    private DeviceField deviceField1;
    private DeviceField deviceField10;
    private DeviceField deviceField11;
    private DeviceField deviceField2;
    private DeviceField deviceField3;
    private DeviceField deviceField4;
    private DeviceField deviceField5;
    private DeviceField deviceField6;
    private DeviceField deviceField7;
    private DeviceField deviceField8;
    private DeviceField deviceField9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables



}

