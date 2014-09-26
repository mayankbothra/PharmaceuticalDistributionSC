/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.UserAccount;
import UserInterface.Government.DrugLicensing.DrugLicensingWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author mayank
 */
public class GovernmentDrugLicensingView extends View {
    JPanel userProcessContainer;
    UserAccount userAccount;
    
    public GovernmentDrugLicensingView(JPanel userProcessContainer, UserAccount userAccount) {
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
    }

    @Override
    public JPanel returnPanel() {
        return new DrugLicensingWorkAreaJPanel(userProcessContainer, userAccount);
    }  
}
