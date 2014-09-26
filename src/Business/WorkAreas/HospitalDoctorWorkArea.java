/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkAreas;

import Business.UserAccount;
import Business.Views.HospitalDoctorView;
import Business.Views.View;
import javax.swing.JPanel;

/**
 *
 * @author Mayank
 */
public class HospitalDoctorWorkArea extends WorkArea {
    
    @Override
    public View createView(JPanel userProcessContainer, UserAccount userAccount) {
        return new HospitalDoctorView(userProcessContainer, userAccount);
    }
}
