/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkAreas;

import Business.UserAccount;
import Business.Views.View;
import javax.swing.JPanel;

/**
 *
 * @author Mayank
 */
public abstract class WorkArea {
    
    
    
    public abstract View createView(JPanel userProcessContainer, UserAccount userAccount);
    
}
