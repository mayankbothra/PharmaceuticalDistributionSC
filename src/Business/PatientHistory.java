/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author mayank
 */
public class PatientHistory {
    
    private ArrayList<VisitRecord> visitRecordList;

    public PatientHistory() {
        visitRecordList = new ArrayList<>();
    }

    public ArrayList<VisitRecord> getVisitRecordList() {
        return visitRecordList;
    }

    public void setVisitRecordList(ArrayList<VisitRecord> visitRecordList) {
        this.visitRecordList = visitRecordList;
    }

    
    public void addVisitRecord(VisitRecord vr){
        visitRecordList.add(vr);  
    }    
}
