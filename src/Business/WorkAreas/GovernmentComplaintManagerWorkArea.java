/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkAreas;

import Business.UserAccount;
import Business.Views.GovernmentComplaintManagerView;
import Business.Views.GovernmentFederalLicenseManagerView;
import Business.Views.View;
import javax.swing.JPanel;

/**
 *
 * @author mayank
 */
public class GovernmentComplaintManagerWorkArea extends WorkArea {
    
    @Override
    public View createView(JPanel userProcessContainer, UserAccount userAccount) {
        return new GovernmentComplaintManagerView(userProcessContainer, userAccount);
    }
    
}
