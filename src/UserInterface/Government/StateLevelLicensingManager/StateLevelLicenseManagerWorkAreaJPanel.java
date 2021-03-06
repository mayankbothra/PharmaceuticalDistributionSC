/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Government.StateLevelLicensingManager;

import UserInterface.Government.FederalLicenseManager.*;
import Business.Business;
import Business.Enterprises.Enterprise;
import Business.Network.Network;
import Business.Organizations.Organization;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;




/**
 *
 * @author Mayank
 */
public class StateLevelLicenseManagerWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise selectedEnterprise;
    UserAccount userAccount;
    Business business;
    Network selectedNetwork;

    /**
     * Creates new form InventoryManagerWorkAreaJPanel
     */
    public StateLevelLicenseManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        business = Business.getInstance();
        selectedNetwork = business.getNetworkDirectory().getMyNetwork(userAccount);
        selectedEnterprise = selectedNetwork.getEnterpriseDirectory().getMyEnterprise(userAccount);
        
        enterpriseNameJLabel.setText(" --  " + selectedEnterprise.getEnterpriseName());
        networkNameJLabel.setText(selectedNetwork.getNetworkName());
        
        Organization organization = selectedEnterprise.getMyOrganization(userAccount);
        organizationNameJLabel.setText(organization.getOrganizationName());

        nameJLabel.setText(userAccount.getEmployee().getPerson().getFirstName() + " " + userAccount.getEmployee().getPerson().getLastName() + " -- ");

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
        jSeparator1 = new javax.swing.JSeparator();
        organizationNameJLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        nameJLabel = new javax.swing.JLabel();
        titleJLabel = new javax.swing.JLabel();
        networkNameJLabel = new javax.swing.JLabel();
        viewWorkQueueJButton1 = new javax.swing.JButton();
        viewWorkRequestsJButton1 = new javax.swing.JButton();

        businessNameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        businessNameJLabel.setText("Drug Tracking System");

        enterpriseNameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        enterpriseNameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        enterpriseNameJLabel.setMinimumSize(new java.awt.Dimension(170, 24));
        enterpriseNameJLabel.setPreferredSize(new java.awt.Dimension(170, 24));

        organizationNameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        organizationNameJLabel.setMinimumSize(new java.awt.Dimension(170, 24));
        organizationNameJLabel.setPreferredSize(new java.awt.Dimension(190, 24));

        nameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        nameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        titleJLabel.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        titleJLabel.setText("My Work Area");

        networkNameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        networkNameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        networkNameJLabel.setMaximumSize(new java.awt.Dimension(195, 24));
        networkNameJLabel.setMinimumSize(new java.awt.Dimension(195, 24));
        networkNameJLabel.setPreferredSize(new java.awt.Dimension(195, 24));

        viewWorkQueueJButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        viewWorkQueueJButton1.setText("View Work Queue");
        viewWorkQueueJButton1.setMaximumSize(new java.awt.Dimension(250, 38));
        viewWorkQueueJButton1.setMinimumSize(new java.awt.Dimension(250, 38));
        viewWorkQueueJButton1.setPreferredSize(new java.awt.Dimension(250, 38));
        viewWorkQueueJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewWorkQueueJButton1ActionPerformed(evt);
            }
        });

        viewWorkRequestsJButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        viewWorkRequestsJButton1.setText("View Work Requests");
        viewWorkRequestsJButton1.setMaximumSize(new java.awt.Dimension(250, 38));
        viewWorkRequestsJButton1.setMinimumSize(new java.awt.Dimension(250, 38));
        viewWorkRequestsJButton1.setPreferredSize(new java.awt.Dimension(250, 38));
        viewWorkRequestsJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewWorkRequestsJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(organizationNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(businessNameJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterpriseNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(networkNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(viewWorkRequestsJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewWorkQueueJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleJLabel)
                    .addComponent(nameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addComponent(viewWorkQueueJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewWorkRequestsJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(223, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewWorkQueueJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewWorkQueueJButton1ActionPerformed
        // TODO add your handling code here:
        ViewWorkQueueJPanel viewWorkQueueJPanel = new ViewWorkQueueJPanel(userProcessContainer, selectedEnterprise, userAccount, selectedNetwork);
        userProcessContainer.add("ViewWorkQueue", viewWorkQueueJPanel);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_viewWorkQueueJButton1ActionPerformed

    private void viewWorkRequestsJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewWorkRequestsJButton1ActionPerformed
        // TODO add your handling code here:
        ViewWorkRequestsJPanel viewWorkRequestsJPanel = new ViewWorkRequestsJPanel(userProcessContainer, selectedEnterprise, userAccount, selectedNetwork);
        userProcessContainer.add("ViewWorkRequest", viewWorkRequestsJPanel);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_viewWorkRequestsJButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel businessNameJLabel;
    private javax.swing.JLabel enterpriseNameJLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JLabel networkNameJLabel;
    private javax.swing.JLabel organizationNameJLabel;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JButton viewWorkQueueJButton1;
    private javax.swing.JButton viewWorkRequestsJButton1;
    // End of variables declaration//GEN-END:variables
}
