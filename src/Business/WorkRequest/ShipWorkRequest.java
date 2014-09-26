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
public class ShipWorkRequest extends WorkRequest{
    
    private OrderDrugsWorkRequest orderDrugsWorkRequest;
    private Inventory inventory;
    private Inventory theftInventory;
    
    public ShipWorkRequest() {
        
    }

    public OrderDrugsWorkRequest getOrderDrugsWorkRequest() {
        return orderDrugsWorkRequest;
    }

    public void setOrderDrugsWorkRequest(OrderDrugsWorkRequest orderDrugsToManufacturerWorkRequest) {
        this.orderDrugsWorkRequest = orderDrugsToManufacturerWorkRequest;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Inventory getTheftInventory() {
        return theftInventory;
    }

    public void setTheftInventory(Inventory theftInventory) {
        this.theftInventory = theftInventory;
    }
    
    
    @Override
    public String toString() {
       return WorkRequest.Type.ShipWorkRequest.toString();
    }
}
