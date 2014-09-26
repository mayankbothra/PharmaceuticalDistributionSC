/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.UserAccount;
import UserInterface.Government.FederalLicenseManager.FederalLicenseManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author mayank
 */
public class GovernmentFederalLicenseManagerView extends View {
    JPanel userProcessContainer;
    UserAccount userAccount;
    
    public GovernmentFederalLicenseManagerView(JPanel userProcessContainer, UserAccount userAccount) {
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
    }

    @Override
    public JPanel returnPanel() {
        return new FederalLicenseManagerWorkAreaJPanel(userProcessContainer, userAccount);
    }
    
}
