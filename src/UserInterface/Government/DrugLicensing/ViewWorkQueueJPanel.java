/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Government.DrugLicensing;

import Business.Enterprises.Enterprise;
import Business.Network.Network;
import Business.Organizations.Organization;
import Business.UserAccount;
import Business.WorkRequest.DrugCreationWorkRequest;
import Business.WorkRequest.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mayank
 */
public class ViewWorkQueueJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise selectedEnterprise;
    UserAccount userAccount;
    Network selectedNetwork;

    /**
     * Creates new form OrderDrugsJPanel
     */
    public ViewWorkQueueJPanel(JPanel userProcessContainer, Enterprise selectedEnterprise, UserAccount userAccount, Network selectedNetwork) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.selectedEnterprise = selectedEnterprise;
        this.userAccount = userAccount;
        this.selectedNetwork = selectedNetwork;

        enterpriseNameJLabel.setText(" --  " + selectedEnterprise.getEnterpriseName());
        networkNameJLabel.setText(selectedNetwork.getNetworkName());

        Organization organization = selectedEnterprise.getMyOrganization(userAccount);
        organizationNameJLabel.setText(organization.getOrganizationName());

        refreshWorkQueue();
    }

    public void refreshWorkQueue() {

        int rowCount = workQueueJTable.getRowCount();
        DefaultTableModel model = (DefaultTableModel) workQueueJTable.getModel();

        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }

        Organization org = selectedEnterprise.getMyOrganization(userAccount);

        for (WorkRequest request : org.getWorkQueue().getWorkRequestList()) {
            Object row[] = new Object[6];
            row[0] = request;
            row[1] = request.getRequestDate();
            row[2] = request.getSender();
            row[3] = request.getReceiver();
            row[4] = request.getStatus();
            row[5] = request.getResolveDate();

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

        businessNameJLabel = new javax.swing.JLabel();
        enterpriseNameJLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        organizationNameJLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        titleJLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workQueueJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        viewDetailsJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        networkNameJLabel = new javax.swing.JLabel();
        assignToMeJButton = new javax.swing.JButton();

        businessNameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        businessNameJLabel.setText("Drug Tracking System");

        enterpriseNameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        enterpriseNameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        enterpriseNameJLabel.setMinimumSize(new java.awt.Dimension(170, 24));
        enterpriseNameJLabel.setPreferredSize(new java.awt.Dimension(170, 24));

        organizationNameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        organizationNameJLabel.setMinimumSize(new java.awt.Dimension(170, 24));
        organizationNameJLabel.setPreferredSize(new java.awt.Dimension(190, 24));

        titleJLabel.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        titleJLabel.setText("Work Queue");

        workQueueJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Type", "Assigned Date", "Sender", "Receiver", "Status", "Resolved Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workQueueJTable);
        workQueueJTable.getColumnModel().getColumn(0).setPreferredWidth(12);
        workQueueJTable.getColumnModel().getColumn(1).setPreferredWidth(15);
        workQueueJTable.getColumnModel().getColumn(2).setPreferredWidth(12);
        workQueueJTable.getColumnModel().getColumn(3).setPreferredWidth(12);
        workQueueJTable.getColumnModel().getColumn(4).setPreferredWidth(13);
        workQueueJTable.getColumnModel().getColumn(5).setPreferredWidth(15);

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        viewDetailsJButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        viewDetailsJButton.setText("View Details");
        viewDetailsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        networkNameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        networkNameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        networkNameJLabel.setMaximumSize(new java.awt.Dimension(195, 24));
        networkNameJLabel.setMinimumSize(new java.awt.Dimension(195, 24));
        networkNameJLabel.setPreferredSize(new java.awt.Dimension(195, 24));

        assignToMeJButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        assignToMeJButton.setText("Assign To Me");
        assignToMeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToMeJButtonActionPerformed(evt);
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
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(organizationNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(businessNameJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enterpriseNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 430, Short.MAX_VALUE)
                                .addComponent(networkNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(refreshJButton)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(assignToMeJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewDetailsJButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(437, 437, 437)
                .addComponent(titleJLabel)
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
                .addGap(21, 21, 21)
                .addComponent(refreshJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewDetailsJButton)
                    .addComponent(backJButton)
                    .addComponent(assignToMeJButton))
                .addContainerGap(183, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void viewDetailsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = workQueueJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select Work Request");
            return;
        }


        WorkRequest request = (WorkRequest) workQueueJTable.getValueAt(selectedRow, 0);

        if (request.getReceiver() == null) {
            JOptionPane.showMessageDialog(null, "This Work Request Has Not Been Assigned");
            return;
        }
        
        DrugCreationWorkRequest req = (DrugCreationWorkRequest) request;
        if (req.getStatus() == WorkRequest.Status.Processed) {
            JOptionPane.showMessageDialog(null, "This Work Request Has Already Been Processed");
            return;
        }

        ViewDrugDetailsJPanel viewDrugDetailsJPanel = new ViewDrugDetailsJPanel(userProcessContainer, selectedEnterprise, userAccount, selectedNetwork, req, this);
        userProcessContainer.add("ViewDrugDetails", viewDrugDetailsJPanel);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.next(userProcessContainer);

    }//GEN-LAST:event_viewDetailsJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
        refreshWorkQueue();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void assignToMeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToMeJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = workQueueJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select Work Request");
            return;
        }

        WorkRequest request = (WorkRequest) workQueueJTable.getValueAt(selectedRow, 0);

        if (request.getReceiver() != null) {
            JOptionPane.showMessageDialog(null, "This Work Request Has Already Been Assigned");
            return;
        }

        request.setReceiver(userAccount);
        refreshWorkQueue();
    }//GEN-LAST:event_assignToMeJButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignToMeJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel businessNameJLabel;
    private javax.swing.JLabel enterpriseNameJLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel networkNameJLabel;
    private javax.swing.JLabel organizationNameJLabel;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JButton viewDetailsJButton;
    private javax.swing.JTable workQueueJTable;
    // End of variables declaration//GEN-END:variables
}
