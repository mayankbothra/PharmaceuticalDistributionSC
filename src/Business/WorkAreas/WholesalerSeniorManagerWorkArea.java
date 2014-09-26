/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkAreas;

import Business.UserAccount;
import Business.Views.View;
import Business.Views.WholesalerSeniorManagerView;
import javax.swing.JPanel;

/**
 *
 * @author mayank
 */
public class WholesalerSeniorManagerWorkArea extends WorkArea {
    
    @Override
    public View createView(JPanel userProcessContainer, UserAccount userAccount) {
        return new WholesalerSeniorManagerView(userProcessContainer, userAccount);
    }
}
