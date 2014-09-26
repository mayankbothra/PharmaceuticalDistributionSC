/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkAreas;

import Business.Enterprises.Enterprise;
import Business.UserAccount;
import Business.Views.ManufacturerShippmentManagerView;
import Business.Views.View;
import javax.swing.JPanel;

/**
 *
 * @author Mayank
 */
public class ManufacturerShippmentManagerWorkArea extends WorkArea{
    
    @Override
    public View createView(JPanel userProcessContainer, UserAccount userAccount) {
        return new ManufacturerShippmentManagerView(userProcessContainer, userAccount);
    }
}
