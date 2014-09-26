/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Mayank
 */
public class OrderItem {
 
    private Drug drug;
    private int quantity;
    private String quantStatus;

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

    public String getQuantStatus() {
        return quantStatus;
    }

    public void setQuantStatus(String quantStatus) {
        this.quantStatus = quantStatus;
    }

    @Override
    public String toString() {
        return (drug.getDrugName());
    }
            
}
