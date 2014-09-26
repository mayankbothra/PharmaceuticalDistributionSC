/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprises;

import Business.Organizations.Organization;
import Business.Organizations.OrganizationDirectory;
import Business.PersonDirectory;
import Business.Roles.Role;
import Business.UserAccount;
import Business.WorkRequest.WorkRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Mayank
 */
public abstract class Enterprise extends Organization {

    public static enum Type {

//        ADMIN {
//            @Override
//            public String toString() {
//                return "Admin";
//            }
//        },
        GOVERNMENT {
            @Override
            public String toString() {
                return "Government";
            }
        },
        HOSPITAL {
            @Override
            public String toString() {
                return "Hospital";
            }
        },
        MANUFACTURER {
            @Override
            public String toString() {
                return "Manufacturer";
            }
        },
        WHOLESALER {
            @Override
            public String toString() {
                return "Wholesaler";
            }
        };
    }
    
    private String enterpriseName;
    private String enterpriseType;
    private String licenseStatus;
    private String licenseIssueDate;
    private String licenseExpiryDate;
    private OrganizationDirectory organizationDirectory;
    private PersonDirectory personDirectory;
    private int licenseCount;
    private ArrayList<WorkRequest> rejectedWorkRequest;
    boolean flag;
    String alertMessage;

    public Enterprise(String enterpriseName, String enterpriseType) {
        super(Organization.Type.Admin.toString());
        this.enterpriseName = enterpriseName;
        this.enterpriseType = enterpriseType;
        organizationDirectory = new OrganizationDirectory();
        personDirectory = new PersonDirectory();
        licenseStatus = "";
        licenseCount = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yy HH:mm:ss");
        String currentDate = sdf.format(new Date());
        licenseExpiryDate = currentDate;
        rejectedWorkRequest = new ArrayList<>();
        flag = true;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public String getAlertMessage() {
        return alertMessage;
    }

    public void setAlertMessage(String alertMessage) {
        this.alertMessage = alertMessage;
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public String getLicenseStatus() {
        return licenseStatus;
    }

    public void setLicenseStatus(String licenseStatus) {
        this.licenseStatus = licenseStatus;
    }

    public String getLicenseIssueDate() {
        return licenseIssueDate;
    }

    public void setLicenseIssueDate(String licenseIssueDate) {
        this.licenseIssueDate = licenseIssueDate;
    }

    public String getLicenseExpiryDate() {
        return licenseExpiryDate;
    }

    public void setLicenseExpiryDate(String licenseExpiryDate) {
        this.licenseExpiryDate = licenseExpiryDate;
    }

    public int getLicenseCount() {
        return licenseCount;
    }

    public void setLicenseCount(int licenseCount) {
        this.licenseCount = licenseCount;
    }

    public ArrayList<WorkRequest> getRejectedWorkRequest() {
        return rejectedWorkRequest;
    }

    public void setRejectedWorkRequest(ArrayList<WorkRequest> rejectedWorkRequest) {
        this.rejectedWorkRequest = rejectedWorkRequest;
    }
    
    

//    public UserAccount authenticateUser(String userName, String password) {
//        UserAccount ua = getUserAccountDirectory().authenticateUser(userName, password);
//        if (ua != null) {
//            return ua;
//        }
//
//        for (Organization o : getOrganizationDirectory().getOrganizationList()) {
//            ua = o.getUserAccountDirectory().authenticateUser(userName, password);
//            if (ua != null) {
//                return ua;
//            }
//        }
//        return null;
//    }

    public abstract ArrayList<Role> getSupportedRoles();

    public Organization getMyOrganization(UserAccount userAccount) {

        if (getUserAccountDirectory().isUserExist(userAccount)) {
            return this;
        }

        for (Organization org : getOrganizationDirectory().getOrganizationList()) {
            if (org.getUserAccountDirectory().isUserExist(userAccount)) {
                return org;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return enterpriseName;
    }
}
