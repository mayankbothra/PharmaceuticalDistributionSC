/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.Order;
import Business.Patient;
import Business.VisitRecord;

/**
 *
 * @author mayank
 */
public class PrescribeDrugsWorkRequest extends WorkRequest {
    
    private Order order;
    private Patient patient;
    private VisitRecord vr;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public VisitRecord getVr() {
        return vr;
    }

    public void setVr(VisitRecord vr) {
        this.vr = vr;
    }
    
    @Override
    public String toString() {
        return WorkRequest.Type.PrescribeDrugsWorkRequest.toString();
    }
}
