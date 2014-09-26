/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.ManufacturingManagerWorkArea;
import Business.WorkAreas.WorkArea;

/**
 *
 * @author mayank
 */
public class ManufacturingManagerRole extends Role {
    
    public ManufacturingManagerRole() {
        
    }

    @Override
    public String toString() {
        return ("Manufacturing Manager");
    }

    @Override
    public WorkArea returnWorkArea() {
        return new ManufacturingManagerWorkArea();
    }
    
    
    
}
