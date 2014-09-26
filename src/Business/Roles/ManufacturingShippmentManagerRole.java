/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.ManufacturerShippmentManagerWorkArea;
import Business.WorkAreas.WorkArea;

/**
 *
 * @author Mayank
 */
public class ManufacturingShippmentManagerRole extends Role {
    
        public ManufacturingShippmentManagerRole() {
       
    }

    @Override
    public String toString() {
        return ("Shippment Manager");
    }

    @Override
    public WorkArea returnWorkArea() {
        return new ManufacturerShippmentManagerWorkArea();
    }
    
}
