/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author mayank
 */
public class Batch {
    private static int count = 22134;
    private Drug drug;
    private int batchID;
    private String manufacturingDate;
    private String expiryDate;
    private int quantity;
    
    public Batch() {
        count++;
        batchID = count;
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public int getBatchID() {
        return batchID;
    }

    public void setBatchID(int batchID) {
        this.batchID = batchID;
    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Batch.count = count;
    }

    @Override
    public String toString() {
        return (String.valueOf(batchID));
    }
    
    
    
}
