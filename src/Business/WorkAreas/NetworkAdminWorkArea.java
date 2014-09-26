/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkAreas;

import Business.Enterprises.Enterprise;
import Business.UserAccount;
import Business.Views.NetworkAdminView;
import Business.Views.View;
import javax.swing.JPanel;

/**
 *
 * @author Mayank
 */
public class NetworkAdminWorkArea extends WorkArea {
    
    @Override
    public View createView(JPanel userProcessContainer, UserAccount userAccount) {
        return new NetworkAdminView(userProcessContainer, userAccount);
    }
    
}
