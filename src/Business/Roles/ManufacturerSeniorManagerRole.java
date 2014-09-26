/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.ManufacturerSeniorManagerWorkArea;
import Business.WorkAreas.WorkArea;

/**
 *
 * @author mayank
 */
public class ManufacturerSeniorManagerRole extends Role {
    
    public ManufacturerSeniorManagerRole() {
        
    }

    @Override
    public String toString() {
        return ("Senior Manager");
    }

    @Override
    public WorkArea returnWorkArea() {
        return new ManufacturerSeniorManagerWorkArea();
    }
    
    
    
}
