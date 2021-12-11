/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Organ.Organ;
import Business.Organization.OrganTissueDonationOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.TrailWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author piyush
 */
public class RequestOrganJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestOrganJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private EnterpriseDirectory enterpriseDirectory;
    private UserAccount userAccount;
    private UserAccount puser;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private Network isNetwork;

    public RequestOrganJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EnterpriseDirectory enterpriseDirectory, EcoSystem ecosystem, Network network, UserAccount puser) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = ecosystem;
        this.userAccount = account;
        this.enterpriseDirectory = enterpriseDirectory;
        //system = dB4OUtil.retrieveSystem();
        this.isNetwork = network;
        this.puser = puser;
        lblAgeValue.setVisible(true);
        lblAge.setVisible(true);
        lblName1.setVisible(true);
        lblNameValue1.setVisible(true);
        lblSexValue.setVisible(true);
        lblSex.setVisible(true);
        lblAgeValue.setText(String.valueOf(puser.getAge()));
        lblSexValue.setText(puser.getSex());
        lblNameValue1.setText(puser.getEmployee().getName());

        valueLabel.setText(enterprise.getName());
        printReqs();
    }

    public void printReqs() {
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            System.err.println("Doc Request" + request.toString());
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

        jPanel1 = new javax.swing.JPanel();
        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        organJComboBox = new javax.swing.JComboBox();
        bloodGroupJComboBox = new javax.swing.JComboBox();
        severityJComboBox = new javax.swing.JComboBox();
        lblAge = new javax.swing.JLabel();
        lblAgeValue = new javax.swing.JLabel();
        lblSexValue = new javax.swing.JLabel();
        lblSex = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblNameValue1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setText("Request Organ");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        jLabel1.setText("Organ Type");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));

        jLabel2.setText("Blood Type");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        jLabel3.setText("Severity");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        organJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Heart", "Lungs", "Kidneys", "Liver", "Pancreas" }));
        jPanel1.add(organJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        bloodGroupJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "B Positive", "B Negative", "A Positive", "A Negative", "O Positive", "O Negative" }));
        bloodGroupJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodGroupJComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(bloodGroupJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        severityJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "High", "Normal" }));
        jPanel1.add(severityJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        lblAge.setText("Age:");
        jPanel1.add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        lblAgeValue.setText("Age");
        jPanel1.add(lblAgeValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 81, -1));

        lblSexValue.setText("Sex");
        jPanel1.add(lblSexValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 81, -1));

        lblSex.setText("Sex");
        jPanel1.add(lblSex, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        lblName1.setText("Name");
        jPanel1.add(lblName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        lblNameValue1.setText("name");
        jPanel1.add(lblNameValue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 92, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setText("<value>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel))
                .addGap(71, 71, 71)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        String patient = puser.toString();
        String message = organJComboBox.getSelectedItem().toString();
        String blood = bloodGroupJComboBox.getSelectedItem().toString();
        String sev = severityJComboBox.getSelectedItem().toString();

        Organ orgReq = new Organ(message, blood);
        TrailWorkRequest organRequestWF = new TrailWorkRequest();
        organRequestWF = (TrailWorkRequest) organRequestWF;
        organRequestWF.setOrgan(orgReq);
        organRequestWF.setSender(userAccount);
        organRequestWF.setStatus("New Request");
        organRequestWF.setMessage(message);
        organRequestWF.setSeverity(sev);
        organRequestWF.setPatient_name(patient);
        Organization org = null;
        for (Network network : system.getNetworkList()) {
            if (network == isNetwork) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof OrganTissueDonationOrganization) {
                            org = organization;
                            break;
                        }
                    }

                }
            }
        }

        if (org != null) {

            /*
            WorkRequest Ids
        
            OrganTissueDonationOrganization + 
            DoctorOrganization + 
            OrganTissueDonationOrganization + 201
            EmotionalOrganization + 401
            HealthCampOrganization + 
            LabOrganization + 101
            LegalOrganization + 301
            PatientOrganization	+ 
            
             */
            org.getWorkQueue().getWorkRequestList().add(organRequestWF);
            try {
                organRequestWF.setWorkID(org.getWorkQueue().getWorkRequestList().get(org.getWorkQueue().getWorkRequestList().size() - 1).getWorkID() + 1);
            } catch (Exception e) {
                organRequestWF.setWorkID(201);
            }
            userAccount.getWorkQueue().getWorkRequestList().add(organRequestWF);
            JOptionPane.showMessageDialog(null, "Request Raised successfully !");
        } else {
            JOptionPane.showMessageDialog(null, "Request could not be raised !");
        }


    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkAreaJPanel dwjp = (DoctorWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void bloodGroupJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodGroupJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodGroupJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox bloodGroupJComboBox;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAgeValue;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblNameValue1;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblSexValue;
    private javax.swing.JComboBox organJComboBox;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JComboBox severityJComboBox;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}