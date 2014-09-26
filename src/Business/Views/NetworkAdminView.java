/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.UserAccount;
import UserInterface.NetworkAdmin.NetworkAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Mayank
 */
public class NetworkAdminView extends View {

    JPanel userProcessContainer;
    UserAccount userAccount;
    
    public NetworkAdminView(JPanel userProcessContainer, UserAccount userAccount) {
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
    }

    @Override
    public JPanel returnPanel() {
        return new NetworkAdminWorkAreaJPanel(userProcessContainer, userAccount);
    }
}
