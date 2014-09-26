/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.UserAccount;
import UserInterface.HospitalPortal.HospitalPortalHomeJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Mayank
 */
public class HospitalPortalView extends View {

    JPanel userProcessContainer;
    UserAccount userAccount;

    public HospitalPortalView(JPanel userProcessContainer, UserAccount userAccount) {
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;

    }

    @Override
    public JPanel returnPanel() {

        return new HospitalPortalHomeJPanel(userProcessContainer, userAccount);
    }
}
