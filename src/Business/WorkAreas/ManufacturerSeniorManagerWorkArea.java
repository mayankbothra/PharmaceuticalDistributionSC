/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkAreas;

import Business.UserAccount;
import Business.Views.ManufacturerSeniorManagerView;
import Business.Views.View;
import javax.swing.JPanel;

/**
 *
 * @author mayank
 */
public class ManufacturerSeniorManagerWorkArea extends WorkArea {
    
    @Override
    public View createView(JPanel userProcessContainer, UserAccount userAccount) {
        return new ManufacturerSeniorManagerView(userProcessContainer, userAccount);
    }
}
