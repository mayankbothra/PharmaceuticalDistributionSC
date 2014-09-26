/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.UserAccount;
import UserInterface.Government.StateLevelLicensingManager.StateLevelLicenseManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author mayank
 */
public class GovernmentStateLevelLicensingView extends View {
    JPanel userProcessContainer;
    UserAccount userAccount;
    
    public GovernmentStateLevelLicensingView(JPanel userProcessContainer, UserAccount userAccount) {
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
    }

    @Override
    public JPanel returnPanel() {
        return new StateLevelLicenseManagerWorkAreaJPanel(userProcessContainer, userAccount);
    }
    
}
