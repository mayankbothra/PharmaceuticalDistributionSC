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
public class Inventory {
    
    private ArrayList<InventoryItem> inventoryItemList;
    
    public Inventory() {
        inventoryItemList = new ArrayList<>();
    }

    public ArrayList<InventoryItem> getInventoryItemList() {
        return inventoryItemList;
    }

    public void setInventoryItemList(ArrayList<InventoryItem> inventoryItemList) {
        this.inventoryItemList = inventoryItemList;
    }
    
    public InventoryItem newInventoryItem() {
        InventoryItem ii = new InventoryItem();
        inventoryItemList.add(ii);
        return ii;
    }
    
}
