/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.HospitalSeniorManagerWorkArea;
import Business.WorkAreas.WorkArea;

/**
 *
 * @author mayank
 */
public class HospitalSeniorManagerRole extends Role {
    
    public HospitalSeniorManagerRole() {
        
    }

    @Override
    public String toString() {
        return ("Senior Manager");
    }

    @Override
    public WorkArea returnWorkArea() {
        return new HospitalSeniorManagerWorkArea();
    }
    
    
    
}
