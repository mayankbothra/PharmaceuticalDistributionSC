/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Mayank
 */
public class Patient {
    
    private static int count = 0;
    private int patientId;
    private Person person;
    private PatientHistory patientHistory;
    
    public Patient() {
        count++;
        patientId = count;
        patientHistory = new PatientHistory();
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Patient.count = count;
    }

    public PatientHistory getPatientHistory() {
        return patientHistory;
    }

    public void setPatientHistory(PatientHistory patientHistory) {
        this.patientHistory = patientHistory;
    }
    

    @Override
    public String toString() {
        return getPerson().toString();
    }
   
}
