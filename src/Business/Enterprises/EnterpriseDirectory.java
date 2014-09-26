/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprises;

import Business.Organizations.Organization;
import Business.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public class EnterpriseDirectory {
    
    ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise newEnterprise(String enterpriseName, Enterprise.Type enterpriseType) {
        
        Enterprise enterprise = null;
        
        if(enterpriseType == Enterprise.Type.GOVERNMENT) {
            enterprise = new Government(enterpriseName, enterpriseType.toString());
        }
        
        else if(enterpriseType == Enterprise.Type.HOSPITAL) {
            enterprise = new Hospital(enterpriseName, enterpriseType.toString());
        }
        
        else if(enterpriseType == Enterprise.Type.MANUFACTURER) {
            enterprise = new Manufacturer(enterpriseName, enterpriseType.toString());
        }
        
        else if(enterpriseType == Enterprise.Type.WHOLESALER) {
            enterprise = new Wholesaler(enterpriseName, enterpriseType.toString());
        }
        
        else if(enterpriseType == Enterprise.Type.MANUFACTURER) {
            enterprise = new Manufacturer(enterpriseName, enterpriseType.toString());
        }

        if(enterprise != null) {
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
    
    public Enterprise getMyEnterprise(UserAccount userAccount) {
        for(Enterprise e : getEnterpriseList()) {
            if (e.getUserAccountDirectory().isUserExist(userAccount)) {
                return e;
            }

        for (Organization org : e.getOrganizationDirectory().getOrganizationList()) {
            if (org.getUserAccountDirectory().isUserExist(userAccount)) {
                return e;
            }
        }
        }
        return null;
    }
    
    public Enterprise getSelectedEnterprise(Enterprise.Type enterpriseType) {
        for(Enterprise e : getEnterpriseList()) {
            if(e.getEnterpriseType().equals(enterpriseType.toString())) {
                return e;
            }
        }
        return null;
    }
}
