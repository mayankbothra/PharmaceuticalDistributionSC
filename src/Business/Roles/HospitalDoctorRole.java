/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.HospitalDoctorWorkArea;
import Business.WorkAreas.WorkArea;

/**
 *
 * @author Mayank
 */
public class HospitalDoctorRole extends Role {
    
    public HospitalDoctorRole() {
      
    }

    @Override
    public String toString() {
        return ("Doctor");
    }

    @Override
    public WorkArea returnWorkArea() {
        return new HospitalDoctorWorkArea();
    }
    
    
}
