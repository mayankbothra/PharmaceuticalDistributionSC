/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.UserAccount;
import UserInterface.Government.SeniorManager.GovernmentSeniorManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author mayank
 */
public class GovernmentSeniorManagerView extends View {
    JPanel userProcessContainer;
    UserAccount userAccount;
    
    public GovernmentSeniorManagerView(JPanel userProcessContainer, UserAccount userAccount) {
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
    }

    @Override
    public JPanel returnPanel() {
        return new GovernmentSeniorManagerWorkAreaJPanel(userProcessContainer, userAccount);
    }
    
}
