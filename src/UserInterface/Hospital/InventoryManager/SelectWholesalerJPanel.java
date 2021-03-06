/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Hospital.InventoryManager;

import Business.Business;
import Business.Employee;
import Business.Enterprises.Enterprise;
import Business.Enterprises.Wholesaler;
import Business.Network.Network;
import Business.Organizations.Organization;
import Business.UserAccount;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Mayank
 */
public class SelectWholesalerJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise selectedEnterprise;
    UserAccount userAccount;
    Network selectedNetwork;
    Wholesaler selectedWholesaler;
    Business business;

    /**
     * Creates new form SelectWholesalerJPanel
     */
    public SelectWholesalerJPanel(JPanel userProcessContainer, Enterprise selectedEnterprise, UserAccount userAccount, Network selectedNetwork) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.selectedEnterprise = selectedEnterprise;
        this.userAccount = userAccount;
        this.selectedNetwork = selectedNetwork;
        
        business = Business.getInstance();
        
        enterpriseNameJLabel.setText(" --  " + selectedEnterprise.getEnterpriseName());
        networkNameJLabel.setText(selectedNetwork.getNetworkName());
        
        Organization organization = selectedEnterprise.getMyOrganization(userAccount);
        organizationNameJLabel.setText(organization.getOrganizationName());
        
        wholesalerJComboBox.removeAllItems();
        wholesalerJComboBox.addItem("Select Wholesaler");
        ArrayList<Enterprise> entList = business.getEnterpriseList(Enterprise.Type.WHOLESALER);
        
        for (Enterprise e : entList) {
            try {
                String expDate = e.getLicenseExpiryDate();
                Date d = new SimpleDateFormat("MM dd yy HH:mm:ss").parse(expDate);
                
                boolean fakeEnt = false;
                
                for (Employee emp : e.getEmployeeDirectory().getEmployeeList()) {
                    if (emp.getDesignation().equals("Fake")) {
                        fakeEnt = true;
                    }
                }
                
                if (!fakeEnt) {
                    if (d.after(new Date())) {
                        wholesalerJComboBox.addItem(e);
                    }
                } else {
                    wholesalerJComboBox.addItem(e);
                }
            } catch (ParseException pe) {
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

        businessNameJLabel = new javax.swing.JLabel();
        enterpriseNameJLabel = new javax.swing.JLabel();
        networkNameJLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        organizationNameJLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        titleJLabel = new javax.swing.JLabel();
        wholesalerNameJLabel = new javax.swing.JLabel();
        wholesalerJComboBox = new javax.swing.JComboBox();
        backJButton = new javax.swing.JButton();
        nextJButton = new javax.swing.JButton();

        businessNameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        businessNameJLabel.setText("Drug Track Management");

        enterpriseNameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        enterpriseNameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        enterpriseNameJLabel.setMinimumSize(new java.awt.Dimension(170, 24));
        enterpriseNameJLabel.setPreferredSize(new java.awt.Dimension(170, 24));

        networkNameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        networkNameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        networkNameJLabel.setMaximumSize(new java.awt.Dimension(195, 24));
        networkNameJLabel.setMinimumSize(new java.awt.Dimension(195, 24));
        networkNameJLabel.setPreferredSize(new java.awt.Dimension(195, 24));

        organizationNameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        organizationNameJLabel.setMinimumSize(new java.awt.Dimension(170, 24));
        organizationNameJLabel.setPreferredSize(new java.awt.Dimension(190, 24));

        titleJLabel.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        titleJLabel.setText("Select Wholesaler");

        wholesalerNameJLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        wholesalerNameJLabel.setText("Wholesaler Name");

        wholesalerJComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        wholesalerJComboBox.setMinimumSize(new java.awt.Dimension(170, 26));
        wholesalerJComboBox.setPreferredSize(new java.awt.Dimension(170, 26));
        wholesalerJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wholesalerJComboBoxActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        backJButton.setText("Back");
        backJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backJButton.setPreferredSize(new java.awt.Dimension(80, 30));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        nextJButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        nextJButton.setText("Next");
        nextJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextJButton.setPreferredSize(new java.awt.Dimension(80, 30));
        nextJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(wholesalerNameJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wholesalerJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(organizationNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(businessNameJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enterpriseNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                                .addComponent(networkNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(316, 316, 316)
                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nextJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(302, 302, 302)
                                .addComponent(titleJLabel)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(businessNameJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enterpriseNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(networkNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(organizationNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titleJLabel)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wholesalerNameJLabel)
                    .addComponent(wholesalerJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(286, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void wholesalerJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wholesalerJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wholesalerJComboBoxActionPerformed
    
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed
    
    private void nextJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextJButtonActionPerformed
        // TODO add your handling code here:
        if (wholesalerJComboBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Select a Wholesaler");
            return;
        }
        
        selectedWholesaler = (Wholesaler) wholesalerJComboBox.getSelectedItem();
        
        OrderDrugsJPanel orderDrugsJPanel = new OrderDrugsJPanel(userProcessContainer, selectedEnterprise, userAccount, selectedNetwork, selectedWholesaler);
        userProcessContainer.add("OrderDrug", orderDrugsJPanel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_nextJButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel businessNameJLabel;
    private javax.swing.JLabel enterpriseNameJLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel networkNameJLabel;
    private javax.swing.JButton nextJButton;
    private javax.swing.JLabel organizationNameJLabel;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JComboBox wholesalerJComboBox;
    private javax.swing.JLabel wholesalerNameJLabel;
    // End of variables declaration//GEN-END:variables
}
