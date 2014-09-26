/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprises.Enterprise;
import Business.Network.Network;
import Business.Network.NetworkDirectory;
import Business.Organizations.Organization;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public class Business extends Network {

    private NetworkDirectory networkDirectory;
    private static Business business;
    
    private int batchID;
    private int medicinePackageId;
    private int orderID;
    private int employeeID;
    private int drugID;
    private int patientID;
    
    
    
    
    
    

    public static Business getInstance1() {
        if (business == null) {
            business = new Business();
        }

        return business;
    }
    
    public static Business getInstance() {
        DB4O.DB4OUtil.storeObject(business);
        business = DB4O.DB4OUtil.getBusiness();
        return business;
    }

    private Business() {
        super("World");
        networkDirectory = new NetworkDirectory();
    }

    public NetworkDirectory getNetworkDirectory() {
        return networkDirectory;
    }

    public UserAccount authenticateUser(String userName, String password) {
        
        UserAccount ua = getUserAccountDirectory().authenticateUser(userName, password);
        if (ua != null) {
            return ua;
        }

        for (Network network : getNetworkDirectory().getNetworkList()) {
            ua = network.getUserAccountDirectory().authenticateUser(userName, password);
            if (ua != null) {
                return ua;
            }

            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                ua = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                if (ua != null) {
                    return ua;
                }

                for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    ua = o.getUserAccountDirectory().authenticateUser(userName, password);
                    if (ua != null) {
                        return ua;
                    }
                }
            }
        }
        return null;
    }

    public boolean checkUserName(String userName) {

        if (getUserAccountDirectory().checkUserNameExists(userName)) {
            return true;
        }

        for (Network network : getNetworkDirectory().getNetworkList()) {
            if (network.getUserAccountDirectory().checkUserNameExists(userName)) {
                return true;
            }

            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise.getUserAccountDirectory().checkUserNameExists(userName)) {
                    return true;
                }

                for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (o.getUserAccountDirectory().checkUserNameExists(userName)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

//    public Manufacturer getManufacturerName(Drug drug) {
//        for (Network n : getNetworkDirectory().getNetworkList()) {
//            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
//                if (e.getEnterpriseType().equals(Enterprise.Type.MANUFACTURER.toString())) {
//                    Manufacturer m = (Manufacturer) e;
//                    for (Drug d : m.getDrugCatalog().getDrugList()) {
//                        if (d == drug) {
//                            return m;
//                        }
//                    }
//                }
//            }
//        }
//        return null;
//    }

    public ArrayList<Enterprise> getEnterpriseList(Enterprise.Type type) {
        ArrayList<Enterprise> entList = new ArrayList<>();
        for (Network n : getNetworkDirectory().getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                if (e.getEnterpriseType().equals(type.toString())) {
                    entList.add(e);
                }
            }
        }
        return entList;
    }
    
    public void setStaticVariable() {
        Batch.setCount(batchID);
        MedicinePackage.setCount(medicinePackageId);
        Order.setCount(orderID);
        Employee.setCount(employeeID);
        Drug.setCount(drugID);
        Patient.setCount(patientID);
    }
    
    public void getStaticVariables() {
        batchID = Batch.getCount();
        medicinePackageId = MedicinePackage.getCount();
        orderID = Order.getCount();
        employeeID = Employee.getCount();
        drugID = Drug.getCount();
        patientID = Patient.getCount();
    }

    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<>();
        return roles;
    }

    @Override
    public String toString() {
        return ("World");
    }
}
