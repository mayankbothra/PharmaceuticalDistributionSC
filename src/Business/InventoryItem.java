/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public class InventoryItem {
 
    private ArrayList<MedicinePackage> medicinePackageList;
    private int quantity;
    private Drug drug;
    
    public InventoryItem() {
        medicinePackageList = new ArrayList<>();
    } 

    public ArrayList<MedicinePackage> getMedicinePackageList() {
        return medicinePackageList;
    }

    public void setMedicinePackageList(ArrayList<MedicinePackage> medicinePackageList) {
        this.medicinePackageList = medicinePackageList;
    }
    
    public MedicinePackage newMedicinePackage() {
        MedicinePackage mp = new MedicinePackage();
        medicinePackageList.add(mp);
        return mp;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.valueOf(quantity);
    }
    
    
    
}
