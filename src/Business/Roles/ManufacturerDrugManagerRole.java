/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.ManufacturerDrugManagerWorkArea;
import Business.WorkAreas.WorkArea;

/**
 *
 * @author Mayank
 */
public class ManufacturerDrugManagerRole extends Role {
    
    public ManufacturerDrugManagerRole () {
    }

    @Override
    public String toString() {
        return ("Drug Manager");
    }

    @Override
    public WorkArea returnWorkArea() {
        return new ManufacturerDrugManagerWorkArea();
    }
}
