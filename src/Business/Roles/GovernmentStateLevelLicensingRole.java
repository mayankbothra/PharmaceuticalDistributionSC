/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.GovernmentStateLevelLicensingWorkArea;
import Business.WorkAreas.WorkArea;

/**
 *
 * @author mayank
 */
public class GovernmentStateLevelLicensingRole extends Role {
    
    public GovernmentStateLevelLicensingRole() {
        
    }
    
    @Override
    public String toString() {
        return ("State License Manager");
    }

    @Override
    public WorkArea returnWorkArea() {
        return new GovernmentStateLevelLicensingWorkArea();
    }
    
}
