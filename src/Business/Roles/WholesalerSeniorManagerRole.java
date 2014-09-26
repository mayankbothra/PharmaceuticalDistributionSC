/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.WholesalerSeniorManagerWorkArea;
import Business.WorkAreas.WorkArea;

/**
 *
 * @author mayank
 */
public class WholesalerSeniorManagerRole extends Role {
    
    public WholesalerSeniorManagerRole() {
        
    }

    @Override
    public String toString() {
        return ("Senior Manager");
    }

    @Override
    public WorkArea returnWorkArea() {
        return new WholesalerSeniorManagerWorkArea();
    }
    
    
    
}
