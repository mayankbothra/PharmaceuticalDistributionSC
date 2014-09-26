/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprises;

import Business.Inventory;
import Business.Organizations.HospitalDoctorOrganization;
import Business.Organizations.HospitalInventoryManagementOrganization;
import Business.Organizations.HospitalPharmacyOrganization;
import Business.Organizations.HospitalPortalOrganization;
import Business.Organizations.Organization;
import Business.Organizations.SeniorManagerOrganization;
import Business.PatientDirectory;
import Business.Roles.HospitalDoctorRole;
import Business.Roles.HospitalInventoryManagerRole;
import Business.Roles.HospitalPharmacyManagerRole;
import Business.Roles.HospitalPortalRole;
import Business.Roles.HospitalSeniorManagerRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author mayank
 */
public class Hospital extends Enterprise {
    
    private HospitalInventoryManagementOrganization hospitalInventoryManagementOrganization;
    private HospitalPharmacyOrganization hospitalPharmacyOrganization;
    private HospitalDoctorOrganization hospitalDoctorOrganization;
    private HospitalPortalOrganization hospitalPortalOrganization;
    private SeniorManagerOrganization seniorManagerOrganization;
    private Inventory inventory;
    private PatientDirectory patientDirectory;
    
    
    public Hospital (String enterpriseName, String entrpriseType) {
        super(enterpriseName, entrpriseType);
        hospitalInventoryManagementOrganization = (HospitalInventoryManagementOrganization)getOrganizationDirectory().newOrganization(Organization.Type.HospitalInventoryManagement);
        hospitalPharmacyOrganization = (HospitalPharmacyOrganization)getOrganizationDirectory().newOrganization(Organization.Type.HospitalPharmacy);
        hospitalDoctorOrganization = (HospitalDoctorOrganization)getOrganizationDirectory().newOrganization(Organization.Type.HospitalDoctor);
        hospitalPortalOrganization = (HospitalPortalOrganization)getOrganizationDirectory().newOrganization(Organization.Type.HospitalPortal);
        seniorManagerOrganization = (SeniorManagerOrganization)getOrganizationDirectory().newOrganization(Organization.Type.SeniorManager);
        inventory = new Inventory();
        patientDirectory = new PatientDirectory();
    }

    public HospitalInventoryManagementOrganization getHospitalInventoryManagementOrganization() {
        return hospitalInventoryManagementOrganization;
    }

    public HospitalPharmacyOrganization getHospitalPharmacyOrganization() {
        return hospitalPharmacyOrganization;
    }

    public HospitalPortalOrganization getHospitalPortalOrganization() {
        return hospitalPortalOrganization;
    }

    public void setHospitalPortalOrganization(HospitalPortalOrganization hospitalPortalOrganization) {
        this.hospitalPortalOrganization = hospitalPortalOrganization;
    }
    

    public void setHospitalPharmacyOrganization(HospitalPharmacyOrganization hospitalPharmacyOrganization) {
        this.hospitalPharmacyOrganization = hospitalPharmacyOrganization;
    }

    public void setHospitalInventoryManagementOrganization(HospitalInventoryManagementOrganization hospitalInventoryManagementOrganization) {
        this.hospitalInventoryManagementOrganization = hospitalInventoryManagementOrganization;
    }

    public HospitalDoctorOrganization getHospitalDoctorOrganization() {
        return hospitalDoctorOrganization;
    }

    public void setHospitalDoctorOrganization(HospitalDoctorOrganization hospitalDoctorOrganization) {
        this.hospitalDoctorOrganization = hospitalDoctorOrganization;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
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
        roles.add(new HospitalInventoryManagerRole());
        roles.add(new HospitalPharmacyManagerRole());
        roles.add(new HospitalDoctorRole());
        roles.add(new HospitalPortalRole());
        roles.add(new HospitalSeniorManagerRole());
        return roles;
    }
}
