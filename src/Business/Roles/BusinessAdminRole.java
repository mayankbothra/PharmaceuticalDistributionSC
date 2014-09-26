/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.WorkAreas.BusinessAdminWorkArea;
import Business.WorkAreas.WorkArea;



/**
 *
 * @author Mayank
 */
public class BusinessAdminRole extends Role {
    
    public BusinessAdminRole() {
        
    }

    @Override
    public String toString() {
        return ("Business Admin");
    }

    @Override
    public WorkArea returnWorkArea() {
        return new BusinessAdminWorkArea();
    }
}
