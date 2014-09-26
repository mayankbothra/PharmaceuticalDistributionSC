/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.HospitalInventoryManagerWorkArea;
import Business.WorkAreas.WorkArea;

/**
 *
 * @author Mayank
 */
public class HospitalInventoryManagerRole extends Role {
    
    public HospitalInventoryManagerRole() {
      
    }

    @Override
    public String toString() {
        return ("Inventory Manager");
    }

    @Override
    public WorkArea returnWorkArea() {
        return new HospitalInventoryManagerWorkArea();
    }
    
    
}
