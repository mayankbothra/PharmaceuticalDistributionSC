/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author mayank
 */
public class MedicinePackage {
    
    private static int count = 1000100010;
    private Batch batch;
    private int uniqueID;
    private TransactionHistory transactionHistory;
    
    public MedicinePackage() {
     count++;
     uniqueID = count;
     transactionHistory = new TransactionHistory();
    } 

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    public TransactionHistory getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(TransactionHistory transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        MedicinePackage.count = count;
    }
    
    @Override
    public String toString() {
        return (String.valueOf(uniqueID));
    }
}
