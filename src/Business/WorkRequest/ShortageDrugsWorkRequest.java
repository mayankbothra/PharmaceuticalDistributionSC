/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.Drug;
import java.util.ArrayList;

/**
 *
 * @author mayank
 */
public class ShortageDrugsWorkRequest extends WorkRequest {
    
    ArrayList<Drug> drugList;
    
    @Override
    public String toString() {
        return WorkRequest.Type.ShortageDrugsWorkRequest.toString();
    }

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }

    public void setDrugList(ArrayList<Drug> drugList) {
        this.drugList = drugList;
    }

    
}
