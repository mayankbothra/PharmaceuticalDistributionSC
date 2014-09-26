/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprises;

import Business.Inventory;
import Business.Organizations.Organization;
import Business.Organizations.SeniorManagerOrganization;
import Business.Organizations.WholesalerInventoryManagementOrganization;
import Business.Organizations.WholesalerShippingOrganization;
import Business.Roles.Role;
import Business.Roles.WholesalerInventoryManagerRole;
import Business.Roles.WholesalerSeniorManagerRole;
import Business.Roles.WholesalerShippmentManagerRole;
import java.util.ArrayList;

/**
 *
 * @author mayank
 */
public class Wholesaler extends Enterprise{
    
    private WholesalerInventoryManagementOrganization wholesalerInventoryManagementOrganization;
    private WholesalerShippingOrganization wholesalerShippingOrganization;
    private SeniorManagerOrganization seniorManagerOrganization;
    private Inventory inventory;
    private ArrayList<String> manufacturerList;
    
    public Wholesaler (String enterpriseName, String enterpriseType) {
        super(enterpriseName, enterpriseType);
        wholesalerInventoryManagementOrganization = (WholesalerInventoryManagementOrganization)getOrganizationDirectory().newOrganization(Organization.Type.WholesalerInventoryManagement);
        wholesalerShippingOrganization = (WholesalerShippingOrganization)getOrganizationDirectory().newOrganization(Organization.Type.WholesalerShipping);
        seniorManagerOrganization = (SeniorManagerOrganization)getOrganizationDirectory().newOrganization(Organization.Type.SeniorManager);
        inventory = new Inventory();
        manufacturerList = new ArrayList<>();
    }

    public WholesalerInventoryManagementOrganization getWholesalerInventoryManagementOrganization() {
        return wholesalerInventoryManagementOrganization;
    }

    public void setWholesalerInventoryManagementOrganization(WholesalerInventoryManagementOrganization wholesalerInventoryManagementOrganization) {
        this.wholesalerInventoryManagementOrganization = wholesalerInventoryManagementOrganization;
    }

    public SeniorManagerOrganization getSeniorManagerOrganization() {
        return seniorManagerOrganization;
    }

    public void setSeniorManagerOrganization(SeniorManagerOrganization seniorManagerOrganization) {
        this.seniorManagerOrganization = seniorManagerOrganization;
    }
    
    public WholesalerShippingOrganization getWholesalerShippingOrganization() {
        return wholesalerShippingOrganization;
    }

    public void setWholesalerShippingOrganization(WholesalerShippingOrganization wholesalerShippingOrganization) {
        this.wholesalerShippingOrganization = wholesalerShippingOrganization;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public ArrayList<String> getManufacturerList() {
        return manufacturerList;
    }

    public void setManufacturerList(ArrayList<String> manufacturerList) {
        this.manufacturerList = manufacturerList;
    }
    
    
    
        @Override
    public ArrayList<Role> getSupportedRoles() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new WholesalerInventoryManagerRole());
        roles.add(new WholesalerShippmentManagerRole());
        roles.add(new WholesalerSeniorManagerRole());
        return roles;
    }
}
