/*
 * PlaceOrderJPanel.java
 *
 * Created on October 10, 2008, 9:10 AM
 */
package UserInterface.Hospital.InventoryManager;

import Business.Drug;
import Business.DrugCatalog;
import Business.Enterprises.Enterprise;
import Business.Enterprises.Hospital;
import Business.Enterprises.Manufacturer;
import Business.Enterprises.Wholesaler;
import Business.Network.Network;
import Business.Order;
import Business.OrderItem;
import Business.Organizations.Organization;
import Business.UserAccount;
import Business.WorkRequest.OrderDrugsWorkRequest;
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
public class OrderDrugsJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise selectedEnterprise;
    UserAccount userAccount;
    Network selectedNetwork;
    Wholesaler selectedWholesaler;
    Manufacturer manufacturer;    
    Order tempOrder;
    int selectedRow;

    /**
     * Creates new form PlaceOrderJPanel
     */
    public OrderDrugsJPanel(JPanel userProcessContainer, Enterprise selectedEnterprise, UserAccount userAccount, Network selectedNetwork, Wholesaler selectedWholesaler) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.selectedEnterprise = (Hospital) selectedEnterprise;
        this.userAccount = userAccount;
        this.selectedNetwork = selectedNetwork;
        this.selectedWholesaler = selectedWholesaler;
        
        enterpriseNameJLabel.setText(" --  " + selectedEnterprise.getEnterpriseName());
        networkNameJLabel.setText(selectedNetwork.getNetworkName());

        Organization o = selectedEnterprise.getMyOrganization(userAccount);
        organizationNameJLabel.setText(o.getOrganizationName());
        
        manufacturerNameJTextField.setText(selectedWholesaler.getEnterpriseName());
        
        ArrayList<Enterprise> entList = Business.Business.getInstance().getEnterpriseList(Enterprise.Type.MANUFACTURER);
        
        
        manufacturerJComboBox.removeAllItems();
//        manufacturerJComboBox.addItem("Select Manufacturer");
        for(Enterprise m : entList) {
            for(String mName : selectedWholesaler.getManufacturerList()) {
                if(mName.equals(m.getEnterpriseName())) {
                    manufacturerJComboBox.addItem(m);
                }
            }
        }

        
        tempOrder = new Order();
    }

    private void refreshDrugCatalog(DrugCatalog drugCatalog) {

        int rowCount = drugCatalogJTable.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) drugCatalogJTable.getModel()).removeRow(i);
        }

        for (Drug drug : drugCatalog.getDrugList()) {
            Object row[] = new Object[2];
            row[0] = drug.getDrugId();
            row[1] = drug;

            ((DefaultTableModel) drugCatalogJTable.getModel()).addRow(row);
        }
    }

    private void refreshItemList() {

        int rowCount = itemJTable.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            ((DefaultTableModel) itemJTable.getModel()).removeRow(i);
        }

        ArrayList<OrderItem> oiList = tempOrder.getOrderItemList();


        for (OrderItem oi : oiList) {
            Object row[] = new Object[3];
            row[0] = oi;
            row[1] = oi.getDrug().getManufacturerName();
            row[2] = oi.getQuantity();
            ((DefaultTableModel) itemJTable.getModel()).addRow(row);
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
        manufacturerNameJLabel1 = new javax.swing.JLabel();
        manufacturerNameJLabel = new javax.swing.JLabel();
        drugCatJLabel = new javax.swing.JLabel();
        quantityJLabel = new javax.swing.JLabel();
        drugsInCartJLabel = new javax.swing.JLabel();
        manufacturerNameJTextField = new javax.swing.JTextField();
        manufacturerJComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        drugCatalogJTable = new javax.swing.JTable();
        quantityJSpinner = new javax.swing.JSpinner();
        addToCartJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        itemJTable = new javax.swing.JTable();
        modifyQuantityJButton = new javax.swing.JButton();
        removeItemJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        checkOutJButton = new javax.swing.JButton();

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
        titleJLabel.setText("Order Drugs");

        manufacturerNameJLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        manufacturerNameJLabel1.setText("Wholesaler Name");

        manufacturerNameJLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        manufacturerNameJLabel.setText("Manufacturer Name");

        drugCatJLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        drugCatJLabel.setText("Drug Catalog");

        quantityJLabel.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        quantityJLabel.setText("Quantity:");

        drugsInCartJLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        drugsInCartJLabel.setText("Drugs In Cart");

        manufacturerNameJTextField.setEditable(false);
        manufacturerNameJTextField.setMinimumSize(new java.awt.Dimension(150, 28));
        manufacturerNameJTextField.setPreferredSize(new java.awt.Dimension(150, 28));
        manufacturerNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufacturerNameJTextFieldActionPerformed(evt);
            }
        });

        manufacturerJComboBox.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        manufacturerJComboBox.setMinimumSize(new java.awt.Dimension(170, 26));
        manufacturerJComboBox.setPreferredSize(new java.awt.Dimension(170, 26));
        manufacturerJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufacturerJComboBoxActionPerformed(evt);
            }
        });

        drugCatalogJTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        drugCatalogJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Drug ID", "Drug Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(drugCatalogJTable);

        quantityJSpinner.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        quantityJSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        addToCartJButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        addToCartJButton.setText("Add To Cart");
        addToCartJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartJButtonActionPerformed(evt);
            }
        });

        itemJTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        itemJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Drug Name", "Manufacturer Name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(itemJTable);

        modifyQuantityJButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        modifyQuantityJButton.setText("Modify Quantity");
        modifyQuantityJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyQuantityJButtonActionPerformed(evt);
            }
        });

        removeItemJButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        removeItemJButton.setText("Remove");
        removeItemJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeItemJButtonActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        checkOutJButton.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        checkOutJButton.setText("Check Out");
        checkOutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(organizationNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(businessNameJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enterpriseNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                        .addComponent(networkNameJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(drugCatJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(checkOutJButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(backJButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(modifyQuantityJButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(removeItemJButton))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(drugsInCartJLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(quantityJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantityJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(addToCartJButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(346, 346, 346)
                                .addComponent(titleJLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(manufacturerNameJLabel1)
                                    .addComponent(manufacturerNameJLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(manufacturerJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(manufacturerNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(133, 133, 133)))
                .addGap(0, 204, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manufacturerNameJLabel1)
                    .addComponent(manufacturerNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manufacturerNameJLabel)
                    .addComponent(manufacturerJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(drugCatJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityJLabel)
                    .addComponent(addToCartJButton))
                .addGap(35, 35, 35)
                .addComponent(drugsInCartJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifyQuantityJButton)
                    .addComponent(removeItemJButton)
                    .addComponent(backJButton))
                .addGap(18, 18, 18)
                .addComponent(checkOutJButton)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkOutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutJButtonActionPerformed
        // TODO add your handling code here:
        if (tempOrder.getOrderItemList().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cart is Empty");
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yy HH:mm:ss");
        Date date = new Date();
        String currentDate = sdf.format(date);
        tempOrder.setDate(currentDate);
        
        OrderDrugsWorkRequest request = (OrderDrugsWorkRequest)selectedWholesaler.getWholesalerInventoryManagementOrganization().getWorkQueue().newWorkRequest(WorkRequest.Type.OrderDrugs);
        request.setOrder(tempOrder);
        request.setRequestDate(currentDate);
        request.setSender(userAccount);
        request.setStatus(WorkRequest.Status.OrderPlaced);
        
        Organization o = selectedEnterprise.getMyOrganization(userAccount);
        o.getSentWorkQueue().addRequest(request);
        
        JOptionPane.showMessageDialog(null, "Order Placed Successfully");
        userProcessContainer.remove(this);
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        cardLayout.previous(userProcessContainer);
    }//GEN-LAST:event_checkOutJButtonActionPerformed

    private void addToCartJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartJButtonActionPerformed
        // TODO add your handling code here:
        boolean flag = true;
        selectedRow = drugCatalogJTable.getSelectedRow();

        if (selectedRow < 0 || selectedRow > drugCatalogJTable.getRowCount()) {
            JOptionPane.showMessageDialog(null, "Select a Drug");
            return;
        }

        Drug selectedDrug = (Drug) drugCatalogJTable.getValueAt(selectedRow, 1);

        int quantity = (Integer) quantityJSpinner.getValue();

        for (OrderItem oi : tempOrder.getOrderItemList()) {
            if (oi.getDrug().equals(selectedDrug)) {
                oi.setQuantity(oi.getQuantity() + quantity);
                flag = false;
            }
        }

        if (flag) {
            OrderItem oi = tempOrder.newOrderItem();
            oi.setDrug(selectedDrug);
            oi.setQuantity(quantity);
        }

        refreshItemList();

        quantityJSpinner.setValue(1);
        JOptionPane.showMessageDialog(null, "Drug Added to Cart Successfully");
}//GEN-LAST:event_addToCartJButtonActionPerformed

    private void modifyQuantityJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyQuantityJButtonActionPerformed
        // TODO add your handling code here:
        selectedRow = itemJTable.getSelectedRow();

        if (selectedRow < 0 || selectedRow > itemJTable.getRowCount()) {
            JOptionPane.showMessageDialog(null, "Select a Drug to Modify Quantity");
            return;
        }

        OrderItem oi = (OrderItem) itemJTable.getValueAt(selectedRow, 0);
        Drug selectedDrug = oi.getDrug();

        try {
            String newQuant = JOptionPane.showInputDialog(null, "Enter Quantity");
            int newQuantity = Integer.parseInt(newQuant);
            oi.setQuantity(newQuantity);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Quantity Should Be Numeric");
        }

        refreshItemList();
        

        JOptionPane.showMessageDialog(null, "Quantity of " + selectedDrug.getDrugName() + " Modified Successfully");
    }//GEN-LAST:event_modifyQuantityJButtonActionPerformed

    private void removeItemJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeItemJButtonActionPerformed
        // TODO add your handling code here:
        selectedRow = itemJTable.getSelectedRow();
        if (selectedRow < 0 || selectedRow > itemJTable.getRowCount()) {
            JOptionPane.showMessageDialog(null, "Select a Drug to Delete");
            return;
        }

        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove drug from the cart?", "Remove Drug", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            OrderItem oi = (OrderItem) itemJTable.getValueAt(selectedRow, 0);
            tempOrder.getOrderItemList().remove(oi);
            refreshItemList();
           
        
            JOptionPane.showMessageDialog(null, "Selected Drug was Successfully Removed from the Cart");
        }
    }//GEN-LAST:event_removeItemJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to go back?", "Back", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            
            userProcessContainer.remove(this);
            CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
            cardLayout.previous(userProcessContainer);
        }
    }//GEN-LAST:event_backJButtonActionPerformed

    private void manufacturerJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufacturerJComboBoxActionPerformed
        // TODO add your handling code here:
        
        if(manufacturerJComboBox.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Select A Manufacturer");
            return;
        }
        
        manufacturer = (Manufacturer)manufacturerJComboBox.getSelectedItem();
        
        if(manufacturer == null){
            return;
        }
        DrugCatalog dc = manufacturer.getDrugCatalog();
        refreshDrugCatalog(dc);
    }//GEN-LAST:event_manufacturerJComboBoxActionPerformed

    private void manufacturerNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufacturerNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manufacturerNameJTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel businessNameJLabel;
    private javax.swing.JButton checkOutJButton;
    private javax.swing.JLabel drugCatJLabel;
    private javax.swing.JTable drugCatalogJTable;
    private javax.swing.JLabel drugsInCartJLabel;
    private javax.swing.JLabel enterpriseNameJLabel;
    private javax.swing.JTable itemJTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox manufacturerJComboBox;
    private javax.swing.JLabel manufacturerNameJLabel;
    private javax.swing.JLabel manufacturerNameJLabel1;
    private javax.swing.JTextField manufacturerNameJTextField;
    private javax.swing.JButton modifyQuantityJButton;
    private javax.swing.JLabel networkNameJLabel;
    private javax.swing.JLabel organizationNameJLabel;
    private javax.swing.JLabel quantityJLabel;
    private javax.swing.JSpinner quantityJSpinner;
    private javax.swing.JButton removeItemJButton;
    private javax.swing.JLabel titleJLabel;
    // End of variables declaration//GEN-END:variables
}