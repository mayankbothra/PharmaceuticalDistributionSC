/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprises;

import Business.BatchDirectory;
import Business.DrugCatalog;
import Business.Inventory;
import Business.MedicinePackage;
import Business.Organizations.ManufacturerDrugManagementOrganization;
import Business.Organizations.ManufacturerInventoryManagementOrganization;
import Business.Organizations.ManufacturerShippingOrganization;
import Business.Organizations.ManufacturingOrganization;
import Business.Organizations.Organization;
import Business.Organizations.SeniorManagerOrganization;
import Business.Roles.ManufacturerDrugManagerRole;
import Business.Roles.ManufacturerInventoryManagerRole;
import Business.Roles.ManufacturerSeniorManagerRole;
import Business.Roles.ManufacturingManagerRole;
import Business.Roles.ManufacturingShippmentManagerRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author mayank
 */
public class Manufacturer extends Enterprise {

    private ManufacturerDrugManagementOrganization drugManagementOrganization;
    private ManufacturerInventoryManagementOrganization manufacturerInventoryManagementOrganization;
    private ManufacturingOrganization manufacturingOrganization;
    private ManufacturerShippingOrganization manufacturerShippingOrganization;
    private SeniorManagerOrganization seniorManagerOrganization;
    
    private DrugCatalog drugCatalog;
    private Inventory inventory;
    private BatchDirectory batchDirectory;
    private ArrayList<MedicinePackage> manufacturedMedicinePackages;

    public Manufacturer(String enterpriseName, String enterpriseType) {
        super(enterpriseName, enterpriseType);
        drugManagementOrganization = (ManufacturerDrugManagementOrganization) getOrganizationDirectory().newOrganization(Organization.Type.DrugManagement);
        manufacturerInventoryManagementOrganization = (ManufacturerInventoryManagementOrganization)getOrganizationDirectory().newOrganization(Organization.Type.ManufacturerInventoryManagement);
        manufacturingOrganization = (ManufacturingOrganization)getOrganizationDirectory().newOrganization(Organization.Type.Manufacturing);
        manufacturerShippingOrganization = (ManufacturerShippingOrganization) getOrganizationDirectory().newOrganization(Organization.Type.ManufacturerShipping);
        seniorManagerOrganization = (SeniorManagerOrganization)getOrganizationDirectory().newOrganization(Organization.Type.SeniorManager);
        drugCatalog = new DrugCatalog();
        drugManagementOrganization.setDrugCatalog(drugCatalog);
        inventory = new Inventory();
        batchDirectory = new BatchDirectory();
        manufacturedMedicinePackages = new ArrayList<>();
    }

    public ManufacturerDrugManagementOrganization getDrugManagementOrganization() {
        return drugManagementOrganization;
    }

    public void setDrugManagementOrganization(ManufacturerDrugManagementOrganization drugManagementOrganization) {
        this.drugManagementOrganization = drugManagementOrganization;
    }

    public SeniorManagerOrganization getSeniorManagerOrganization() {
        return seniorManagerOrganization;
    }

    public void setSeniorManagerOrganization(SeniorManagerOrganization seniorManagerOrganization) {
        this.seniorManagerOrganization = seniorManagerOrganization;
    }

    public ManufacturerShippingOrganization getManufacturerShippingOrganization() {
        return manufacturerShippingOrganization;
    }

    public void setManufacturerShippingOrganization(ManufacturerShippingOrganization manufacturerShippingOrganization) {
        this.manufacturerShippingOrganization = manufacturerShippingOrganization;
    }

    public ManufacturerInventoryManagementOrganization getManufacturerInventoryManagementOrganization() {
        return manufacturerInventoryManagementOrganization;
    }

    public void setManufacturerInventoryManagementOrganization(ManufacturerInventoryManagementOrganization manufacturerInventoryManagementOrganization) {
        this.manufacturerInventoryManagementOrganization = manufacturerInventoryManagementOrganization;
    }

    public ArrayList<MedicinePackage> getManufacturedMedicinePackages() {
        return manufacturedMedicinePackages;
    }

    public void setManufacturedMedicinePackages(ArrayList<MedicinePackage> manufacturedMedicinePackages) {
        this.manufacturedMedicinePackages = manufacturedMedicinePackages;
    }

    
    public ManufacturingOrganization getManufacturingOrganization() {
        return manufacturingOrganization;
    }

    public void setManufacturingOrganization(ManufacturingOrganization manufacturingOrganization) {
        this.manufacturingOrganization = manufacturingOrganization;
    }
    
    public ManufacturerShippingOrganization getShippingOrganization() {
        return manufacturerShippingOrganization;
    }

    public void setShippingOrganization(ManufacturerShippingOrganization shippingOrganization) {
        this.manufacturerShippingOrganization = shippingOrganization;
    }

    public DrugCatalog getDrugCatalog() {
        return drugCatalog;
    }

    public void setDrugCatalog(DrugCatalog drugCatalog) {
        this.drugCatalog = drugCatalog;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public BatchDirectory getBatchDirectory() {
        return batchDirectory;
    }

    public void setBatchDirectory(BatchDirectory batchDirectory) {
        this.batchDirectory = batchDirectory;
    }
     
    @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ManufacturerDrugManagerRole());
        roles.add(new ManufacturerInventoryManagerRole());
        roles.add(new ManufacturingManagerRole());
        roles.add(new ManufacturingShippmentManagerRole());
        roles.add(new ManufacturerSeniorManagerRole());
        return roles;
    }
}
