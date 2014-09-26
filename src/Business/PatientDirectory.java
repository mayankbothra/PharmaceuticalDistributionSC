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
public class PatientDirectory {
    
    ArrayList<Patient> patientList;
    
    public PatientDirectory() {
        patientList = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }
    
    public Patient newPatient() {
        Patient patient = new Patient();
        patientList.add(patient);
        return patient;
    }
    
}
