/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

/**
 *
 * @author mayank
 */
public class ApplyForLicenseWorkRequest extends WorkRequest{
    
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

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }
    
    
    

    @Override
    public String toString() {
        return WorkRequest.Type.ApplyForLicenseRequest.toString();
    }
    
}
