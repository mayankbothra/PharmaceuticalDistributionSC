/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkAreas;

import Business.UserAccount;
import Business.Views.GovernmentStateLevelLicensingView;
import Business.Views.View;
import javax.swing.JPanel;

/**
 *
 * @author mayank
 */
public class GovernmentStateLevelLicensingWorkArea extends WorkArea {
    
    @Override
    public View createView(JPanel userProcessContainer, UserAccount userAccount) {
        return new GovernmentStateLevelLicensingView(userProcessContainer, userAccount);
    }
    
}
