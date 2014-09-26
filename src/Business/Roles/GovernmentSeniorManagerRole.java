/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.GovernmentSeniorManagerWorkArea;
import Business.WorkAreas.WorkArea;

/**
 *
 * @author mayank
 */
public class GovernmentSeniorManagerRole extends Role {
    
    public GovernmentSeniorManagerRole() {
        
    }

    @Override
    public String toString() {
        return ("Senior Manager");
    }

    @Override
    public WorkArea returnWorkArea() {
        return new GovernmentSeniorManagerWorkArea();
    }
    
    
    
}
