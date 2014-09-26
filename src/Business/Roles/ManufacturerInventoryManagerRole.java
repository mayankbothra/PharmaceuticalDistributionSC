/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.ManufacturerInventoryManagerWorkArea;
import Business.WorkAreas.WorkArea;

/**
 *
 * @author Mayank
 */
public class ManufacturerInventoryManagerRole extends Role {
    
    public ManufacturerInventoryManagerRole() {
        
    }

    @Override
    public String toString() {
        return ("Inventory Manager");
    }

    @Override
    public WorkArea returnWorkArea() {
        return new ManufacturerInventoryManagerWorkArea();
    }
    
    
}
