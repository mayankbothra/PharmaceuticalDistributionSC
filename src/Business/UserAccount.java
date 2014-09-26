/*
 * To change this template, choose Tools | Templates
 * 
 * and open the template in the editor.
 */
package Business;

import Business.Employee;
import Business.Roles.Role;
import Business.WorkRequest.WorkQueue;

/**
 *
 * @author Mayank
 */
public class UserAccount {

    private String userName;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;

    
    public String getUserName() {
        return userName;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return getEmployee().getPerson().getFirstName();
    }
    
    
           
}
