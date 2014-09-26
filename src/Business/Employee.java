/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Mayank
 */
public class Employee {
    
    private static int count = 0;
    private int employeeId;
    private Person person;
    private String designation;
    
    public Employee() {
        count++;
        employeeId = count;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    @Override
    public String toString() {
        return getPerson().toString();
    }
    
    

}
