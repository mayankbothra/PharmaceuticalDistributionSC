/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Government.FederalLicenseManager;

import Business.Business;
import Business.Enterprises.Enterprise;
import Business.Enterprises.Government;
import Business.Network.Network;
import Business.Organizations.Organization;
import Business.UserAccount;
import Business.WorkRequest.ApplyForLicenseWorkRequest;
import Business.WorkRequest.DrugCreationWorkRequest;
import Business.WorkRequest.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Mayank
 */
public class ViewEnterpriseDetailsJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount userAccount;
    Government selectedEnterprise;
    Network selectedNetwork;
    ApplyForLicenseWorkRequest request;
    ViewWorkQueueJPanel viewWorkQueueJPanel;
    Enterprise reqEnterprise;
    Network reqNetwork;
    Business business;

    /**
     * Creates new form CreateDrugJPanel
     */
    public ViewEnterpriseDetailsJPanel(JPanel userProcessContainer, Enterprise selectedEnterprise, UserAccount userAccount, Network selectedNetwork, ApplyForLicenseWorkRequest request, ViewWorkQueueJPanel viewWorkQueueJPanel) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.selectedEnterprise = (Government)selectedEnterprise;
        this.selectedNetwork = selectedNetwork;
        this.request = request;
        this.viewWorkQueueJPanel = (ViewWorkQueueJPanel)viewWorkQueueJPanel;
        enterpriseNameJLabel.setText(" --  " + selectedEnterprise.getEnterpriseName());
        networkNameJLabel.setText(selectedNetwork.getNetworkName());
        
        Organization o = selectedEnterprise.getMyOrganization(userAccount);
        organizationNameJLabel.setText(o.getOrganizationName());
        
        business = Business.getInstance();
        reqNetwork = business.getNetworkDirectory().getMyNetwork(request.getSender());
        reqEnterprise = reqNetwork.getEnterpriseDirectory().getMyEnterprise(request.getSender());
        
        enterpriseTypeJTextField.setText(reqEnterprise.getEnterpriseType());
        enterpriseNameJTextField.setText(reqEnterprise.getEnterpriseName());
        enterpriseAdminJTextField.setText(request.getSender().toString());
        
        if(request.getDecision().equals(ApplyForLicenseWorkRequest.status.PENDING.toString())) {
            approveJButton.setEnabled(true);
            rejectJButton.setEnabled(true);
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
        drugNameJLabel = new javax.swing.JLabel();
        statusJLabel = new javax.swing.JLabel();
        enterpriseAdminJLabel = new javax.swing.JLabel();
        statusJLabel2 = new javax.swing.JLabel();
        enterpriseTypeJTextField = new javax.swing.JTextField();
        enterpriseNameJTextField = new javax.swing.JTextField();
        enterpriseAdminJTextField = new javax.swing.JTextField();
        timeJSpinner = new javax.swing.JSpinner();
        backJButton = new javax.swing.JButton();
        approveJButton = new javax.swing.JButton();
        rejectJButton = new javax.swing.JButton();

        businessNameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        businessNameJLabel.setText("Drug Tracking System");

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
        titleJLabel.setText("Enterprise Details");

        drugNameJLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        drugNameJLabel.setText("Enterprise Type");

        statusJLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        statusJLabel.setText("Enterprise Name");

        enterpriseAdminJLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        enterpriseAdminJLabel.setText("Enterprise Admin");

        statusJLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        statusJLabel2.setText("License Expiry Date");

        enterpriseTypeJTextField.setEditable(false);
        enterpriseTypeJTextField.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        enterpriseTypeJTextField.setMinimumSize(new java.awt.Dimension(120, 26));
        enterpriseTypeJTextField.setPreferredSize(new java.awt.Dimension(120, 26));

        enterpriseNameJTextField.setEditable(false);
        enterpriseNameJTextField.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        enterpriseNameJTextField.setMinimumSize(new java.awt.Dimension(120, 26));
        enterpriseNameJTextField.setPreferredSize(new java.awt.Dimension(120, 26));

        enterpriseAdminJTextField.setEditable(false);
        enterpriseAdminJTextField.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        enterpriseAdminJTextField.setMinimumSize(new java.awt.Dimension(120, 26));
        enterpriseAdminJTextField.setPreferredSize(new java.awt.Dimension(120, 26));

        timeJSpinner.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.MINUTE));

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        backJButton.setText("Back");
        backJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backJButton.setPreferredSize(new java.awt.Dimension(80, 30));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        approveJButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        approveJButton.setText("Approve");
        approveJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        approveJButton.setEnabled(false);
        approveJButton.setPreferredSize(new java.awt.Dimension(80, 30));
        approveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveJButtonActionPerformed(evt);
            }
        });

        rejectJButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        rejectJButton.setText("Reject");
        rejectJButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rejectJButton.setEnabled(false);
        rejectJButton.setPreferredSize(new java.awt.Dimension(80, 30));
        rejectJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                        .addComponent(networkNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(approveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rejectJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(statusJLabel)
                                .addComponent(drugNameJLabel)
                                .addComponent(enterpriseAdminJLabel)
                                .addComponent(statusJLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(timeJSpinner)
                                .addComponent(enterpriseTypeJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(enterpriseNameJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(enterpriseAdminJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(titleJLabel)
                        .addGap(34, 34, 34)))
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
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drugNameJLabel)
                    .addComponent(enterpriseTypeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusJLabel)
                    .addComponent(enterpriseNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseAdminJLabel)
                    .addComponent(enterpriseAdminJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusJLabel2))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(approveJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rejectJButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout)userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void rejectJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectJButtonActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yy HH:mm:ss");
        String currentDate = sdf.format(new Date());
        request.setResolveDate(currentDate);
        request.setDecision(DrugCreationWorkRequest.status.REJECTED.toString());
        request.setStatus(WorkRequest.Status.Processed);
        
        reqEnterprise.setLicenseCount(-1);
        reqEnterprise.setLicenseStatus("Rejected");

        viewWorkQueueJPanel.refreshWorkQueue();
        JOptionPane.showMessageDialog(null, "License Rejected");
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
        
    }//GEN-LAST:event_rejectJButtonActionPerformed

    private void approveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveJButtonActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yy HH:mm:ss");
        Date d = new Date();
        String currentDate = sdf.format(d);
        request.setResolveDate(currentDate);
        request.setDecision(DrugCreationWorkRequest.status.APPROVED.toString());
        request.setStatus(WorkRequest.Status.Processed);
        reqEnterprise.setLicenseIssueDate(currentDate);
        Date d1 = (Date)timeJSpinner.getValue();
        reqEnterprise.setLicenseExpiryDate(sdf.format(d1));
        reqEnterprise.setLicenseStatus("Approved");
        
        selectedEnterprise.getApprovedEnterpriseList().add(reqEnterprise);
        
        viewWorkQueueJPanel.refreshWorkQueue();
        JOptionPane.showMessageDialog(null, "License Approved");
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_approveJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel businessNameJLabel;
    private javax.swing.JLabel drugNameJLabel;
    private javax.swing.JLabel enterpriseAdminJLabel;
    private javax.swing.JTextField enterpriseAdminJTextField;
    private javax.swing.JLabel enterpriseNameJLabel;
    private javax.swing.JTextField enterpriseNameJTextField;
    private javax.swing.JTextField enterpriseTypeJTextField;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel networkNameJLabel;
    private javax.swing.JLabel organizationNameJLabel;
    private javax.swing.JButton rejectJButton;
    private javax.swing.JLabel statusJLabel;
    private javax.swing.JLabel statusJLabel2;
    private javax.swing.JSpinner timeJSpinner;
    private javax.swing.JLabel titleJLabel;
    // End of variables declaration//GEN-END:variables
}
