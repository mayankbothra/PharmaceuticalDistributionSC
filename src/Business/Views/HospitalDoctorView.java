/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Views;

import Business.Business;
import Business.Employee;
import Business.Enterprises.Enterprise;
import Business.Network.Network;
import Business.UserAccount;
import UserInterface.Hospital.Doctor.HospitalDoctorWorkAreaJPanel;
import UserInterface.LicenseExpiredJPanel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;

/**
 *
 * @author Mayank
 */
public class HospitalDoctorView extends View {

    JPanel userProcessContainer;
    UserAccount userAccount;
    
    public HospitalDoctorView(JPanel userProcessContainer, UserAccount userAccount) {
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        
    }

    @Override
    public JPanel returnPanel() {
        
        Business business = Business.getInstance();
        Network n = business.getNetworkDirectory().getMyNetwork(userAccount);
        Enterprise e = n.getEnterpriseDirectory().getMyEnterprise(userAccount);

        boolean fakeEnt = false;
        
        for(Employee emp : e.getEmployeeDirectory().getEmployeeList()){
            if(emp.getDesignation().equals("Fake")) {
                fakeEnt = true;
            }
        }
        
        try {
            String expDate = e.getLicenseExpiryDate();
            Date d = new SimpleDateFormat("MM dd yy HH:mm:ss").parse(expDate);

            if(!fakeEnt) {
            if (d.before(new Date())) {
                return new LicenseExpiredJPanel(userProcessContainer, userAccount);
            } else {
                return new HospitalDoctorWorkAreaJPanel(userProcessContainer, userAccount);
            }
            }
            else {
                return new HospitalDoctorWorkAreaJPanel(userProcessContainer, userAccount);
            }
        } catch (ParseException pe) {
        }
        return  null;
    }
}
