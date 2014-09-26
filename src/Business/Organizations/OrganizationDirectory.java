/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public class OrganizationDirectory {
    
    ArrayList<Organization> organizationList;
    
    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization newOrganization(Organization.Type type) {
        Organization organization = null;
        
        if(type == Organization.Type.ManufacturerInventoryManagement) {
            organization = new ManufacturerInventoryManagementOrganization();
        }
        
        else if(type == Organization.Type.WholesalerInventoryManagement) {
            organization = new WholesalerInventoryManagementOrganization();
        }
        
        else if(type == Organization.Type.HospitalInventoryManagement) {
            organization = new HospitalInventoryManagementOrganization();
        }
        
        else if(type == Organization.Type.DrugManagement) {
            organization = new ManufacturerDrugManagementOrganization();
        }
        
        else if(type == Organization.Type.LicenseManagement) {
            organization = new GovernmentFederalLicenseManagementOrganization();
        }
        
        else if(type == Organization.Type.StateLevel) {
            organization = new GovernmentStateLevelLicensingOrganization();
        }
        
        else if(type == Organization.Type.DrugLicensing) {
            organization = new GovernmentDrugLicensingOrganization();
        }
        
        else if(type == Organization.Type.Manufacturing) {
            organization = new ManufacturingOrganization();
        }
        
        else if(type == Organization.Type.ManufacturerShipping) {
            organization = new ManufacturerShippingOrganization();
        }
        
        else if(type == Organization.Type.WholesalerShipping) {
            organization = new WholesalerShippingOrganization();
        }
       
        else if(type == Organization.Type.ComplaintHandling) {
            organization = new GovernmentComplaintHandlingOrganization();
        }
        
        else if(type == Organization.Type.HospitalPharmacy) {
            organization = new HospitalPharmacyOrganization();
        }
        
        else if(type == Organization.Type.HospitalDoctor) {
            organization = new HospitalDoctorOrganization();
        }
        
        else if(type == Organization.Type.HospitalPortal) {
            organization = new HospitalPortalOrganization();
        }
        
        else if(type == Organization.Type.TrackingPortal) {
            organization = new TrackingPortalOrganization();
        }
        
        
        else if(type == Organization.Type.SeniorManager) {
            organization = new SeniorManagerOrganization();
        }
        
        if(organization != null) {
            organizationList.add(organization);
        }
        
        return organization;
    }
    
    public Organization getSelectedOrganization (Organization.Type organizationType) {
        for(Organization o : organizationList) {
            if(o.getOrganizationName().equals(organizationType.toString())) {
                return o;
            }
        }
        return null;
    }
}
