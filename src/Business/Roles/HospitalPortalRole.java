/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.HospitalPortalWorkArea;
import Business.WorkAreas.WorkArea;

/**
 *
 * @author Mayank
 */
public class HospitalPortalRole extends Role {
    
    public HospitalPortalRole() {
      
    }

    @Override
    public String toString() {
        return ("Admin");
    }

    @Override
    public WorkArea returnWorkArea() {
        return new HospitalPortalWorkArea();
    }
    
    
}
