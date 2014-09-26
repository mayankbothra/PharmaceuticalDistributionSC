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
public class DrugCreationWorkRequest extends WorkRequest {
    
    Drug drug;
    String decision;
    
    public static enum status {
        APPROVED { @Override
            public String toString() {
                return "Approve";
            }},
        REJECTED { @Override
            public String toString() {
                return "Rejected";
            }},        
        PENDING { @Override
            public String toString() {
                return "Decision Pending";
            }},        
    }

    public DrugCreationWorkRequest() {
        setStatus(Status.ForApproval);
    }
    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }
    
    
    
        @Override
    public String toString() {
        return WorkRequest.Type.DrugCreationRequest.toString();
    }
}
