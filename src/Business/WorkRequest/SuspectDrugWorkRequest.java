/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.SuspectDrug;

/**
 *
 * @author mayank
 */
public class SuspectDrugWorkRequest extends WorkRequest{
    
    private SuspectDrug suspectDrug;
    
    public SuspectDrugWorkRequest() {
    }

    public SuspectDrug getSuspectDrug() {
        return suspectDrug;
    }

    public void setSuspectDrug(SuspectDrug suspectDrug) {
        this.suspectDrug = suspectDrug;
    }


    @Override
    public String toString() {
        return WorkRequest.Type.SuspectDrugWorkRequest.toString();
    }
    
}
