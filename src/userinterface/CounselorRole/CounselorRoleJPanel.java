/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CounselorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.EmotionalOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EmotionalWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.CounselorRole.CounselorWorkRequestJPanel;

/**
 *
 * @author piyush
 */
public class CounselorRoleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CounselorJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EmotionalOrganization EmotionalOrganization;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    private EcoSystem system;
    private Network network;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public CounselorRoleJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.EmotionalOrganization = (EmotionalOrganization) organization;
        this.enterprise = enterprise;
        this.business = business;
        this.network = network;
        system = dB4OUtil.retrieveSystem();
        
        
        // User function
        populateTable();
        
        
    }
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) EmotionalOrganizationJTable.getModel();
        model.setRowCount(0);
        if(EmotionalOrganization.getWorkQueue().getWorkRequestList().isEmpty()){
            return;
        }
        for (WorkRequest request : EmotionalOrganization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[9];
            row[0] = request;
            row[1] = request.getRequestDate();
            row[2] = request.getStatus();
            row[3] = request.getReceiver();
            row[4] = request.getMessage();
            row[5] = ((EmotionalWorkRequest) request).getPatient_name();
            row[6] = ((EmotionalWorkRequest) request).getDonor().getName();
            row[7] = ((EmotionalWorkRequest) request).getDonor().getContactNum();
            
            int i = 0;
            try {
            if(((EmotionalWorkRequest) request).getServiceOne())
                i++;
            if(((EmotionalWorkRequest) request).getServiceTwo())
                i++;
            if(((EmotionalWorkRequest) request).getServiceThree())
                i++;
            if(((EmotionalWorkRequest) request).getServiceFour())
                i++;
            }
            catch (Exception e) {
                
            }
            row[8] = i;
            
            model.addRow(row);
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

        therapyTypes = new javax.swing.ButtonGroup();
        btnHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmotionalOrganizationJTable = new javax.swing.JTable();
        btnAssignToSelf = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();

        btnHome.setText("HOME");
        btnHome.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Shree Devanagari 714", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Counselor Advisor");

        jButton1.setText("RESET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        EmotionalOrganizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "WorkID", "Start Date", "Status", "Ownership", "Message", "Patient Name", "Donor Name", "Contact", "Services"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(EmotionalOrganizationJTable);

        btnAssignToSelf.setText("Assign To Self");
        btnAssignToSelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToSelfActionPerformed(evt);
            }
        });

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAssignToSelf, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHome)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAssignToSelf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(349, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignToSelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToSelfActionPerformed
        // TODO add your handling code here:
        int selectedRow = EmotionalOrganizationJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "No Row Selected, Please select one");
            return;
        }
        WorkRequest request = (WorkRequest) EmotionalOrganizationJTable.getValueAt(selectedRow, 0);

        if (request.getStatus().equalsIgnoreCase("New Request")) {
            for (WorkRequest requestCheck : EmotionalOrganization.getWorkQueue().getWorkRequestList()) {

                if(requestCheck.getReceiver() != null && requestCheck.getReceiver().equals(userAccount) && (requestCheck.getStatus().equalsIgnoreCase("Assigned") || requestCheck.getStatus().equalsIgnoreCase("Work In Progress"))){
                    JOptionPane.showMessageDialog(null, "User already working on a work request");
                    return;
                }
            }
            request.setReceiver(userAccount);
            request.setStatus("Assigned");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "This request is already being handled");
        }
        populateTable();
    }//GEN-LAST:event_btnAssignToSelfActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = EmotionalOrganizationJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "No Row Selected, Please select one");
            return;
        }

        EmotionalWorkRequest request = (EmotionalWorkRequest) EmotionalOrganizationJTable.getValueAt(selectedRow, 0);

        UserAccount requestuserAccount = request.getReceiver();
        if(requestuserAccount == null){
            JOptionPane.showMessageDialog(null, "Request not assigned to you");
            return;
        }
        if (requestuserAccount.equals(userAccount)){
            CounselorWorkRequestJPanel CounselorWorkRequestJPanel = new CounselorWorkRequestJPanel(userProcessContainer, request, business, network, userAccount);
            userProcessContainer.add("processWorkRequestJPanel", CounselorWorkRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else {
            JOptionPane.showMessageDialog(null, "Request not assigned to you");
        }

    }//GEN-LAST:event_btnProcessActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EmotionalOrganizationJTable;
    private javax.swing.JButton btnAssignToSelf;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup therapyTypes;
    // End of variables declaration//GEN-END:variables
}
