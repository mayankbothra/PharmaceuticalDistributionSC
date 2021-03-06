/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.Drug;
import Business.Enterprises.Enterprise;
import Business.MedicinePackage;
import java.util.ArrayList;

/**
 *
 * @author mayank
 */
public class ExpiredDrugsWorkRequest extends WorkRequest {
    
    private WorkRequest request;
    private Enterprise fromEnterprise;
    private Enterprise againstEnterprise;
    private complaintType type;
    private ArrayList<Drug> unlicensedDrug;
    private ArrayList<MedicinePackage> medicinePackageList;
    
    public ExpiredDrugsWorkRequest() {
    }
    
    public static enum complaintType {
        InvalidOrder { @Override
            public String toString() {
                return "Invalid Order";
            }},
        UnlicensedEnterprise { @Override
            public String toString() {
                return "Unlicensed Enterprise";
            }};
    }

    public complaintType getType() {
        return type;
    }

    public void setType(complaintType type) {
        this.type = type;
    }

    public Enterprise getFromEnterprise() {
        return fromEnterprise;
    }

    public void setFromEnterprise(Enterprise fromEnterprise) {
        this.fromEnterprise = fromEnterprise;
    }

    public Enterprise getAgainstEnterprise() {
        return againstEnterprise;
    }

    public void setAgainstEnterprise(Enterprise againstEnterprise) {
        this.againstEnterprise = againstEnterprise;
    }

    public WorkRequest getRequest() {
        return request;
    }

    public void setRequest(WorkRequest request) {
        this.request = request;
    }

    public ArrayList<Drug> getUnlicensedDrug() {
        return unlicensedDrug;
    }

    public void setUnlicensedDrug(ArrayList<Drug> unlicensedDrug) {
        this.unlicensedDrug = unlicensedDrug;
    }

    public ArrayList<MedicinePackage> getMedicinePackageList() {
        return medicinePackageList;
    }

    public void setMedicinePackageList(ArrayList<MedicinePackage> medicinePackageList) {
        this.medicinePackageList = medicinePackageList;
    }

    @Override
    public String toString() {
        return WorkRequest.Type.ComplaintWorkRequest.toString();
    }
    
}
