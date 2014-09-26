/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

/**
 *
 * @author mayank
 */
public class ApproveDrugWorkRequest extends WorkRequest{
    
    DrugCreationWorkRequest drugCreationWorkRequest;

    public DrugCreationWorkRequest getDrugCreationWorkRequest() {
        return drugCreationWorkRequest;
    }

    public void setDrugCreationWorkRequest(DrugCreationWorkRequest drugCreationWorkRequest) {
        this.drugCreationWorkRequest = drugCreationWorkRequest;
    }

    @Override
    public String toString() {
        return WorkRequest.Type.ApproveDrugRequest.toString();
    }
    
}
