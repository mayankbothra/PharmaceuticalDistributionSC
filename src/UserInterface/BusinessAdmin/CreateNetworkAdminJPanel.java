/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.BusinessAdmin;

import Business.Address;
import Business.Business;
import Business.Employee;
import Business.Network.Network;
import Business.Person;
import Business.Roles.NetworkAdminRole;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Mayank
 */
public class CreateNetworkAdminJPanel extends javax.swing.JPanel {
JPanel userProcessContainer;
Network selectedNetwork;
UserAccount userAccount;
ManageNetworkJPanel manageNetwork;

    /**
     * Creates new form CreateCustomerJPanel
     */
    public CreateNetworkAdminJPanel(JPanel userProcessContainer, Network selectedNetwork, UserAccount userAccount, ManageNetworkJPanel manageNetwork) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.selectedNetwork = selectedNetwork;
        this.userAccount = userAccount;
        this.manageNetwork = (ManageNetworkJPanel)manageNetwork;
        
        networkNameJLabel.setText(selectedNetwork.getNetworkName());
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
        businessNameJLabel = new javax.swing.JLabel();
        networkNameJLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        titleJLabel = new javax.swing.JLabel();
        adminDetailJLabel = new javax.swing.JLabel();
        userAccountDetailJLabel = new javax.swing.JLabel();
        firstNameJLabel = new javax.swing.JLabel();
        lastNameJLabel = new javax.swing.JLabel();
        employeeIdJLabel = new javax.swing.JLabel();
        ageJLabel = new javax.swing.JLabel();
        phoneJLabel = new javax.swing.JLabel();
        genderJLabel = new javax.swing.JLabel();
        line1JLabel = new javax.swing.JLabel();
        line2JLabel = new javax.swing.JLabel();
        cityJLabel = new javax.swing.JLabel();
        stateJLabel = new javax.swing.JLabel();
        zipCodeJLabel = new javax.swing.JLabel();
        userNameJLabel = new javax.swing.JLabel();
        passwordJLabel = new javax.swing.JLabel();
        firstNameJTextField = new javax.swing.JTextField();
        lastNameJTextField = new javax.swing.JTextField();
        employeeIdJTextField = new javax.swing.JTextField();
        ageJTextField = new javax.swing.JTextField();
        phoneJTextField = new javax.swing.JTextField();
        maleJRadioButton = new javax.swing.JRadioButton();
        femaleJRadioButton = new javax.swing.JRadioButton();
        line1JTextField = new javax.swing.JTextField();
        line2JTextField = new javax.swing.JTextField();
        cityJTextField = new javax.swing.JTextField();
        stateJTextField = new javax.swing.JTextField();
        zipCodeJTextField = new javax.swing.JTextField();
        userNameJTextField = new javax.swing.JTextField();
        passwordJPasswordField = new javax.swing.JPasswordField();
        backJButton = new javax.swing.JButton();
        createJButton = new javax.swing.JButton();
        clearJButton = new javax.swing.JButton();

        businessNameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        businessNameJLabel.setText("Drug Tracking System");

        networkNameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        networkNameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        networkNameJLabel.setMaximumSize(new java.awt.Dimension(195, 24));
        networkNameJLabel.setMinimumSize(new java.awt.Dimension(195, 24));
        networkNameJLabel.setPreferredSize(new java.awt.Dimension(195, 24));

        titleJLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titleJLabel.setText("Create Admin");

        adminDetailJLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        adminDetailJLabel.setText("Admin Detail");

        userAccountDetailJLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        userAccountDetailJLabel.setText("User Account Detail");

        firstNameJLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        firstNameJLabel.setText("First Name");

        lastNameJLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        lastNameJLabel.setText("Last Name");

        employeeIdJLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        employeeIdJLabel.setText("Employee ID");

        ageJLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        ageJLabel.setText("Age");

        phoneJLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        phoneJLabel.setText("Phone");

        genderJLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        genderJLabel.setText("Gender");

        line1JLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        line1JLabel.setText("Line 1");

        line2JLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        line2JLabel.setText("Line 2");

        cityJLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cityJLabel.setText("City");

        stateJLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        stateJLabel.setText("State");

        zipCodeJLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        zipCodeJLabel.setText("Zip Code");

        userNameJLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        userNameJLabel.setText("Username");

        passwordJLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        passwordJLabel.setText("Password");

        firstNameJTextField.setMinimumSize(new java.awt.Dimension(100, 25));
        firstNameJTextField.setPreferredSize(new java.awt.Dimension(100, 25));

        lastNameJTextField.setMinimumSize(new java.awt.Dimension(100, 25));
        lastNameJTextField.setPreferredSize(new java.awt.Dimension(100, 25));

        employeeIdJTextField.setEditable(false);
        employeeIdJTextField.setMinimumSize(new java.awt.Dimension(100, 25));
        employeeIdJTextField.setPreferredSize(new java.awt.Dimension(100, 25));

        ageJTextField.setMinimumSize(new java.awt.Dimension(100, 25));
        ageJTextField.setPreferredSize(new java.awt.Dimension(100, 25));

        phoneJTextField.setMinimumSize(new java.awt.Dimension(100, 25));
        phoneJTextField.setPreferredSize(new java.awt.Dimension(100, 25));

        buttonGroup1.add(maleJRadioButton);
        maleJRadioButton.setText("Male");

        buttonGroup1.add(femaleJRadioButton);
        femaleJRadioButton.setText("Female");

        line1JTextField.setMinimumSize(new java.awt.Dimension(100, 25));
        line1JTextField.setPreferredSize(new java.awt.Dimension(100, 25));

        line2JTextField.setMinimumSize(new java.awt.Dimension(100, 25));
        line2JTextField.setPreferredSize(new java.awt.Dimension(100, 25));

        cityJTextField.setMinimumSize(new java.awt.Dimension(100, 25));
        cityJTextField.setPreferredSize(new java.awt.Dimension(100, 25));

        stateJTextField.setMinimumSize(new java.awt.Dimension(100, 25));
        stateJTextField.setPreferredSize(new java.awt.Dimension(100, 25));

        zipCodeJTextField.setMinimumSize(new java.awt.Dimension(100, 25));
        zipCodeJTextField.setPreferredSize(new java.awt.Dimension(100, 25));

        userNameJTextField.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        userNameJTextField.setMinimumSize(new java.awt.Dimension(120, 26));
        userNameJTextField.setPreferredSize(new java.awt.Dimension(120, 26));

        passwordJPasswordField.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        passwordJPasswordField.setMinimumSize(new java.awt.Dimension(120, 26));
        passwordJPasswordField.setPreferredSize(new java.awt.Dimension(120, 26));

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        backJButton.setText("Back");
        backJButton.setMaximumSize(new java.awt.Dimension(100, 30));
        backJButton.setMinimumSize(new java.awt.Dimension(100, 30));
        backJButton.setPreferredSize(new java.awt.Dimension(100, 30));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        createJButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        createJButton.setText("Create");
        createJButton.setMaximumSize(new java.awt.Dimension(100, 30));
        createJButton.setMinimumSize(new java.awt.Dimension(100, 30));
        createJButton.setPreferredSize(new java.awt.Dimension(100, 30));
        createJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createJButtonActionPerformed(evt);
            }
        });

        clearJButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        clearJButton.setText("Clear");
        clearJButton.setMaximumSize(new java.awt.Dimension(100, 30));
        clearJButton.setMinimumSize(new java.awt.Dimension(100, 30));
        clearJButton.setPreferredSize(new java.awt.Dimension(100, 30));
        clearJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(businessNameJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(networkNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(phoneJLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(phoneJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(50, 50, 50)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(employeeIdJLabel)
                                                    .addGap(12, 12, 12)
                                                    .addComponent(employeeIdJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(firstNameJLabel)
                                                    .addGap(12, 12, 12)
                                                    .addComponent(firstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cityJLabel)
                                                .addGap(12, 12, 12)
                                                .addComponent(cityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(line1JLabel)
                                                .addGap(12, 12, 12)
                                                .addComponent(line1JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(stateJLabel)
                                        .addGap(12, 12, 12)
                                        .addComponent(stateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lastNameJLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ageJLabel)
                                        .addGap(12, 12, 12)
                                        .addComponent(ageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(genderJLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(maleJRadioButton)
                                        .addGap(6, 6, 6)
                                        .addComponent(femaleJRadioButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(line2JLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(line2JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(adminDetailJLabel)
                            .addComponent(userAccountDetailJLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(createJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(clearJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(211, 211, 211)
                                    .addComponent(passwordJLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(passwordJPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(208, 208, 208)
                                    .addComponent(userNameJLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(252, 252, 252)
                                .addComponent(titleJLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(zipCodeJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(zipCodeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 218, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(businessNameJLabel)
                    .addComponent(networkNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleJLabel)
                .addGap(1, 1, 1)
                .addComponent(adminDetailJLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameJLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lastNameJLabel)
                                .addComponent(lastNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeIdJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeeIdJLabel)
                            .addComponent(ageJLabel))))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneJLabel))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(line1JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(line1JLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(line2JLabel)
                                        .addComponent(line2JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cityJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cityJLabel)
                                    .addComponent(stateJLabel))))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zipCodeJLabel)
                            .addComponent(zipCodeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(userAccountDetailJLabel)
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(userNameJLabel))
                            .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(passwordJLabel))
                            .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(createJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(clearJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(maleJRadioButton)
                        .addComponent(genderJLabel))
                    .addComponent(femaleJRadioButton))
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);         
    }//GEN-LAST:event_backJButtonActionPerformed

    private void createJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createJButtonActionPerformed
        // TODO add your handling code here:
        
        if((firstNameJTextField.getText()).equals("")) {
            JOptionPane.showMessageDialog(null, "Enter First Name");
            return;
        }
        
        if((lastNameJTextField.getText()).equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Last Name");
            return;
        }
        
        if((ageJTextField.getText()).equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Age");
            return;
        }
        
        try {
              Integer.parseInt(ageJTextField.getText());
            } catch (NumberFormatException nfe) {
                     JOptionPane.showMessageDialog(null, "Invalid Age");
                     return;    
            }
        
        if((phoneJTextField.getText()).equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Phone");
            return;
        }
        
        try {
              Integer.parseInt(phoneJTextField.getText());
            } catch (NumberFormatException nfe) {
                     JOptionPane.showMessageDialog(null, "Invalid Phone");
                     return;    
            }
        
        if(!(maleJRadioButton.isSelected()||femaleJRadioButton.isSelected())) {
            JOptionPane.showMessageDialog(null, "Select Gender");
            return;
        }
        
        if((line1JTextField.getText()).equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Address Line1");
            return;
        }
        
        if((line2JTextField.getText()).equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Address Line2");
            return;
        }
        
         if((cityJTextField.getText()).equals("")) {
            JOptionPane.showMessageDialog(null, "Enter City");
            return;
         }
         
         if(stateJTextField.getText().equals("")) {
             JOptionPane.showMessageDialog(null, "Enter State");
             return;
         }
         
         if(zipCodeJTextField.getText().equals("")) {
             JOptionPane.showMessageDialog(null, "Enter Zip Code");
             return;
         }
         
         try {
              Integer.parseInt(zipCodeJTextField.getText());
            } catch (NumberFormatException nfe) {
                     JOptionPane.showMessageDialog(null, "Invalid Zip Code");
                     return;    
            }
         
         String userName = userNameJTextField.getText();
         
         if(userName.equals("")) {
             JOptionPane.showMessageDialog(null, "Enter User Name");
             return;
         }
         
         Business business = Business.getInstance();
         if(business.checkUserName(userName)) {
             JOptionPane.showMessageDialog(null, "Username Already Exists");
             return;
         }
         
         if(passwordJPasswordField.getText().equals("")) {
             JOptionPane.showMessageDialog(null, "Enter Password");
             return;
         }
         
        Person person = selectedNetwork.getPersonDirectory().newPerson(); 
        Address address = person.getAddress();
        
        person.setFirstName(firstNameJTextField.getText());
        person.setLastName(lastNameJTextField.getText());
        person.setAge(Integer.parseInt(ageJTextField.getText()));
        person.setPhone(Integer.parseInt(phoneJTextField.getText()));
        if (maleJRadioButton.isSelected())
        {
            person.setGender(maleJRadioButton.getText());
        }

        if (femaleJRadioButton.isSelected())
        {
            person.setGender(femaleJRadioButton.getText());
        }
        address.setLine1(line1JTextField.getText());
        address.setLine2(line2JTextField.getText());
        address.setCity(cityJTextField.getText());
        address.setState(stateJTextField.getText());
        address.setZipCode(Integer.parseInt(zipCodeJTextField.getText()));
        person.setAddress(address);
        
        Employee employee = selectedNetwork.getEmployeeDirectory().newEmployee();
        employee.setPerson(person);
        employee.setDesignation("Administrater");
        employeeIdJTextField.setText(String.valueOf(employee.getEmployeeId()));
        
        UserAccount ua = selectedNetwork.getUserAccountDirectory().newUserAccount();
        ua.setUserName(userNameJTextField.getText());
        char[] pass = passwordJPasswordField.getPassword();
        String password = String.valueOf(pass);
        ua.setPassword(password);
        ua.setEmployee(employee);
        ua.setRole(new NetworkAdminRole());
        
        manageNetwork.refreshNetworks();
        JOptionPane.showMessageDialog(null, "Network Admin with Employee ID " + (String.valueOf(employee.getEmployeeId())) + " Created");
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);                 
    }//GEN-LAST:event_createJButtonActionPerformed

    private void clearJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearJButtonActionPerformed
        // TODO add your handling code here:
        
        firstNameJTextField.setText("");
        lastNameJTextField.setText("");
        employeeIdJTextField.setText("");
        ageJTextField.setText("");
        phoneJTextField.setText("");
        buttonGroup1.clearSelection();
        line1JTextField.setText("");
        line2JTextField.setText("");
        cityJTextField.setText("");
        stateJTextField.setText("");
        zipCodeJTextField.setText("");
        userNameJTextField.setText("");
        passwordJPasswordField.setText("");
        
    }//GEN-LAST:event_clearJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminDetailJLabel;
    private javax.swing.JLabel ageJLabel;
    private javax.swing.JTextField ageJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel businessNameJLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cityJLabel;
    private javax.swing.JTextField cityJTextField;
    private javax.swing.JButton clearJButton;
    private javax.swing.JButton createJButton;
    private javax.swing.JLabel employeeIdJLabel;
    private javax.swing.JTextField employeeIdJTextField;
    private javax.swing.JRadioButton femaleJRadioButton;
    private javax.swing.JLabel firstNameJLabel;
    private javax.swing.JTextField firstNameJTextField;
    private javax.swing.JLabel genderJLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lastNameJLabel;
    private javax.swing.JTextField lastNameJTextField;
    private javax.swing.JLabel line1JLabel;
    private javax.swing.JTextField line1JTextField;
    private javax.swing.JLabel line2JLabel;
    private javax.swing.JTextField line2JTextField;
    private javax.swing.JRadioButton maleJRadioButton;
    private javax.swing.JLabel networkNameJLabel;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JLabel phoneJLabel;
    private javax.swing.JTextField phoneJTextField;
    private javax.swing.JLabel stateJLabel;
    private javax.swing.JTextField stateJTextField;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JLabel userAccountDetailJLabel;
    private javax.swing.JLabel userNameJLabel;
    private javax.swing.JTextField userNameJTextField;
    private javax.swing.JLabel zipCodeJLabel;
    private javax.swing.JTextField zipCodeJTextField;
    // End of variables declaration//GEN-END:variables
}
