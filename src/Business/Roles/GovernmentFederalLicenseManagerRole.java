/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.GovernmentFederalLicenseManagerWorkArea;
import Business.WorkAreas.WorkArea;

/**
 *
 * @author mayank
 */
public class GovernmentFederalLicenseManagerRole extends Role {
    
    public GovernmentFederalLicenseManagerRole() {
        
    }
    
    @Override
    public String toString() {
        return ("Federal License Manager");
    }

    @Override
    public WorkArea returnWorkArea() {
        return new GovernmentFederalLicenseManagerWorkArea();
    }
    
}
