/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.EnterpriseAdminWorkArea;
import Business.WorkAreas.WorkArea;

/**
 *
 * @author Mayank
 */
public class EnterpriseAdminRole extends Role {
    
    public EnterpriseAdminRole() {
     
    }

    @Override
    public String toString() {
        return ("Enterprise Admin");
    }

    @Override
    public WorkArea returnWorkArea() {
        return new EnterpriseAdminWorkArea();
    }
}
