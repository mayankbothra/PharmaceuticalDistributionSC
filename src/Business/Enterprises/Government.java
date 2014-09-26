/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprises;

import Business.Drug;
import Business.MedicinePackage;
import Business.Organizations.GovernmentComplaintHandlingOrganization;
import Business.Organizations.GovernmentDrugLicensingOrganization;
import Business.Organizations.GovernmentFederalLicenseManagementOrganization;
import Business.Organizations.GovernmentStateLevelLicensingOrganization;
import Business.Organizations.Organization;
import Business.Organizations.SeniorManagerOrganization;
import Business.Roles.GovernmentComplaintManagerRole;
import Business.Roles.GovernmentDrugLicensingRole;
import Business.Roles.GovernmentFederalLicenseManagerRole;
import Business.Roles.GovernmentSeniorManagerRole;
import Business.Roles.GovernmentStateLevelLicensingRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author mayank
 */
public class Government extends Enterprise {
    private ArrayList<Drug> approvedDrugList;
    private ArrayList<Enterprise> approvedEnterpriseList;
    private ArrayList<MedicinePackage> theftPackageList;
    private ArrayList<MedicinePackage> suspectPackageList;
    private ArrayList<Drug> suspectDrugList;
    private ArrayList<Drug> illegitimateDrugList;
   
    
    private GovernmentFederalLicenseManagementOrganization governmentFederalLicenseManagementOrganization;
    private GovernmentComplaintHandlingOrganization complaintHandlingOrganization;
    private GovernmentStateLevelLicensingOrganization governmentStateLevelLicensingOrganization;
    private GovernmentDrugLicensingOrganization governmentDrugLicensingOrganization;
    private SeniorManagerOrganization seniorManagerOrganization;
    
    public Government(String enterpriseName, String enterpriseType) {
        super(enterpriseName, enterpriseType);
        governmentFederalLicenseManagementOrganization = (GovernmentFederalLicenseManagementOrganization)getOrganizationDirectory().newOrganization(Organization.Type.LicenseManagement);
        complaintHandlingOrganization = (GovernmentComplaintHandlingOrganization)getOrganizationDirectory().newOrganization(Organization.Type.ComplaintHandling);
        governmentStateLevelLicensingOrganization = (GovernmentStateLevelLicensingOrganization)getOrganizationDirectory().newOrganization(Organization.Type.StateLevel);
        governmentDrugLicensingOrganization = (GovernmentDrugLicensingOrganization)getOrganizationDirectory().newOrganization(Organization.Type.DrugLicensing);
        seniorManagerOrganization = (SeniorManagerOrganization)getOrganizationDirectory().newOrganization(Organization.Type.SeniorManager);
        approvedDrugList = new ArrayList<>();
        approvedEnterpriseList = new ArrayList<>();
        theftPackageList = new ArrayList<>();
        suspectPackageList = new ArrayList<>();
        suspectDrugList = new ArrayList<>();
        illegitimateDrugList = new ArrayList<>();
            
    }

    public ArrayList<Drug> getApprovedDrugList() {
        return approvedDrugList;
    }

    public void setApprovedDrugList(ArrayList<Drug> approvedDrugList) {
        this.approvedDrugList = approvedDrugList;
    }

    public ArrayList<Enterprise> getApprovedEnterpriseList() {
        return approvedEnterpriseList;
    }

    public void setApprovedEnterpriseList(ArrayList<Enterprise> approvedEnterpriseList) {
        this.approvedEnterpriseList = approvedEnterpriseList;
    }

    public ArrayList<MedicinePackage> getTheftPackageList() {
        return theftPackageList;
    }

    public void setTheftPackageList(ArrayList<MedicinePackage> theftPackageList) {
        this.theftPackageList = theftPackageList;
    }

    public ArrayList<MedicinePackage> getSuspectPackageList() {
        return suspectPackageList;
    }

    public void setSuspectPackageList(ArrayList<MedicinePackage> suspectPackageList) {
        this.suspectPackageList = suspectPackageList;
    }

    public ArrayList<Drug> getSuspectDrugList() {
        return suspectDrugList;
    }

    public void setSuspectDrugList(ArrayList<Drug> suspectDrugList) {
        this.suspectDrugList = suspectDrugList;
    }

    public ArrayList<Drug> getIllegitimateDrugList() {
        return illegitimateDrugList;
    }

    public void setIllegitimateDrugList(ArrayList<Drug> illegitimateDrugList) {
        this.illegitimateDrugList = illegitimateDrugList;
    }

    public GovernmentFederalLicenseManagementOrganization getGovernmentFederalLicenseManagementOrganization() {
        return governmentFederalLicenseManagementOrganization;
    }

    public void setGovernmentFederalLicenseManagementOrganization(GovernmentFederalLicenseManagementOrganization governmentFederalLicenseManagementOrganization) {
        this.governmentFederalLicenseManagementOrganization = governmentFederalLicenseManagementOrganization;
    }

    public GovernmentComplaintHandlingOrganization getComplaintHandlingOrganization() {
        return complaintHandlingOrganization;
    }

    public void setComplaintHandlingOrganization(GovernmentComplaintHandlingOrganization complaintHandlingOrganization) {
        this.complaintHandlingOrganization = complaintHandlingOrganization;
    }

    public GovernmentStateLevelLicensingOrganization getGovernmentStateLevelLicensingOrganization() {
        return governmentStateLevelLicensingOrganization;
    }

    public void setGovernmentStateLevelLicensingOrganization(GovernmentStateLevelLicensingOrganization governmentStateLevelLicensingOrganization) {
        this.governmentStateLevelLicensingOrganization = governmentStateLevelLicensingOrganization;
    }

    public GovernmentDrugLicensingOrganization getGovernmentDrugLicensingOrganization() {
        return governmentDrugLicensingOrganization;
    }

    public void setGovernmentDrugLicensingOrganization(GovernmentDrugLicensingOrganization governmentDrugLicensingOrganization) {
        this.governmentDrugLicensingOrganization = governmentDrugLicensingOrganization;
    }

    public SeniorManagerOrganization getSeniorManagerOrganization() {
        return seniorManagerOrganization;
    }

    public void setSeniorManagerOrganization(SeniorManagerOrganization seniorManagerOrganization) {
        this.seniorManagerOrganization = seniorManagerOrganization;
    }

    
   
        @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new GovernmentFederalLicenseManagerRole());
        roles.add(new GovernmentComplaintManagerRole());
        roles.add(new GovernmentStateLevelLicensingRole());
        roles.add(new GovernmentDrugLicensingRole());
        roles.add(new GovernmentSeniorManagerRole());
        return roles;
    }
}
