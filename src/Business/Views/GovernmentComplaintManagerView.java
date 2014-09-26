/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.UserAccount;
import UserInterface.Government.ComplaintManager.ComplaintManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author mayank
 */
public class GovernmentComplaintManagerView extends View {
    JPanel userProcessContainer;
    UserAccount userAccount;
    
    public GovernmentComplaintManagerView(JPanel userProcessContainer, UserAccount userAccount) {
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
    }

    @Override
    public JPanel returnPanel() {
        return new ComplaintManagerWorkAreaJPanel(userProcessContainer, userAccount);
    }
    
}
