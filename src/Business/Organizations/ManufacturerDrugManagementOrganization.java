/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.DrugCatalog;

/**
 *
 * @author Mayank
 */
public class ManufacturerDrugManagementOrganization extends Organization {
    
    private DrugCatalog drugCatalog;
    
    public ManufacturerDrugManagementOrganization() {
        super(Organization.Type.DrugManagement.toString());
    }
    
    public DrugCatalog getDrugCatalog() {
        return drugCatalog;
    }

    public void setDrugCatalog(DrugCatalog drugCatalog) {
        this.drugCatalog = drugCatalog;
    }
    
}
