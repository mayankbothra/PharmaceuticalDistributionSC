/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.HospitalPharmacyManagerWorkArea;
import Business.WorkAreas.WorkArea;

/**
 *
 * @author Mayank
 */
public class HospitalPharmacyManagerRole extends Role {
    
    public HospitalPharmacyManagerRole() {
      
    }

    @Override
    public String toString() {
        return ("Pharmacy Manager");
    }

    @Override
    public WorkArea returnWorkArea() {
        return new HospitalPharmacyManagerWorkArea();
    }
    
    
}
