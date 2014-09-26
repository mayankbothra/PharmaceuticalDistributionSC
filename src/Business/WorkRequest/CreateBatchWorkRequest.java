/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.Drug;

/**
 *
 * @author mayank
 */
public class CreateBatchWorkRequest extends WorkRequest {
    
    Drug drug;
    
    @Override
    public String toString() {
        return WorkRequest.Type.CreateBatchRequest.toString();
    }

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }
    
}
