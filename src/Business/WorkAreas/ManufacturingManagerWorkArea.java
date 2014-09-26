/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkAreas;

import Business.UserAccount;
import Business.Views.ManufacturingManagerView;
import Business.Views.View;
import javax.swing.JPanel;

/**
 *
 * @author mayank
 */
public class ManufacturingManagerWorkArea extends WorkArea {
    
    @Override
    public View createView(JPanel userProcessContainer, UserAccount userAccount) {
        return new ManufacturingManagerView(userProcessContainer, userAccount);
    }
}
