/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Mayank
 */
public class Drug {
    
    private static int count = 10000;
    private int drugId;
    private String drugName;
    private String licenseIssueDate;
    private String licenseExpiryDate;
    private String manufacturerName;
    
    public Drug() {
//        count++;
//        drugId = count;
    }

    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }
    
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getLicenseIssueDate() {
        return licenseIssueDate;
    }

    public void setLicenseIssueDate(String licenseIssueDate) {
        this.licenseIssueDate = licenseIssueDate;
    }

    public String getLicenseExpiryDate() {
        return licenseExpiryDate;
    }

    public void setLicenseExpiryDate(String licenseExpiryDate) {
        this.licenseExpiryDate = licenseExpiryDate;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Drug.count = count;
    }
    
    @Override
    public String toString() {
        return drugName;
    }
}
