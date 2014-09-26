/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.GovernmentDrugLicensingWorkArea;
import Business.WorkAreas.WorkArea;

/**
 *
 * @author mayank
 */
public class GovernmentDrugLicensingRole extends Role {
    
    public GovernmentDrugLicensingRole() {
        
    }
    
    @Override
    public String toString() {
        return ("Drug License Manager");
    }

    @Override
    public WorkArea returnWorkArea() {
        return new GovernmentDrugLicensingWorkArea();
    }
    
}
