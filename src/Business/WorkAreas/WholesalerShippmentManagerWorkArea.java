/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkAreas;

import Business.UserAccount;
import Business.Views.View;
import Business.Views.WholesalerShippmentManagerView;
import javax.swing.JPanel;

/**
 *
 * @author Mayank
 */
public class WholesalerShippmentManagerWorkArea extends WorkArea{
    
    @Override
    public View createView(JPanel userProcessContainer, UserAccount userAccount) {
        return new WholesalerShippmentManagerView(userProcessContainer, userAccount);
    }
}
