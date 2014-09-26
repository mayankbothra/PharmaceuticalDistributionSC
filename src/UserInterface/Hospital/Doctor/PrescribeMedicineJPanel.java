/*
 * PlaceOrderJPanel.java
 *
 * Created on October 10, 2008, 9:10 AM
 */
package UserInterface.Hospital.Doctor;

import Business.Drug;
import Business.Enterprises.Enterprise;
import Business.Enterprises.Hospital;
import Business.InventoryItem;
import Business.Network.Network;
import Business.Order;
import Business.OrderItem;
import Business.Organizations.Organization;
import Business.Patient;
import Business.UserAccount;
import Business.VisitRecord;
import Business.WorkRequest.PrescribeDrugsWorkRequest;
import Business.WorkRequest.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mayank
 */
public class PrescribeMedicineJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Hospital selectedEnterprise;
    UserAccount userAccount;
    Network selectedNetwork;
    Order tempOrder;
    int selectedRow;
    Patient patient;
    Drug drug;

    /**
     * Creates new form PlaceOrderJPanel
     */
    public PrescribeMedicineJPanel(JPanel userProcessContainer, Hospital selectedEnterprise, UserAccount userAccount, Network selectedNetwork, Patient patient) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.selectedEnterprise = (Hospital) selectedEnterprise;
        this.userAccount = userAccount;
        this.selectedNetwork = selectedNetwork;
        this.patient = patient;
       
        
        enterpriseNameJLabel.setText(" --  " + selectedEnterprise.getEnterpriseName());
        networkNameJLabel.setText(selectedNetwork.getNetworkName());

        Organization o = selectedEnterprise.getMyOrganization(userAccount);
        organizationNameJLabel.setText(o.getOrganizationName());
        
        patientNameJTextField.setText(patient.getPerson().toString());
        
        ArrayList<Enterprise> entList = Business.Business.getInstance().getEnterpriseList(Enterprise.Type.MANUFACTURER);
        
        
        medicineJComboBox.removeAllItems();
        medicineJComboBox.addItem("Select Medicine");
        for(InventoryItem ii : selectedEnterprise.getInventory().getInventoryItemList()) {
            medicineJComboBox.addItem(ii.getDrug());
        }
        
        tempOrder = new Order();
    }

    private void refreshPrescriptionList() {

        int rowCount = prescriptionListJTable.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) prescriptionListJTable.getModel()).removeRow(i);
        }

        ArrayList<OrderItem> oiList = tempOrder.getOrderItemList();


        for (OrderItem oi : oiList) {
            Object row[] = new Object[2];
            row[0] = oi;
            row[1] = oi.getQuantity();
            ((DefaultTableModel) prescriptionListJTable.getModel()).addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        businessNameJLabel = new javax.swing.JLabel();
        enterpriseNameJLabel = new javax.swing.JLabel();
        networkNameJLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        organizationNameJLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        titleJLabel = new javax.swing.JLabel();
        patientNameJLabel = new javax.swing.JLabel();
        diagnosisJLabel = new javax.swing.JLabel();
        selectMedicinesTiteJLabel = new javax.swing.JLabel();
        medicineNameJLabel = new javax.swing.JLabel();
        dosageJLabel = new javax.swing.JLabel();
        prescriptionTitleJLabel = new javax.swing.JLabel();
        patientNameJTextField = new javax.swing.JTextField();
        diagnosisJTextField = new javax.swing.JTextField();
        medicineJComboBox = new javax.swing.JComboBox();
        dosageJSpinner = new javax.swing.JSpinner();
        addToListJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        prescriptionListJTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        precribeJButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(750, 511));

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
        titleJLabel.setText("Treat Patient");

        patientNameJLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        patientNameJLabel.setText("Patient Name");

        diagnosisJLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        diagnosisJLabel.setText("Diagnosis");

        selectMedicinesTiteJLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        selectMedicinesTiteJLabel.setText("Select Medicines For Prescription");

        medicineNameJLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        medicineNameJLabel.setText("Medicine Name");

        dosageJLabel.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        dosageJLabel.setText("Dosage");

        prescriptionTitleJLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        prescriptionTitleJLabel.setText("Prescription List");

        patientNameJTextField.setEditable(false);
        patientNameJTextField.setMinimumSize(new java.awt.Dimension(150, 28));
        patientNameJTextField.setPreferredSize(new java.awt.Dimension(150, 28));

        diagnosisJTextField.setMinimumSize(new java.awt.Dimension(150, 28));
        diagnosisJTextField.setPreferredSize(new java.awt.Dimension(150, 28));

        medicineJComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        medicineJComboBox.setMinimumSize(new java.awt.Dimension(170, 26));
        medicineJComboBox.setPreferredSize(new java.awt.Dimension(170, 26));
        medicineJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineJComboBoxActionPerformed(evt);
            }
        });

        dosageJSpinner.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        dosageJSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        addToListJButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        addToListJButton.setText("Add");
        addToListJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToListJButtonActionPerformed(evt);
            }
        });

        prescriptionListJTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        prescriptionListJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Medicine Name", "Medicine Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(prescriptionListJTable);

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        precribeJButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        precribeJButton.setText("Prescribe");
        precribeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precribeJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(selectMedicinesTiteJLabel)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(businessNameJLabel)
                        .addGap(6, 6, 6)
                        .addComponent(enterpriseNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(networkNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(organizationNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(378, 378, 378)
                                .addComponent(titleJLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(354, 354, 354)
                                .addComponent(diagnosisJLabel)
                                .addGap(6, 6, 6)
                                .addComponent(diagnosisJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(medicineNameJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(patientNameJLabel)
                                        .addGap(6, 6, 6)
                                        .addComponent(patientNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(medicineJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addComponent(dosageJLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dosageJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(addToListJButton))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prescriptionTitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(backJButton)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(precribeJButton))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 141, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(businessNameJLabel)
                    .addComponent(enterpriseNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(networkNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(organizationNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(titleJLabel)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(patientNameJLabel))
                    .addComponent(patientNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(diagnosisJLabel))
                    .addComponent(diagnosisJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(selectMedicinesTiteJLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicineNameJLabel)
                    .addComponent(medicineJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dosageJLabel)
                    .addComponent(dosageJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addToListJButton))
                .addGap(55, 55, 55)
                .addComponent(prescriptionTitleJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(precribeJButton))
                .addContainerGap(25, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void precribeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precribeJButtonActionPerformed
        // TODO add your handling code here:
        if (tempOrder.getOrderItemList().isEmpty()) {
            JOptionPane.showMessageDialog(null, "List is Empty");
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yy HH:mm:ss");
        Date date = new Date();
        String currentDate = sdf.format(date);
        tempOrder.setDate(currentDate);

        PrescribeDrugsWorkRequest request = (PrescribeDrugsWorkRequest)selectedEnterprise.getHospitalPharmacyOrganization().getWorkQueue().newWorkRequest(WorkRequest.Type.PrescribeDrugsWorkRequest);
        request.setOrder(tempOrder);
        request.setRequestDate(currentDate);
        request.setSender(userAccount);
        request.setStatus(WorkRequest.Status.Prescribed);
        VisitRecord vr = new VisitRecord();
        vr.setDateOfVisit(currentDate);
        vr.setDiagnosis(diagnosisJTextField.getText());
        request.setPatient(patient);
        request.setVr(vr);
        
        Organization o = selectedEnterprise.getMyOrganization(userAccount);
        o.getSentWorkQueue().addRequest(request);
        
        JOptionPane.showMessageDialog(null, "Patient Treated and Medicines Prescribed");
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_precribeJButtonActionPerformed

    private void addToListJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToListJButtonActionPerformed
        // TODO add your handling code here:
        boolean flag = true;
        
        if(medicineJComboBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Select A Medicine");
            return;
        }
        
        drug = (Drug)medicineJComboBox.getSelectedItem();
        
        int quantity = (Integer) dosageJSpinner.getValue();

        for (OrderItem oi : tempOrder.getOrderItemList()) {
            if (oi.getDrug().equals(drug)) {
                oi.setQuantity(oi.getQuantity() + quantity);
                flag = false;
            }
        }

        if (flag) {
            OrderItem oi = tempOrder.newOrderItem();
            oi.setDrug(drug);
            oi.setQuantity(quantity);
        }

        refreshPrescriptionList();

        dosageJSpinner.setValue(1);
        JOptionPane.showMessageDialog(null, "Drug Added to List Successfully");
}//GEN-LAST:event_addToListJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to go back?", "Back", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            
            userProcessContainer.remove(this);
            CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
            cardLayout.previous(userProcessContainer);
        }
    }//GEN-LAST:event_backJButtonActionPerformed

    private void medicineJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineJComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_medicineJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToListJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel businessNameJLabel;
    private javax.swing.JLabel diagnosisJLabel;
    private javax.swing.JTextField diagnosisJTextField;
    private javax.swing.JLabel dosageJLabel;
    private javax.swing.JSpinner dosageJSpinner;
    private javax.swing.JLabel enterpriseNameJLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox medicineJComboBox;
    private javax.swing.JLabel medicineNameJLabel;
    private javax.swing.JLabel networkNameJLabel;
    private javax.swing.JLabel organizationNameJLabel;
    private javax.swing.JLabel patientNameJLabel;
    private javax.swing.JTextField patientNameJTextField;
    private javax.swing.JButton precribeJButton;
    private javax.swing.JTable prescriptionListJTable;
    private javax.swing.JLabel prescriptionTitleJLabel;
    private javax.swing.JLabel selectMedicinesTiteJLabel;
    private javax.swing.JLabel titleJLabel;
    // End of variables declaration//GEN-END:variables
}