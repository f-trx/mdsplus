/*

 * To change this template, choose Tools | Templates

 * and open the template in the editor.

 */



/*

 * NI6368AISetup.java

 *

 * Created on Dec 22, 2011, 9:59:13 AM

 */



/**

 *

 * @author manduchi

 */

public class NI6368AISetup extends DeviceSetup {



    /** Creates new form NI6368AISetup */

    public NI6368AISetup() {

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
	jScrollPane1 = new javax.swing.JScrollPane();
	jPanel39 = new javax.swing.JPanel();
	jPanel7 = new javax.swing.JPanel();
	deviceChoice3 = new DeviceChoice();
	deviceChoice5 = new DeviceChoice();
	jLabel1 = new javax.swing.JLabel();
	jPanel8 = new javax.swing.JPanel();
	deviceChoice6 = new DeviceChoice();
	deviceChoice17 = new DeviceChoice();
	jLabel9 = new javax.swing.JLabel();
	jPanel9 = new javax.swing.JPanel();
	deviceChoice9 = new DeviceChoice();
	deviceChoice7 = new DeviceChoice();
	jLabel2 = new javax.swing.JLabel();
	jPanel10 = new javax.swing.JPanel();
	deviceChoice12 = new DeviceChoice();
	deviceChoice19 = new DeviceChoice();
	jLabel10 = new javax.swing.JLabel();
	jPanel11 = new javax.swing.JPanel();
	deviceChoice15 = new DeviceChoice();
	deviceChoice8 = new DeviceChoice();
	jLabel3 = new javax.swing.JLabel();
	jPanel12 = new javax.swing.JPanel();
	deviceChoice18 = new DeviceChoice();
	deviceChoice20 = new DeviceChoice();
	jLabel11 = new javax.swing.JLabel();
	jPanel13 = new javax.swing.JPanel();
	deviceChoice21 = new DeviceChoice();
	deviceChoice10 = new DeviceChoice();
	jLabel4 = new javax.swing.JLabel();
	jPanel14 = new javax.swing.JPanel();
	deviceChoice24 = new DeviceChoice();
	deviceChoice22 = new DeviceChoice();
	jLabel12 = new javax.swing.JLabel();
	jPanel15 = new javax.swing.JPanel();
	deviceChoice27 = new DeviceChoice();
	deviceChoice11 = new DeviceChoice();
	jLabel5 = new javax.swing.JLabel();
	jPanel16 = new javax.swing.JPanel();
	deviceChoice30 = new DeviceChoice();
	deviceChoice23 = new DeviceChoice();
	jLabel13 = new javax.swing.JLabel();
	jPanel17 = new javax.swing.JPanel();
	deviceChoice33 = new DeviceChoice();
	deviceChoice13 = new DeviceChoice();
	jLabel6 = new javax.swing.JLabel();
	jPanel18 = new javax.swing.JPanel();
	deviceChoice36 = new DeviceChoice();
	deviceChoice25 = new DeviceChoice();
	jLabel14 = new javax.swing.JLabel();
	jPanel19 = new javax.swing.JPanel();
	deviceChoice39 = new DeviceChoice();
	deviceChoice14 = new DeviceChoice();
	jLabel7 = new javax.swing.JLabel();
	jPanel20 = new javax.swing.JPanel();
	deviceChoice42 = new DeviceChoice();
	deviceChoice26 = new DeviceChoice();
	jLabel15 = new javax.swing.JLabel();
	jPanel21 = new javax.swing.JPanel();
	deviceChoice45 = new DeviceChoice();
	deviceChoice16 = new DeviceChoice();
	jLabel8 = new javax.swing.JLabel();
	jPanel22 = new javax.swing.JPanel();
	deviceChoice48 = new DeviceChoice();
	deviceChoice28 = new DeviceChoice();
	jLabel16 = new javax.swing.JLabel();

	setDeviceProvider("localhost");
	setDeviceTitle("National Instruments PXIe 6368 16 ch 2MS/s  ADC");
	setDeviceType("NI6368AI");
	setHeight(900);
	setWidth(900);

	deviceButtons1.setCheckExpressions(new String[] {});
	deviceButtons1.setCheckMessages(new String[] {});
	deviceButtons1.setMethods(new String[] {"init", "start_store", "stop_store"});
	getContentPane().add(deviceButtons1, java.awt.BorderLayout.PAGE_END);

	jPanel1.setLayout(new java.awt.GridLayout(5, 1));

	deviceField2.setIdentifier("");
	deviceField2.setLabelString("Comment: ");
	deviceField2.setNumCols(40);
	deviceField2.setOffsetNid(2);
	deviceField2.setTextOnly(true);
	jPanel2.add(deviceField2);

	deviceField1.setIdentifier("");
	deviceField1.setLabelString("Board Id: ");
	deviceField1.setNumCols(4);
	deviceField1.setOffsetNid(1);
	jPanel2.add(deviceField1);
	jPanel2.add(deviceDispatch1);

	jPanel1.add(jPanel2);

	deviceChoice51.setChoiceItems(new String[] {"TRANSIENT REC.", "CONTINUOUS"});
	deviceChoice51.setIdentifier("");
	deviceChoice51.setLabelString("Acq. Mode: ");
	deviceChoice51.setOffsetNid(9);
	deviceChoice51.setUpdateIdentifier("");
	jPanel3.add(deviceChoice51);

	deviceField3.setIdentifier("");
	deviceField3.setLabelString("Buf. Size (Bytes): ");
	deviceField3.setOffsetNid(6);
	jPanel3.add(deviceField3);

	deviceField4.setIdentifier("");
	deviceField4.setLabelString("Segment Size (Bytes): ");
	deviceField4.setOffsetNid(7);
	jPanel3.add(deviceField4);

	jPanel1.add(jPanel3);

	deviceChoice4.setChoiceItems(new String[] {"INTERNAL", "EXTERNAL"});
	deviceChoice4.setIdentifier("");
	deviceChoice4.setLabelString("Clock Mode: ");
	deviceChoice4.setOffsetNid(4);
	deviceChoice4.setUpdateIdentifier("");
	jPanel4.add(deviceChoice4);

	deviceField5.setIdentifier("");
	deviceField5.setLabelString("Frequency (Hz): ");
	deviceField5.setOffsetNid(5);
	jPanel4.add(deviceField5);

	deviceField6.setIdentifier("");
	deviceField6.setLabelString("Ext. Clock: ");
	deviceField6.setNumCols(30);
	deviceField6.setOffsetNid(8);
	jPanel4.add(deviceField6);

	jPanel1.add(jPanel4);

	deviceChoice2.setChoiceItems(new String[] {"INTERNAL", "EXTERNAL"});
	deviceChoice2.setIdentifier("");
	deviceChoice2.setLabelString("Trigger Mode: ");
	deviceChoice2.setOffsetNid(10);
	deviceChoice2.setUpdateIdentifier("");
	jPanel5.add(deviceChoice2);

	deviceField11.setIdentifier("");
	deviceField11.setLabelString("Ext. Trigger: ");
	deviceField11.setNumCols(30);
	deviceField11.setOffsetNid(11);
	jPanel5.add(deviceField11);

	jPanel1.add(jPanel5);

	deviceChoice52.setChoiceItems(new String[] {"YES", "NO"});
	deviceChoice52.setIdentifier("");
	deviceChoice52.setLabelString("Use Time: ");
	deviceChoice52.setOffsetNid(12);
	deviceChoice52.setUpdateIdentifier("");
	jPanel6.add(deviceChoice52);

	deviceField7.setIdentifier("");
	deviceField7.setLabelString("Start Time (s): ");
	deviceField7.setNumCols(8);
	deviceField7.setOffsetNid(13);
	jPanel6.add(deviceField7);

	deviceField8.setIdentifier("");
	deviceField8.setLabelString("End Time (s): ");
	deviceField8.setNumCols(8);
	deviceField8.setOffsetNid(14);
	jPanel6.add(deviceField8);

	deviceField9.setIdentifier("");
	deviceField9.setLabelString("Start Idx: ");
	deviceField9.setNumCols(8);
	deviceField9.setOffsetNid(15);
	jPanel6.add(deviceField9);

	deviceField10.setIdentifier("");
	deviceField10.setLabelString("End Idx:");
	deviceField10.setNumCols(8);
	deviceField10.setOffsetNid(16);
	jPanel6.add(deviceField10);

	jPanel1.add(jPanel6);

	getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

	jPanel39.setLayout(new java.awt.GridLayout(8, 2));

	jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Channel 1"));
	jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

	deviceChoice3.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
	deviceChoice3.setIdentifier("");
	deviceChoice3.setLabelString("State: ");
	deviceChoice3.setOffsetNid(18);
	deviceChoice3.setUpdateIdentifier("");
	jPanel7.add(deviceChoice3);

	deviceChoice5.setChoiceFloatValues(new float[] {10.0f, 5.0f, 2.0f, 1.0f});
	deviceChoice5.setChoiceItems(new String[] {"10.", "5.", "2.", "1."});
	deviceChoice5.setIdentifier("");
	deviceChoice5.setLabelString("Range: +/-");
	deviceChoice5.setOffsetNid(19);
	deviceChoice5.setUpdateIdentifier("");
	jPanel7.add(deviceChoice5);

	jLabel1.setText("V");
	jPanel7.add(jLabel1);

	jPanel39.add(jPanel7);

	jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Channel 2"));
	jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

	deviceChoice6.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
	deviceChoice6.setIdentifier("");
	deviceChoice6.setLabelString("State: ");
	deviceChoice6.setOffsetNid(24);
	deviceChoice6.setUpdateIdentifier("");
	jPanel8.add(deviceChoice6);

	deviceChoice17.setChoiceFloatValues(new float[] {10.0f, 5.0f, 2.0f, 1.0f});
	deviceChoice17.setChoiceItems(new String[] {"10.", "5.", "2.", "1."});
	deviceChoice17.setIdentifier("");
	deviceChoice17.setLabelString("Range: +/-");
	deviceChoice17.setOffsetNid(25);
	deviceChoice17.setUpdateIdentifier("");
	jPanel8.add(deviceChoice17);

	jLabel9.setText("V");
	jPanel8.add(jLabel9);

	jPanel39.add(jPanel8);

	jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Channel 3"));

	deviceChoice9.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
	deviceChoice9.setIdentifier("");
	deviceChoice9.setLabelString("State: ");
	deviceChoice9.setOffsetNid(30);
	deviceChoice9.setUpdateIdentifier("");
	jPanel9.add(deviceChoice9);

	deviceChoice7.setChoiceFloatValues(new float[] {10.0f, 5.0f, 2.0f, 1.0f});
	deviceChoice7.setChoiceItems(new String[] {"10.", "5.", "2.", "1."});
	deviceChoice7.setIdentifier("");
	deviceChoice7.setLabelString("Range: +/-");
	deviceChoice7.setOffsetNid(31);
	deviceChoice7.setUpdateIdentifier("");
	jPanel9.add(deviceChoice7);

	jLabel2.setText("V");
	jPanel9.add(jLabel2);

	jPanel39.add(jPanel9);

	jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Channel 4"));

	deviceChoice12.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
	deviceChoice12.setIdentifier("");
	deviceChoice12.setLabelString("State: ");
	deviceChoice12.setOffsetNid(36);
	deviceChoice12.setUpdateIdentifier("");
	jPanel10.add(deviceChoice12);

	deviceChoice19.setChoiceFloatValues(new float[] {10.0f, 5.0f, 2.0f, 1.0f});
	deviceChoice19.setChoiceItems(new String[] {"10.", "5.", "2.", "1."});
	deviceChoice19.setIdentifier("");
	deviceChoice19.setLabelString("Range: +/-");
	deviceChoice19.setOffsetNid(37);
	deviceChoice19.setUpdateIdentifier("");
	jPanel10.add(deviceChoice19);

	jLabel10.setText("V");
	jPanel10.add(jLabel10);

	jPanel39.add(jPanel10);

	jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Channel 5"));

	deviceChoice15.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
	deviceChoice15.setIdentifier("");
	deviceChoice15.setLabelString("State: ");
	deviceChoice15.setOffsetNid(42);
	deviceChoice15.setUpdateIdentifier("");
	jPanel11.add(deviceChoice15);

	deviceChoice8.setChoiceFloatValues(new float[] {10.0f, 5.0f, 2.0f, 1.0f});
	deviceChoice8.setChoiceItems(new String[] {"10.", "5.", "2.", "1."});
	deviceChoice8.setIdentifier("");
	deviceChoice8.setLabelString("Range: +/-");
	deviceChoice8.setOffsetNid(43);
	deviceChoice8.setUpdateIdentifier("");
	jPanel11.add(deviceChoice8);

	jLabel3.setText("V");
	jPanel11.add(jLabel3);

	jPanel39.add(jPanel11);

	jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Channel 6"));

	deviceChoice18.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
	deviceChoice18.setIdentifier("");
	deviceChoice18.setLabelString("State: ");
	deviceChoice18.setOffsetNid(48);
	deviceChoice18.setUpdateIdentifier("");
	jPanel12.add(deviceChoice18);

	deviceChoice20.setChoiceFloatValues(new float[] {10.0f, 5.0f, 2.0f, 1.0f});
	deviceChoice20.setChoiceItems(new String[] {"10.", "5.", "2.", "1."});
	deviceChoice20.setIdentifier("");
	deviceChoice20.setLabelString("Range: +/-");
	deviceChoice20.setOffsetNid(49);
	deviceChoice20.setUpdateIdentifier("");
	jPanel12.add(deviceChoice20);

	jLabel11.setText("V");
	jPanel12.add(jLabel11);

	jPanel39.add(jPanel12);

	jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Channel 7"));

	deviceChoice21.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
	deviceChoice21.setIdentifier("");
	deviceChoice21.setLabelString("State: ");
	deviceChoice21.setOffsetNid(54);
	deviceChoice21.setUpdateIdentifier("");
	jPanel13.add(deviceChoice21);

	deviceChoice10.setChoiceFloatValues(new float[] {10.0f, 5.0f, 2.0f, 1.0f});
	deviceChoice10.setChoiceItems(new String[] {"10.", "5.", "2.", "1."});
	deviceChoice10.setIdentifier("");
	deviceChoice10.setLabelString("Range: +/-");
	deviceChoice10.setOffsetNid(55);
	deviceChoice10.setUpdateIdentifier("");
	jPanel13.add(deviceChoice10);

	jLabel4.setText("V");
	jPanel13.add(jLabel4);

	jPanel39.add(jPanel13);

	jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("Channel 8"));

	deviceChoice24.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
	deviceChoice24.setIdentifier("");
	deviceChoice24.setLabelString("State: ");
	deviceChoice24.setOffsetNid(60);
	deviceChoice24.setUpdateIdentifier("");
	jPanel14.add(deviceChoice24);

	deviceChoice22.setChoiceFloatValues(new float[] {10.0f, 5.0f, 2.0f, 1.0f});
	deviceChoice22.setChoiceItems(new String[] {"10.", "5.", "2.", "1."});
	deviceChoice22.setIdentifier("");
	deviceChoice22.setLabelString("Range: +/-");
	deviceChoice22.setOffsetNid(51);
	deviceChoice22.setUpdateIdentifier("");
	jPanel14.add(deviceChoice22);

	jLabel12.setText("V");
	jPanel14.add(jLabel12);

	jPanel39.add(jPanel14);

	jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Channel 9"));

	deviceChoice27.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
	deviceChoice27.setIdentifier("");
	deviceChoice27.setLabelString("State: ");
	deviceChoice27.setOffsetNid(66);
	deviceChoice27.setUpdateIdentifier("");
	jPanel15.add(deviceChoice27);

	deviceChoice11.setChoiceFloatValues(new float[] {10.0f, 5.0f, 2.0f, 1.0f});
	deviceChoice11.setChoiceItems(new String[] {"10.", "5.", "2.", "1."});
	deviceChoice11.setIdentifier("");
	deviceChoice11.setLabelString("Range: +/-");
	deviceChoice11.setOffsetNid(67);
	deviceChoice11.setUpdateIdentifier("");
	jPanel15.add(deviceChoice11);

	jLabel5.setText("V");
	jPanel15.add(jLabel5);

	jPanel39.add(jPanel15);

	jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Channel 10"));

	deviceChoice30.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
	deviceChoice30.setIdentifier("");
	deviceChoice30.setLabelString("State: ");
	deviceChoice30.setOffsetNid(72);
	deviceChoice30.setUpdateIdentifier("");
	jPanel16.add(deviceChoice30);

	deviceChoice23.setChoiceFloatValues(new float[] {10.0f, 5.0f, 2.0f, 1.0f});
	deviceChoice23.setChoiceItems(new String[] {"10.", "5.", "2.", "1."});
	deviceChoice23.setIdentifier("");
	deviceChoice23.setLabelString("Range: +/-");
	deviceChoice23.setOffsetNid(73);
	deviceChoice23.setUpdateIdentifier("");
	jPanel16.add(deviceChoice23);

	jLabel13.setText("V");
	jPanel16.add(jLabel13);

	jPanel39.add(jPanel16);

	jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder("Channel 11"));

	deviceChoice33.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
	deviceChoice33.setIdentifier("");
	deviceChoice33.setLabelString("State: ");
	deviceChoice33.setOffsetNid(78);
	deviceChoice33.setUpdateIdentifier("");
	jPanel17.add(deviceChoice33);

	deviceChoice13.setChoiceFloatValues(new float[] {10.0f, 5.0f, 2.0f, 1.0f});
	deviceChoice13.setChoiceItems(new String[] {"10.", "5.", "2.", "1."});
	deviceChoice13.setIdentifier("");
	deviceChoice13.setLabelString("Range: +/-");
	deviceChoice13.setOffsetNid(79);
	deviceChoice13.setUpdateIdentifier("");
	jPanel17.add(deviceChoice13);

	jLabel6.setText("V");
	jPanel17.add(jLabel6);

	jPanel39.add(jPanel17);

	jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Channel 12"));

	deviceChoice36.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
	deviceChoice36.setIdentifier("");
	deviceChoice36.setLabelString("State: ");
	deviceChoice36.setOffsetNid(84);
	deviceChoice36.setUpdateIdentifier("");
	jPanel18.add(deviceChoice36);

	deviceChoice25.setChoiceFloatValues(new float[] {10.0f, 5.0f, 2.0f, 1.0f});
	deviceChoice25.setChoiceItems(new String[] {"10.", "5.", "2.", "1."});
	deviceChoice25.setIdentifier("");
	deviceChoice25.setLabelString("Range: +/-");
	deviceChoice25.setOffsetNid(85);
	deviceChoice25.setUpdateIdentifier("");
	jPanel18.add(deviceChoice25);

	jLabel14.setText("V");
	jPanel18.add(jLabel14);

	jPanel39.add(jPanel18);

	jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder("Channel 13"));

	deviceChoice39.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
	deviceChoice39.setIdentifier("");
	deviceChoice39.setLabelString("State: ");
	deviceChoice39.setOffsetNid(90);
	deviceChoice39.setUpdateIdentifier("");
	jPanel19.add(deviceChoice39);

	deviceChoice14.setChoiceFloatValues(new float[] {10.0f, 5.0f, 2.0f, 1.0f});
	deviceChoice14.setChoiceItems(new String[] {"10.", "5.", "2.", "1."});
	deviceChoice14.setIdentifier("");
	deviceChoice14.setLabelString("Range: +/-");
	deviceChoice14.setOffsetNid(91);
	deviceChoice14.setUpdateIdentifier("");
	jPanel19.add(deviceChoice14);

	jLabel7.setText("V");
	jPanel19.add(jLabel7);

	jPanel39.add(jPanel19);

	jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Channel 14"));

	deviceChoice42.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
	deviceChoice42.setIdentifier("");
	deviceChoice42.setLabelString("State: ");
	deviceChoice42.setOffsetNid(96);
	deviceChoice42.setUpdateIdentifier("");
	jPanel20.add(deviceChoice42);

	deviceChoice26.setChoiceFloatValues(new float[] {10.0f, 5.0f, 2.0f, 1.0f});
	deviceChoice26.setChoiceItems(new String[] {"10.", "5.", "2.", "1."});
	deviceChoice26.setIdentifier("");
	deviceChoice26.setLabelString("Range: +/-");
	deviceChoice26.setOffsetNid(97);
	deviceChoice26.setUpdateIdentifier("");
	jPanel20.add(deviceChoice26);

	jLabel15.setText("V");
	jPanel20.add(jLabel15);

	jPanel39.add(jPanel20);

	jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder("Channel 15"));

	deviceChoice45.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
	deviceChoice45.setIdentifier("");
	deviceChoice45.setLabelString("State: ");
	deviceChoice45.setOffsetNid(102);
	deviceChoice45.setUpdateIdentifier("");
	jPanel21.add(deviceChoice45);

	deviceChoice16.setChoiceFloatValues(new float[] {10.0f, 5.0f, 2.0f, 1.0f});
	deviceChoice16.setChoiceItems(new String[] {"10.", "5.", "2.", "1."});
	deviceChoice16.setIdentifier("");
	deviceChoice16.setLabelString("Range: +/-");
	deviceChoice16.setOffsetNid(103);
	deviceChoice16.setUpdateIdentifier("");
	jPanel21.add(deviceChoice16);

	jLabel8.setText("V");
	jPanel21.add(jLabel8);

	jPanel39.add(jPanel21);

	jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder("Channel 16"));

	deviceChoice48.setChoiceItems(new String[] {"ENABLED", "DISABLED"});
	deviceChoice48.setIdentifier("");
	deviceChoice48.setLabelString("State: ");
	deviceChoice48.setOffsetNid(108);
	deviceChoice48.setUpdateIdentifier("");
	jPanel22.add(deviceChoice48);

	deviceChoice28.setChoiceFloatValues(new float[] {10.0f, 5.0f, 2.0f, 1.0f});
	deviceChoice28.setChoiceItems(new String[] {"10.", "5.", "2.", "1."});
	deviceChoice28.setIdentifier("");
	deviceChoice28.setLabelString("Range: +/-");
	deviceChoice28.setOffsetNid(109);
	deviceChoice28.setUpdateIdentifier("");
	jPanel22.add(deviceChoice28);

	jLabel16.setText("V");
	jPanel22.add(jLabel16);

	jPanel39.add(jPanel22);

	jScrollPane1.setViewportView(jPanel39);

	getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DeviceButtons deviceButtons1;
    private DeviceChoice deviceChoice10;
    private DeviceChoice deviceChoice11;
    private DeviceChoice deviceChoice12;
    private DeviceChoice deviceChoice13;
    private DeviceChoice deviceChoice14;
    private DeviceChoice deviceChoice15;
    private DeviceChoice deviceChoice16;
    private DeviceChoice deviceChoice17;
    private DeviceChoice deviceChoice18;
    private DeviceChoice deviceChoice19;
    private DeviceChoice deviceChoice2;
    private DeviceChoice deviceChoice20;
    private DeviceChoice deviceChoice21;
    private DeviceChoice deviceChoice22;
    private DeviceChoice deviceChoice23;
    private DeviceChoice deviceChoice24;
    private DeviceChoice deviceChoice25;
    private DeviceChoice deviceChoice26;
    private DeviceChoice deviceChoice27;
    private DeviceChoice deviceChoice28;
    private DeviceChoice deviceChoice3;
    private DeviceChoice deviceChoice30;
    private DeviceChoice deviceChoice33;
    private DeviceChoice deviceChoice36;
    private DeviceChoice deviceChoice39;
    private DeviceChoice deviceChoice4;
    private DeviceChoice deviceChoice42;
    private DeviceChoice deviceChoice45;
    private DeviceChoice deviceChoice48;
    private DeviceChoice deviceChoice5;
    private DeviceChoice deviceChoice51;
    private DeviceChoice deviceChoice52;
    private DeviceChoice deviceChoice6;
    private DeviceChoice deviceChoice7;
    private DeviceChoice deviceChoice8;
    private DeviceChoice deviceChoice9;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables



}

