/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author mayank
 */
public class TransactionHistory {
    
    private ArrayList<Transaction> transactionList;
    private Patient patient;
    
    public TransactionHistory() {
        transactionList = new ArrayList<>();
    }

    public ArrayList<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(ArrayList<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    
    public Transaction newTransaction() {
        Transaction transaction = new Transaction();
        transactionList.add(transaction);
        return transaction;
    }
            
}
