/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.SuspectPackage;

/**
 *
 * @author mayank
 */
public class SuspectPackageWorkRequest extends WorkRequest{
    
    private SuspectPackage suspectPackage;
    
    public SuspectPackageWorkRequest() {
    }

    public SuspectPackage getSuspectPackage() {
        return suspectPackage;
    }

    public void setSuspectPackage(SuspectPackage suspectPackage) {
        this.suspectPackage = suspectPackage;
    }

    

    @Override
    public String toString() {
        return WorkRequest.Type.SuspectDrugWorkRequest.toString();
    }
    
}
