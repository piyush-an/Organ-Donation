/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DonorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
//import Business.Organization.DonorOrganization;
import Business.Organization.OrganTissueDonationOrganization;
import Business.Organization.Organization;
import Business.Person.Donor;
import Business.Person.DonorDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author saksh
 */
public class DonorRegistrationFormJPanel extends javax.swing.JPanel {
       // Organization organization;
        JPanel userProcessContainer;
        String emailAdd;
        EcoSystem ecosystem;
        String city;
        DB4OUtil dB4OUtil;
        //DonorOrganization organization;
        DonorDirectory donorDirectory;
         List<String> userList = new ArrayList<String>();
//        EmployeeDirectory employeeD;
//        
    /**
     * Creates new form DonorRegistrationFormJPanel
     */
    List<String> organList = new ArrayList<String>();
    
    public DonorRegistrationFormJPanel(JPanel userProcessContainer, EcoSystem system, String city, DonorDirectory donorDirectory,DB4OUtil dB4OUtil) {
        initComponents();
        //this.organization = organization;
        this.userProcessContainer = userProcessContainer;
       // this.emailAdd=email;
        //txtEmailId.setText(email);
        //txtContactDonor.setText();
        txtCity.setText(city);
        txtCity.setEnabled(false);
        this.ecosystem = system;
        this.city = city;
        this.donorDirectory = donorDirectory;
        this.dB4OUtil =dB4OUtil;
        popuser();
//        this.employeeD = new EmployeeDirectory();
//        System.out.println("Donor Direcotry"+donorDirectory.getDonorList());
//                System.out.println("Emp Direcotry"+employeeD.getEmployeeList());
    }
    public void popuser(){
        for(Donor d:ecosystem.getDonorDirectory()){
            userList.add(d.getName());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtContactDonor = new javax.swing.JTextField();
        txtEmailId = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtEmergencyName = new javax.swing.JTextField();
        txtEmergencyContact = new javax.swing.JTextField();
        txtSignature = new javax.swing.JTextField();
        radMale = new javax.swing.JRadioButton();
        radFemale = new javax.swing.JRadioButton();
        radOrganAvailYes = new javax.swing.JRadioButton();
        radOrganAvailNo = new javax.swing.JRadioButton();
        btnBack = new javax.swing.JButton();
        organJComboBox = new javax.swing.JComboBox();
        lblOrgan1 = new javax.swing.JLabel();
        bloodGroupJComboBox1 = new javax.swing.JComboBox();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        btnRegister1 = new javax.swing.JButton();

        jLabel1.setText("Donor Registration Form");

        jLabel2.setText("Full Name:");

        jLabel3.setText("Age:");

        jLabel4.setText("Sex:");

        jLabel5.setText("Blood Group:");

        jLabel6.setText("Contact Number:");

        jLabel7.setText("Email-Id:");

        jLabel8.setText("Address:");

        jLabel9.setText("Organ to donate:");

        jLabel10.setText("Is organ available now:");

        jLabel11.setText("Point of contact in emergency:");

        jLabel12.setText("Name:");

        jLabel13.setText("Digital Sig:");

        jLabel14.setText("Contact number:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtEmergencyContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmergencyContactActionPerformed(evt);
            }
        });

        txtSignature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSignatureActionPerformed(evt);
            }
        });

        buttonGroup1.add(radMale);
        radMale.setText("Male");

        buttonGroup1.add(radFemale);
        radFemale.setText("Female");

        buttonGroup1.add(radOrganAvailYes);
        radOrganAvailYes.setText("Yes");

        buttonGroup1.add(radOrganAvailNo);
        radOrganAvailNo.setText("No");

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        organJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Heart", "Lungs", "Kidneys", "Liver", "Small Bowel", "Pancreas" }));
        organJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organJComboBoxActionPerformed(evt);
            }
        });

        bloodGroupJComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "B Positive", "B Negative", "A Positive", "A Negative", "O Positive", "O Negative" }));
        bloodGroupJComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodGroupJComboBox1ActionPerformed(evt);
            }
        });

        lblCity.setText("City:");

        btnRegister1.setText("Register");
        btnRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegister1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel4))
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(organJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(lblOrgan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radMale, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(radFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(bloodGroupJComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(radOrganAvailYes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(radOrganAvailNo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtEmergencyContact, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEmergencyName, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEmailId, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtContactDonor, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 138, Short.MAX_VALUE)
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtSignature, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblCity)
                                                .addGap(104, 104, 104)
                                                .addComponent(txtCity)))))))))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegister1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(radMale)
                    .addComponent(radFemale))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bloodGroupJComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContactDonor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(organJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrgan1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(radOrganAvailYes)
                    .addComponent(radOrganAvailNo))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(txtEmergencyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(txtEmergencyContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSignature, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister1)
                    .addComponent(btnBack))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmergencyContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmergencyContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmergencyContactActionPerformed

    private void txtSignatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSignatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSignatureActionPerformed

    private void organJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organJComboBoxActionPerformed
//            JLabel newLabel = new JLabel();
//            //labels.add(newLabel);
//            newLabel.setBounds(0, 0, 200, 200);
//            newLabel.setText("hello");
//            add(newLabel);
            
            //validate();
            organList.add((String) organJComboBox.getSelectedItem());
            if(lblOrgan1.getText()==""){
                lblOrgan1.setText((String) organJComboBox.getSelectedItem());
            }
            else{
            lblOrgan1.setText(lblOrgan1.getText() + ", " +(String) organJComboBox.getSelectedItem());
            }
    }//GEN-LAST:event_organJComboBoxActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        //organization.getEmployeeDirectory().createEmployee(name);
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void bloodGroupJComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodGroupJComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodGroupJComboBox1ActionPerformed
 public boolean isFirstnameValid(String text) {

        if(text.matches("^([A-Za-z]+)(\\s[A-Za-z]+)*\\s?$")){
            for(String s:userList){
                if(s.equalsIgnoreCase(text)){
                    JOptionPane.showMessageDialog(null, "User already exists");
                    return false;
                }
            }
            
            return true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Names should contain only alphabets");
            return false;
        }
    }
   private boolean valage(String age){
       Pattern pattern = Pattern.compile("[0-9]+");
       Matcher matcher = pattern.matcher(age);
        boolean bool = matcher.matches();
        if (!bool) {
            JOptionPane.showMessageDialog(null,"Age should only be numbers");
            return false;
        } else {
           int age1 = Integer.parseInt(age);
           if(age1<0 || age1>200){
                JOptionPane.showMessageDialog(null,"Age should between");
           }
            return true;
        }
     }
       private boolean valPhone(String ph){
      Pattern pattern = Pattern.compile("[0-9]{10}");
        Matcher matcher = pattern.matcher(ph);
        boolean bool = matcher.matches();
        if (!bool) {
            return true;
            //JOptionPane.showMessageDialog(null,"Invalid phone number format");
//            return false;
        } else {
           
            return true;
        }
    }
               private boolean usernamePatternCorrect(String username) {
                int f=0;
            
        Pattern pattern = Pattern.compile("(?!_).*[A-Za-z0-9._]+@[A-Za-z0-9._]+\\.[A-Za-z]{2,4}");
        Matcher matcher = pattern.matcher(username);
        boolean bool = matcher.matches();
        if (!bool) {
            JOptionPane.showMessageDialog(null,"Special characters are not allowed other than _, @");
            return false;
        } else {
           
          
            return true;
        }
    }
                 boolean checkforunique(){
                     return false;
                 }
    private void btnRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegister1ActionPerformed
        // TODO add your handling code here:
        int f=0;
         String name = txtName.getText();
         //String lastname= txtName1.getText();
        String sex;
        emailAdd = txtEmailId.getText();
        if(radMale.isSelected())
            sex = radMale.getText();
        else 
            sex = radFemale.getText();
        
        String bloodGroup = bloodGroupJComboBox1.getSelectedItem().toString();
        String contactNum = txtContactDonor.getText(); 
        String address = txtAddress.getText();
        String emergencyPOC = txtEmergencyName.getText();
        String emergencyPOC_Num = txtEmergencyContact.getText();
        String sign = txtSignature.getText();
        //int age =Integer.parseInt(txtAge.getText());
        int age=30;
        
        
      
        boolean isOrganAvaiNow = false;
        if(radOrganAvailYes.isSelected())
            isOrganAvaiNow = true;
        else if(radOrganAvailNo.isSelected())
            isOrganAvaiNow = false;
        
        if(isFirstnameValid(name)){
            f++;
        }
        else{
            return;
        }
        if(valage(txtAge.getText())){
            age =Integer.parseInt(txtAge.getText());
            f++;
        }
        else{
            return;
        }
        if(valPhone(contactNum)){
            f++;
        }
        else{
            return;
        }
        if(usernamePatternCorrect(emailAdd)){
            f++;
        }
        else{
        return;
    }if(address.equals("")){
        JOptionPane.showMessageDialog(null, "Address cannot be empty");
        return;
    }
    if(sign.equals("")){
            JOptionPane.showMessageDialog(null, "Sign cannot be empty");
        return;
    }
     if(valPhone(emergencyPOC)){
            f++;
        }
        else{
            return;
        }
      if(isFirstnameValid(emergencyPOC) ){
            f++;
        }
        else{
            return;
        }
            
            
        
        Donor d  = ecosystem.createDonor(name, age, sex,bloodGroup, contactNum, address, sign, emailAdd, emergencyPOC, emergencyPOC_Num, isOrganAvaiNow, organList);
        ecosystem.getDonorDirectory().add(d);
        JOptionPane.showMessageDialog(null,"Thank you for registering with us!!");
         dB4OUtil.storeSystem(ecosystem);
         JOptionPane.showMessageDialog(null, "Thanks for donation");
     
        if(f==0){
            JOptionPane.showConfirmDialog(null, "Please enter the right details");
            
        }
        
      //  ArrayList<String> organDirectory = new ArrayList<String>();
        //String uname = usernameText.getText();
//        if(Heart.isSelected()){
//            SorganDirectory.add("Heart");
//        } 
//        if(Lungs.isSelected()){
//            SorganDirectory.add("Lungs");
//        }
        //Donor donor = new Donor();
        //donorDirectory.createDonor(name, age, sex, address, contactNum, address, sign, emailAdd, emergencyPOC, emergencyPOC_Num, isOrganAvaiNow, organList);
        
        
       
    }//GEN-LAST:event_btnRegister1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox bloodGroupJComboBox1;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegister1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblOrgan1;
    private javax.swing.JComboBox organJComboBox;
    private javax.swing.JRadioButton radFemale;
    private javax.swing.JRadioButton radMale;
    private javax.swing.JRadioButton radOrganAvailNo;
    private javax.swing.JRadioButton radOrganAvailYes;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtContactDonor;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtEmergencyContact;
    private javax.swing.JTextField txtEmergencyName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSignature;
    // End of variables declaration//GEN-END:variables
}
