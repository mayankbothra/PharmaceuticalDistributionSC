/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.UserAccount;
import UserInterface.TrackingPortal.TrackingPortalHomeJPanel;
import UserInterface.TrackingPortal.TrackingPortalJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Mayank
 */
public class TrackingPortalView extends View {

    JPanel userProcessContainer;
    UserAccount userAccount;

    public TrackingPortalView(JPanel userProcessContainer, UserAccount userAccount) {
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;

    }

    @Override
    public JPanel returnPanel() {

        return new TrackingPortalHomeJPanel(userProcessContainer, userAccount);
    }
}
