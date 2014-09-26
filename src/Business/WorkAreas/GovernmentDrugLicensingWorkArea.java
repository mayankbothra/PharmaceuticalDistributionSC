/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkAreas;

import Business.UserAccount;
import Business.Views.GovernmentDrugLicensingView;
import Business.Views.View;
import javax.swing.JPanel;

/**
 *
 * @author mayank
 */
public class GovernmentDrugLicensingWorkArea extends WorkArea {
    
    @Override
    public View createView(JPanel userProcessContainer, UserAccount userAccount) {
        return new GovernmentDrugLicensingView(userProcessContainer, userAccount);
    }
    
}
