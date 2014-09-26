/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.TrackingPortalWorkArea;
import Business.WorkAreas.WorkArea;

/**
 *
 * @author Mayank
 */
public class TrackingPortalRole extends Role {
    
    public TrackingPortalRole() {
      
    }

    @Override
    public String toString() {
        return ("Admin");
    }

    @Override
    public WorkArea returnWorkArea() {
        return new TrackingPortalWorkArea();
    }
    
    
}
