/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.GovernmentComplaintManagerWorkArea;
import Business.WorkAreas.WorkArea;

/**
 *
 * @author mayank
 */
public class GovernmentComplaintManagerRole extends Role {
    
    public GovernmentComplaintManagerRole() {
    }
    
    @Override
    public String toString() {
        return ("Complaint Manager");
    }

    @Override
    public WorkArea returnWorkArea() {
        return new GovernmentComplaintManagerWorkArea();
    }
    
}
