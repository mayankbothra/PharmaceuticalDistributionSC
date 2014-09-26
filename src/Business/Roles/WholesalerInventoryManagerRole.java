/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.WholesalerInventoryManagerWorkArea;
import Business.WorkAreas.WorkArea;

/**
 *
 * @author Mayank
 */
public class WholesalerInventoryManagerRole extends Role {
    
    public WholesalerInventoryManagerRole() {
      
    }

    @Override
    public String toString() {
        return ("Inventory Manager");
    }

    @Override
    public WorkArea returnWorkArea() {
        return new WholesalerInventoryManagerWorkArea();
    }
    
    
}
