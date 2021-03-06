/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabAssistantRole;

import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import javax.swing.JPanel;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author raunak
 */
public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    LabTestWorkRequest request;
    private String others;

    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, LabTestWorkRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        populatelabels();

    }

    public void populatelabels() {

        jLabel2.setVisible(false);
        gluJComboBox.setVisible(false);
        jLabel3.setVisible(false);
        vitaJComboBox1.setVisible(false);
        jLabel4.setVisible(false);
        BloodJComboBox.setVisible(false);
        jLabel5.setVisible(false);
        OtherJComboBox.setVisible(false);
        System.out.println("Test Array in lab procewss" + request.getTests());
        for (String s : request.getTests()) {

            if (s.equalsIgnoreCase("Blood Glucose Test")) {
                jLabel2.setVisible(true);
                gluJComboBox.setVisible(true);

            }
            if (s.equalsIgnoreCase("Full Blood Count Test")) {
                jLabel4.setVisible(true);
                BloodJComboBox.setVisible(true);
            }
            if (s.equalsIgnoreCase("Vitamins Test")) {
                jLabel3.setVisible(true);
                vitaJComboBox1.setVisible(true);
            }
            if (!(s.equalsIgnoreCase("Full Blood Count Test") || s.equalsIgnoreCase("Vitamins Test") || s.equalsIgnoreCase("Full Blood Count Test"))) {
                jLabel5.setVisible(true);
                jLabel5.setText(s);
                OtherJComboBox.setVisible(true);
                others = s;

            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        resultJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gluJComboBox = new javax.swing.JComboBox();
        vitaJComboBox1 = new javax.swing.JComboBox();
        BloodJComboBox = new javax.swing.JComboBox();
        OtherJComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitJButton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(4, 65, 96));
        submitJButton.setText("Generate Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 210, -1));
        add(resultJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 80, -1));

        backJButton.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        backJButton.setForeground(new java.awt.Color(4, 65, 96));
        backJButton.setText("Return");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 140, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(4, 65, 96));
        jLabel1.setText("Result:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 80, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(4, 65, 96));
        jLabel2.setText("Glucose Levels:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 160, 20));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(4, 65, 96));
        jLabel3.setText("Vitamin:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 90, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(4, 65, 96));
        jLabel4.setText("Blood Count:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 140, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(4, 65, 96));
        jLabel5.setText("Other Test:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 120, -1));

        gluJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Normal ", "Abnormal" }));
        add(gluJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 81, -1));

        vitaJComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Normal ", "Abnormal" }));
        vitaJComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vitaJComboBox1ActionPerformed(evt);
            }
        });
        add(vitaJComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 81, -1));

        BloodJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Normal ", "Abnormal" }));
        BloodJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodJComboBoxActionPerformed(evt);
            }
        });
        add(BloodJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 81, -1));

        OtherJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Normal ", "Abnormal" }));
        OtherJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherJComboBoxActionPerformed(evt);
            }
        });
        add(OtherJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 81, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/LabAssistantRole/report.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 570, 790));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabAssistantWorkAreaJPanel dwjp = (LabAssistantWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        request.setTestResult(resultJTextField.getText());
        request.setStatus("Completed");
        request.setResolveDate(new Date());
//        request.setMessage();
        String glures = gluJComboBox.getSelectedItem().toString();
        String vita = vitaJComboBox1.getSelectedItem().toString();
        String blood = BloodJComboBox.getSelectedItem().toString();
        String other = OtherJComboBox.getSelectedItem().toString();

//        Writer writer = null;
        
        StringBuilder detailedReport = new StringBuilder("====== START OF REPORT =========" + "\n"
                    + "Patient Name: " + request.getPatientAccount().getEmployee().getName() + "\n"
                    + "Date: " + new Date() + "\n"
                    + "Age: " + request.getPatientAccount().getAge() + "\n"
                    + "Sex: " + request.getPatientAccount().getSex() + "\n"
                    + "Doctor Name: " + request.getSender() + "\n"
                    + "\n"
                    + "==============================="
                    + "\n"
                    + "TEST RESULT" + "\n"
                    + "==============================="
                    + "\n"+ "\n" );
        
            if (!glures.equals("-")) {
                detailedReport.append("Glucose Levels: " + glures + "\n");
            }
            if (!vita.equals("-")) {
                detailedReport.append("Vitamins: " + vita + "\n");
            }
            if (!blood.equals("-")) {
                detailedReport.append("Blood Count: " + blood + "\n");
            }
            if (!other.equals("-")) {
                detailedReport.append(others + ": " + other + "\n");
            }
            detailedReport.append("\n" + "\n" + "====== END OF REPORT ==========");
            
            request.setDetailedReported(detailedReport);
            

//        try {
//
//            writer = new BufferedWriter(new OutputStreamWriter(
//                    new FileOutputStream(((LabTestWorkRequest) request).getPatientAccount().getUsername() + ".txt"), "utf-8"));
////            Date todaysDate = new Date()   ;     
//            writer.write(
//                    "====== START OF REPORT =========" + "\n"
////                    + "Patient ID: " + request.getPatient_id() + "\n"
//                    + "Patient Name: " + request.getPatientAccount().getEmployee().getName() + "\n"
//                    + "Date: " + new Date() + "\n"
//                    + "Age: " + request.getPatientAccount().getAge() + "\n"
//                    + "Sex: " + request.getPatientAccount().getSex() + "\n"
//                    + "Doctor Name: " + request.getSender() + "\n"
//                    + "\n"
//                    + "==============================="
//                    + "\n"
//                    + "TEST RESULT" + "\n"
//                    + "==============================="
//                    + "\n"+ "\n");
//            if (!glures.equals("-")) {
//                writer.write("Glucose Levels: " + glures + "\n");
//            }
//            if (!vita.equals("-")) {
//                writer.write("Vitamins: " + vita + "\n");
//            }
//            if (!blood.equals("-")) {
//                writer.write("Blood Count: " + blood + "\n");
//            }
//            if (!other.equals("-")) {
//                writer.write(others + ": " + other + "\n");
//            }
//            writer.write("\n" + "\n" + "====== END OF REPORT ==========");
////          
//            //writer.write("Something");
//        } catch (IOException ex) {
//            // Report
//        } finally {
//            try {
//                writer.close();
//            } catch (Exception ex) {/*ignore*/
//            }
//        }
//        request.setFile_name((((LabTestWorkRequest) request).getPatientAccount().getUsername() + ".txt"));
        JOptionPane.showMessageDialog(null,"Report has been generated");
        backJButtonActionPerformed(evt);


    }//GEN-LAST:event_submitJButtonActionPerformed

    private void BloodJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloodJComboBoxActionPerformed

    private void OtherJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OtherJComboBoxActionPerformed

    private void vitaJComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vitaJComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vitaJComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox BloodJComboBox;
    private javax.swing.JComboBox OtherJComboBox;
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox gluJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JComboBox vitaJComboBox1;
    // End of variables declaration//GEN-END:variables
}
