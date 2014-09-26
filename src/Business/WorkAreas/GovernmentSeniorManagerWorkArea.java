/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkAreas;

import Business.UserAccount;
import Business.Views.GovernmentSeniorManagerView;
import Business.Views.View;
import javax.swing.JPanel;

/**
 *
 * @author mayank
 */
public class GovernmentSeniorManagerWorkArea extends WorkArea {
    
    @Override
    public View createView(JPanel userProcessContainer, UserAccount userAccount) {
        return new GovernmentSeniorManagerView(userProcessContainer, userAccount);
    }
}
