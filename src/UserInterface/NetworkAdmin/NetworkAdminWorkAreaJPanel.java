/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NetworkAdmin;

import Business.Business;
import Business.Network.Network;
import Business.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author mayank
 */
public class NetworkAdminWorkAreaJPanel extends javax.swing.JPanel {
JPanel userProcessContainer;
UserAccount userAccount;
Network selectedNetwork;
Business business;
    /**
     * Creates new form NetworkAdminWorkAreaJPanel
     */
    public NetworkAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount) {
        initComponents();
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        business = Business.getInstance();
        selectedNetwork = business.getNetworkDirectory().getMyNetwork(userAccount);
        
        nameJLabel.setText(userAccount.getEmployee().getPerson().getFirstName() + " " + userAccount.getEmployee().getPerson().getLastName() + " -- ");
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

        businessNameJLabel = new javax.swing.JLabel();
        networkNameJLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nameJLabel = new javax.swing.JLabel();
        titleJLabel = new javax.swing.JLabel();
        manageEnterpriseJButton = new javax.swing.JButton();
        manageEnterpriseAdminJButton = new javax.swing.JButton();

        businessNameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        businessNameJLabel.setText("Drug Tracking System");

        networkNameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        networkNameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        networkNameJLabel.setMaximumSize(new java.awt.Dimension(195, 24));
        networkNameJLabel.setMinimumSize(new java.awt.Dimension(195, 24));
        networkNameJLabel.setPreferredSize(new java.awt.Dimension(195, 24));

        nameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        nameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        titleJLabel.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        titleJLabel.setText("My Work Area");

        manageEnterpriseJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        manageEnterpriseJButton.setText("Manage Enterprise");
        manageEnterpriseJButton.setMaximumSize(new java.awt.Dimension(250, 37));
        manageEnterpriseJButton.setMinimumSize(new java.awt.Dimension(250, 37));
        manageEnterpriseJButton.setPreferredSize(new java.awt.Dimension(250, 37));
        manageEnterpriseJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseJButtonActionPerformed(evt);
            }
        });

        manageEnterpriseAdminJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        manageEnterpriseAdminJButton.setText("Manage Enterprise Admin");
        manageEnterpriseAdminJButton.setMaximumSize(new java.awt.Dimension(250, 37));
        manageEnterpriseAdminJButton.setMinimumSize(new java.awt.Dimension(250, 37));
        manageEnterpriseAdminJButton.setPreferredSize(new java.awt.Dimension(250, 37));
        manageEnterpriseAdminJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseAdminJButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jSeparator1)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(businessNameJLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 489, Short.MAX_VALUE)
                .add(networkNameJLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(239, 239, 239)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(nameJLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 222, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(titleJLabel))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(83, 83, 83)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(manageEnterpriseJButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 251, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(manageEnterpriseAdminJButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(48, 48, 48)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(businessNameJLabel)
                    .add(networkNameJLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(titleJLabel)
                    .add(nameJLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(100, 100, 100)
                .add(manageEnterpriseJButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(manageEnterpriseAdminJButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageEnterpriseJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseJButtonActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseJPanel manageEnterpriseJPanel = new ManageEnterpriseJPanel(userProcessContainer, selectedNetwork, userAccount);
        userProcessContainer.add("manageEnterprise", manageEnterpriseJPanel);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_manageEnterpriseJButtonActionPerformed

    private void manageEnterpriseAdminJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseAdminJButtonActionPerformed
        // TODO add your handling code here:
        ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel = new ManageEnterpriseAdminJPanel(userProcessContainer, selectedNetwork, userAccount);
        userProcessContainer.add("manageEnterpriseAdmin", manageEnterpriseAdminJPanel);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_manageEnterpriseAdminJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel businessNameJLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton manageEnterpriseAdminJButton;
    private javax.swing.JButton manageEnterpriseJButton;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JLabel networkNameJLabel;
    private javax.swing.JLabel titleJLabel;
    // End of variables declaration//GEN-END:variables
}
