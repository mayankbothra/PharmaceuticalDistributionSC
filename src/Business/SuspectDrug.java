/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author mayank
 */
public class SuspectDrug {

    private MedicinePackage medicinePackage;
    private String adverseEvent;

    public MedicinePackage getMedicinePackage() {
        return medicinePackage;
    }

    public void setMedicinePackage(MedicinePackage medicinePackage) {
        this.medicinePackage = medicinePackage;
    }

    public String getAdverseEvent() {
        return adverseEvent;
    }

    public void setAdverseEvent(String adverseEvent) {
        this.adverseEvent = adverseEvent;
    }
    
    

    
}
