/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public class EmployeeDirectory {
    
    ArrayList<Employee> employeeList;
    
    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee newEmployee() {
        Employee employee = new Employee();
        employeeList.add(employee);
        return employee;
    }
    
    public void deleteEmployee(Person person) {
        Employee emp = null;
        for(Employee e : employeeList) {
            if(e.getPerson() == person) {
                emp = e;
            }
        }
        if(emp != null) {
            employeeList.remove(emp);
        }
    }
}
