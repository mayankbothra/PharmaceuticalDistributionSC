/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.Inventory;

/**
 *
 * @author Mayank
 */
public class TheftWorkRequest extends WorkRequest{
    
    private ReceiveShippmentWorkRequest receiveShippmentWorkRequest;
    private Inventory theftInventory;
    
    public TheftWorkRequest() {
        
    }

    public ReceiveShippmentWorkRequest getReceiveShippmentWorkRequest() {
        return receiveShippmentWorkRequest;
    }

    public void setReceiveShippmentWorkRequest(ReceiveShippmentWorkRequest receiveShippmentWorkRequest) {
        this.receiveShippmentWorkRequest = receiveShippmentWorkRequest;
    }

    
    public Inventory getTheftInventory() {
        return theftInventory;
    }

    public void setTheftInventory(Inventory theftInventory) {
        this.theftInventory = theftInventory;
    }
    
    
    @Override
    public String toString() {
       return WorkRequest.Type.TheftWorkRequest.toString();
    }
}
