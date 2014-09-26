/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.NetworkAdminWorkArea;
import Business.WorkAreas.WorkArea;



/**
 *
 * @author Mayank
 */
public class NetworkAdminRole extends Role {
    
    public NetworkAdminRole() {
     
    }

    @Override
    public String toString() {
        return ("Network Admin");
    }

    @Override
    public WorkArea returnWorkArea() {
        return new NetworkAdminWorkArea();
    }
}
