/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.UserAccount;
import UserInterface.BusinessAdmin.BusinessAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Mayank
 */
public class BusinessAdminView extends View {

    JPanel userProcessContainer;
    UserAccount userAccount;
    
    public BusinessAdminView(JPanel userProcessContainer, UserAccount userAccount) {
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
    }

    @Override
    public JPanel returnPanel() {
        return new BusinessAdminWorkAreaJPanel(userProcessContainer, userAccount);
    }
    
    
}
