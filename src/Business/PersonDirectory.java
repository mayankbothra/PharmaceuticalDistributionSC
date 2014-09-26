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
public class PersonDirectory {
    
    ArrayList<Person> personList;
                    
    public PersonDirectory() {
        
       personList = new ArrayList<>();    
    }
    
    public ArrayList<Person> getPersonList() {
        return personList;
    }
    
    public Person newPerson() {
        Person person = new Person();
        personList.add(person);
        return person;
    }
    
    public void removePerson(Person person) {
        personList.remove(person);
    }
    
    /* public ArrayList<Person> findPersonByFirstName(String findPerson) {
        ArrayList<Person> personList1 = new ArrayList<>();
        
        for (Person currentperson : personList) {
            if(currentperson.getFirstName().equals(findPerson)) {
                System.out.println(currentperson);
                   personList1.add(currentperson);
            }
        }
             return personList1;
    }*/
    
    /*public Person findPersonByFirstName(String findPerson) {
        
        
        for (Person currentperson : personList) {
            if(currentperson.getFirstName().equals(findPerson)) {
                   return currentperson;
            }
        }            
        return null;
    }*/
}
    

