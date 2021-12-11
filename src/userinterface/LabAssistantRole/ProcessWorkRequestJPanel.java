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
        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        gluJComboBox = new javax.swing.JComboBox();
        vitaJComboBox1 = new javax.swing.JComboBox();
        BloodJComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        OtherJComboBox = new javax.swing.JComboBox();

        submitJButton.setText("Generate Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Result");

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Glucose Levels:");

        jLabel3.setText("Vitamins:");

        jLabel4.setText("Blood Count:");

        gluJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Normal ", "Abnormal" }));

        vitaJComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Normal ", "Abnormal" }));
        vitaJComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vitaJComboBox1ActionPerformed(evt);
            }
        });

        BloodJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Normal ", "Abnormal" }));
        BloodJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodJComboBoxActionPerformed(evt);
            }
        });

        jLabel5.setText("Other Test");

        OtherJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Normal ", "Abnormal" }));
        OtherJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherJComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(submitJButton)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vitaJComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BloodJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(OtherJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gluJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(61, 633, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(gluJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(vitaJComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(BloodJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(OtherJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(submitJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 369, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addGap(44, 44, 44))
        );
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
        String glures = gluJComboBox.getSelectedItem().toString();
        String vita = vitaJComboBox1.getSelectedItem().toString();
        String blood = BloodJComboBox.getSelectedItem().toString();
        String other = OtherJComboBox.getSelectedItem().toString();

        Writer writer = null;

        try {

            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(((LabTestWorkRequest) request).getPatientAccount().getUsername() + ".txt"), "utf-8"));
//            Date todaysDate = new Date()   ;     
            writer.write(
                    "====== START OF REPORT =========" + "\n"
//                    + "Patient ID: " + request.getPatient_id() + "\n"
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
                    + "\n"+ "\n");
            if (!glures.equals("-")) {
                writer.write("Glucose Levels: " + glures + "\n");
            }
            if (!vita.equals("-")) {
                writer.write("Vitamins: " + vita + "\n");
            }
            if (!blood.equals("-")) {
                writer.write("Blood Count: " + blood + "\n");
            }
            if (!other.equals("-")) {
                writer.write(others + ": " + other + "\n");
            }
            writer.write("\n" + "\n" + "====== END OF REPORT ==========");
//          
            //writer.write("Something");
        } catch (IOException ex) {
            // Report
        } finally {
            try {
                writer.close();
            } catch (Exception ex) {/*ignore*/
            }
        }
        request.setFile_name((((LabTestWorkRequest) request).getPatientAccount().getUsername() + ".txt"));
        JOptionPane.showMessageDialog(null,"Report has been generated");


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
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JComboBox vitaJComboBox1;
    // End of variables declaration//GEN-END:variables
}