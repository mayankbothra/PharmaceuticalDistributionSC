/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Mayank
 */
public class Address {
    
    private String line1;
    private String line2;
    private String city;
    private String state;
    private int zipCode;
   
    public Address() {
        
    }
    
    public String getLine1() {
        return line1;
    }
    
    public String getLine2() {
        return line2;
    }
    
    public String getCity() {
        return city;
    }
    
    public String getState() {
        return state;
    }
    
    public int getZipCode() {
        return zipCode;
    }
    
    public void setLine1(String line1) {
        this.line1 = line1;
    }
    
    public void setLine2(String line2) {
        this.line2 = line2;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    
}
