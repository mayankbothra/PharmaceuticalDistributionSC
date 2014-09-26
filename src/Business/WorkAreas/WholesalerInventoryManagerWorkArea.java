/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkAreas;

import Business.UserAccount;
import Business.Views.View;
import Business.Views.WholesalerInventoryManagerView;
import javax.swing.JPanel;

/**
 *
 * @author Mayank
 */
public class WholesalerInventoryManagerWorkArea extends WorkArea {
    
    @Override
    public View createView(JPanel userProcessContainer, UserAccount userAccount) {
        return new WholesalerInventoryManagerView(userProcessContainer, userAccount);
    }
}
