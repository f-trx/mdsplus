/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RFXPoloidalSetup.java
 *
 * Created on 17-Jan-2014, 16:27:50
 */

/**
 *
 * @author taliercio
 */
public class RFXPoloidalSetup extends DeviceSetup {

    /** Creates new form RFXPoloidalSetup */
    public RFXPoloidalSetup() {
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
	jPanel21 = new javax.swing.JPanel();
	deviceField1 = new DeviceField();
	jPanel5 = new javax.swing.JPanel();
	deviceField2 = new DeviceField();
	deviceField6 = new DeviceField();
	deviceField7 = new DeviceField();
	deviceField8 = new DeviceField();
	jPanel6 = new javax.swing.JPanel();
	deviceField3 = new DeviceField();
	deviceField9 = new DeviceField();
	deviceField10 = new DeviceField();
	deviceField11 = new DeviceField();
	jPanel7 = new javax.swing.JPanel();
	deviceField4 = new DeviceField();
	deviceField12 = new DeviceField();
	deviceField13 = new DeviceField();
	deviceField14 = new DeviceField();
	jPanel8 = new javax.swing.JPanel();
	deviceField5 = new DeviceField();
	deviceField15 = new DeviceField();
	deviceField16 = new DeviceField();
	deviceField17 = new DeviceField();
	jPanel3 = new javax.swing.JPanel();
	jPanel9 = new javax.swing.JPanel();
	jPanel11 = new javax.swing.JPanel();
	deviceField18 = new DeviceField();
	deviceField19 = new DeviceField();
	deviceField20 = new DeviceField();
	deviceField21 = new DeviceField();
	jPanel12 = new javax.swing.JPanel();
	deviceField22 = new DeviceField();
	deviceField23 = new DeviceField();
	deviceField24 = new DeviceField();
	deviceField25 = new DeviceField();
	jPanel10 = new javax.swing.JPanel();
	jPanel15 = new javax.swing.JPanel();
	jLabel1 = new javax.swing.JLabel();
	deviceLabel1 = new DeviceLabel();
	jPanel16 = new javax.swing.JPanel();
	jLabel2 = new javax.swing.JLabel();
	deviceLabel2 = new DeviceLabel();
	jLabel3 = new javax.swing.JLabel();
	deviceLabel3 = new DeviceLabel();
	jPanel4 = new javax.swing.JPanel();
	jPanel13 = new javax.swing.JPanel();
	jPanel17 = new javax.swing.JPanel();
	jLabel4 = new javax.swing.JLabel();
	deviceLabel4 = new DeviceLabel();
	jPanel18 = new javax.swing.JPanel();
	jLabel5 = new javax.swing.JLabel();
	deviceLabel5 = new DeviceLabel();
	jLabel6 = new javax.swing.JLabel();
	deviceLabel6 = new DeviceLabel();
	jPanel14 = new javax.swing.JPanel();
	jPanel19 = new javax.swing.JPanel();
	jLabel7 = new javax.swing.JLabel();
	deviceLabel7 = new DeviceLabel();
	jPanel20 = new javax.swing.JPanel();
	jLabel8 = new javax.swing.JLabel();
	deviceLabel8 = new DeviceLabel();
	jLabel9 = new javax.swing.JLabel();
	deviceLabel9 = new DeviceLabel();

	setDeviceProvider("localhost");
	setDeviceTitle("RFX Poloidal Configuration");
	setDeviceType("RFXPoloidal");
	setHeight(600);
	setWidth(900);
	getContentPane().add(deviceButtons1, java.awt.BorderLayout.SOUTH);

	jPanel1.setLayout(new java.awt.GridLayout(3, 0));

	jPanel2.setLayout(new java.awt.GridLayout(5, 0));

	deviceField1.setIdentifier("");
	deviceField1.setLabelString("Comment:");
	deviceField1.setNumCols(50);
	deviceField1.setOffsetNid(1);
	jPanel21.add(deviceField1);

	jPanel2.add(jPanel21);

	jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

	deviceField2.setIdentifier("");
	deviceField2.setLabelString("Transfer R1 (Ohm):");
	deviceField2.setOffsetNid(20);
	jPanel5.add(deviceField2);

	deviceField6.setIdentifier("");
	deviceField6.setLabelString("RA1 (Ohm):");
	deviceField6.setOffsetNid(22);
	jPanel5.add(deviceField6);

	deviceField7.setIdentifier("");
	deviceField7.setLabelString("RB1 (Ohm):");
	deviceField7.setOffsetNid(23);
	jPanel5.add(deviceField7);

	deviceField8.setIdentifier("");
	deviceField8.setLabelString("RF1 (Ohm):");
	deviceField8.setOffsetNid(24);
	jPanel5.add(deviceField8);

	jPanel2.add(jPanel5);

	jPanel6.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

	deviceField3.setIdentifier("");
	deviceField3.setLabelString("Transfer R2 (Ohm):");
	deviceField3.setOffsetNid(25);
	jPanel6.add(deviceField3);

	deviceField9.setIdentifier("");
	deviceField9.setLabelString("RA2 (Ohm):");
	deviceField9.setOffsetNid(26);
	jPanel6.add(deviceField9);

	deviceField10.setIdentifier("");
	deviceField10.setLabelString("RB2 (Ohm):");
	deviceField10.setOffsetNid(27);
	jPanel6.add(deviceField10);

	deviceField11.setIdentifier("");
	deviceField11.setLabelString("RF2 (Ohm):");
	deviceField11.setOffsetNid(28);
	jPanel6.add(deviceField11);

	jPanel2.add(jPanel6);

	jPanel7.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

	deviceField4.setIdentifier("");
	deviceField4.setLabelString("Transfer R3 (Ohm):");
	deviceField4.setOffsetNid(29);
	jPanel7.add(deviceField4);

	deviceField12.setIdentifier("");
	deviceField12.setLabelString("RA3 (Ohm):");
	deviceField12.setOffsetNid(30);
	jPanel7.add(deviceField12);

	deviceField13.setIdentifier("");
	deviceField13.setLabelString("RB3 (Ohm):");
	deviceField13.setOffsetNid(31);
	jPanel7.add(deviceField13);

	deviceField14.setIdentifier("");
	deviceField14.setLabelString("RF3 (Ohm):");
	deviceField14.setOffsetNid(32);
	jPanel7.add(deviceField14);

	jPanel2.add(jPanel7);

	jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

	deviceField5.setIdentifier("");
	deviceField5.setLabelString("Transfer R4 (Ohm):");
	deviceField5.setOffsetNid(33);
	jPanel8.add(deviceField5);

	deviceField15.setIdentifier("");
	deviceField15.setLabelString("RA4 (Ohm):");
	deviceField15.setOffsetNid(34);
	jPanel8.add(deviceField15);

	deviceField16.setIdentifier("");
	deviceField16.setLabelString("RB4 (Ohm):");
	deviceField16.setOffsetNid(35);
	jPanel8.add(deviceField16);

	deviceField17.setIdentifier("");
	deviceField17.setLabelString("RF4 (Ohm):");
	deviceField17.setOffsetNid(36);
	jPanel8.add(deviceField17);

	jPanel2.add(jPanel8);

	jPanel1.add(jPanel2);

	jPanel3.setLayout(new java.awt.GridLayout(2, 0));

	jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Bobine F"));
	jPanel9.setLayout(new java.awt.GridLayout(2, 0));

	jPanel11.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

	deviceField18.setIdentifier("");
	deviceField18.setLabelString(" RF1 (Ohm):");
	deviceField18.setOffsetNid(37);
	jPanel11.add(deviceField18);

	deviceField19.setIdentifier("");
	deviceField19.setLabelString("RF2 (Ohm):");
	deviceField19.setOffsetNid(38);
	jPanel11.add(deviceField19);

	deviceField20.setIdentifier("");
	deviceField20.setLabelString("RF3 (Ohm):");
	deviceField20.setOffsetNid(39);
	jPanel11.add(deviceField20);

	deviceField21.setIdentifier("");
	deviceField21.setLabelString("RF4 (Ohm):");
	deviceField21.setOffsetNid(40);
	jPanel11.add(deviceField21);

	jPanel9.add(jPanel11);

	jPanel12.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 0));

	deviceField22.setIdentifier("");
	deviceField22.setLabelString("RF5 (Ohm):");
	deviceField22.setOffsetNid(41);
	jPanel12.add(deviceField22);

	deviceField23.setIdentifier("");
	deviceField23.setLabelString("RF6 (Ohm):");
	deviceField23.setOffsetNid(42);
	jPanel12.add(deviceField23);

	deviceField24.setIdentifier("");
	deviceField24.setLabelString("RF7 (Ohm):");
	deviceField24.setOffsetNid(43);
	jPanel12.add(deviceField24);

	deviceField25.setIdentifier("");
	deviceField25.setLabelString("RF8 (Ohm):");
	deviceField25.setOffsetNid(44);
	jPanel12.add(deviceField25);

	jPanel9.add(jPanel12);

	jPanel3.add(jPanel9);

	jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("PM"));
	jPanel10.setLayout(new java.awt.GridLayout(2, 0));

	jLabel1.setText("PM Units :");
	jPanel15.add(jLabel1);

	deviceLabel1.setIdentifier("");
	deviceLabel1.setLabelString("PM Units : ");
	deviceLabel1.setOffsetNid(5);
	jPanel15.add(deviceLabel1);

	jPanel10.add(jPanel15);

	jLabel2.setText("PM Connection :");
	jPanel16.add(jLabel2);

	deviceLabel2.setIdentifier("");
	deviceLabel2.setLabelString("PM Connection");
	deviceLabel2.setOffsetNid(6);
	jPanel16.add(deviceLabel2);

	jLabel3.setText("PM Window :");
	jPanel16.add(jLabel3);

	deviceLabel3.setIdentifier("");
	deviceLabel3.setLabelString("PM Window : ");
	deviceLabel3.setOffsetNid(9);
	jPanel16.add(deviceLabel3);

	jPanel10.add(jPanel16);

	jPanel3.add(jPanel10);

	jPanel1.add(jPanel3);

	jPanel4.setLayout(new java.awt.GridLayout(2, 0));

	jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("PC"));
	jPanel13.setLayout(new java.awt.GridLayout(2, 0));

	jLabel4.setText("PC Units :");
	jPanel17.add(jLabel4);

	deviceLabel4.setIdentifier("");
	deviceLabel4.setLabelString("PC Units : ");
	deviceLabel4.setOffsetNid(10);
	jPanel17.add(deviceLabel4);

	jPanel13.add(jPanel17);

	jLabel5.setText("PC Connection :");
	jPanel18.add(jLabel5);

	deviceLabel5.setIdentifier("");
	deviceLabel5.setLabelString("PC Connection : ");
	deviceLabel5.setOffsetNid(11);
	jPanel18.add(deviceLabel5);

	jLabel6.setText("PC Window :");
	jPanel18.add(jLabel6);

	deviceLabel6.setIdentifier("");
	deviceLabel6.setLabelString("PC Window :");
	deviceLabel6.setOffsetNid(14);
	jPanel18.add(deviceLabel6);

	jPanel13.add(jPanel18);

	jPanel4.add(jPanel13);

	jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder("PV"));
	jPanel14.setLayout(new java.awt.GridLayout(2, 0));

	jLabel7.setText("PV Units :");
	jPanel19.add(jLabel7);

	deviceLabel7.setIdentifier("");
	deviceLabel7.setLabelString("PV Units : ");
	deviceLabel7.setOffsetNid(15);
	jPanel19.add(deviceLabel7);

	jPanel14.add(jPanel19);

	jLabel8.setText("PV Connection :");
	jPanel20.add(jLabel8);

	deviceLabel8.setIdentifier("");
	deviceLabel8.setLabelString("PV Connection : ");
	deviceLabel8.setOffsetNid(16);
	jPanel20.add(deviceLabel8);

	jLabel9.setText("PV Window :");
	jPanel20.add(jLabel9);

	deviceLabel9.setIdentifier("");
	deviceLabel9.setLabelString("PV Window : ");
	deviceLabel9.setOffsetNid(19);
	jPanel20.add(deviceLabel9);

	jPanel14.add(jPanel20);

	jPanel4.add(jPanel14);

	jPanel1.add(jPanel4);

	getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DeviceButtons deviceButtons1;
    private DeviceField deviceField1;
    private DeviceField deviceField10;
    private DeviceField deviceField11;
    private DeviceField deviceField12;
    private DeviceField deviceField13;
    private DeviceField deviceField14;
    private DeviceField deviceField15;
    private DeviceField deviceField16;
    private DeviceField deviceField17;
    private DeviceField deviceField18;
    private DeviceField deviceField19;
    private DeviceField deviceField2;
    private DeviceField deviceField20;
    private DeviceField deviceField21;
    private DeviceField deviceField22;
    private DeviceField deviceField23;
    private DeviceField deviceField24;
    private DeviceField deviceField25;
    private DeviceField deviceField3;
    private DeviceField deviceField4;
    private DeviceField deviceField5;
    private DeviceField deviceField6;
    private DeviceField deviceField7;
    private DeviceField deviceField8;
    private DeviceField deviceField9;
    private DeviceLabel deviceLabel1;
    private DeviceLabel deviceLabel2;
    private DeviceLabel deviceLabel3;
    private DeviceLabel deviceLabel4;
    private DeviceLabel deviceLabel5;
    private DeviceLabel deviceLabel6;
    private DeviceLabel deviceLabel7;
    private DeviceLabel deviceLabel8;
    private DeviceLabel deviceLabel9;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables

}
