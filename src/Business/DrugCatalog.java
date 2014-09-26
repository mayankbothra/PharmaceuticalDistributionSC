/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public class DrugCatalog {
    
    private ArrayList<Drug> drugList;
    
    public DrugCatalog() {
        drugList = new ArrayList<>();
    }

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }
    
    public Drug newDrug() {
        Drug drug = new Drug();
//        drugList.add(drug);
        return drug;
    }
    
    public void addDrug(Drug drug) {
        drugList.add(drug);
    }
}
