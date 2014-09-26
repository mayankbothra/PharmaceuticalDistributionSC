/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public class WorkQueue {

    private ArrayList<WorkRequest> workRequestList;
    
    public WorkQueue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public WorkRequest newWorkRequest(WorkRequest.Type type) {
        WorkRequest request = null;
        
        if(type == WorkRequest.Type.ReceiveShipmentWorkRequest) {
         request = new ReceiveShippmentWorkRequest();   
        }
        
        else if(type == WorkRequest.Type.ApproveDrugRequest) {
            request = new ApproveDrugWorkRequest();
        }
        
        else if(type == WorkRequest.Type.ApplyForLicenseRequest) {
            request = new ApplyForLicenseWorkRequest();
        }
        
        else if(type == WorkRequest.Type.RejectDrugRequest) {
            request = new RejectDrugWorkRequest();
        }
        
        else if(type == WorkRequest.Type.DrugCreationRequest) {
            request = new DrugCreationWorkRequest();
        }
        
        else if(type == WorkRequest.Type.CreateBatchRequest) {
            request = new CreateBatchWorkRequest();
        }
        
        else if(type == WorkRequest.Type.OrderDrugs) {
            request = new OrderDrugsWorkRequest();
        }
        
        else if(type == WorkRequest.Type.ShipWorkRequest) {
            request = new ShipWorkRequest();
        }
        
        else if(type == WorkRequest.Type.ComplaintWorkRequest) {
            request = new ComplaintWorkRequest();
        }
        
        else if(type == WorkRequest.Type.PrescribeDrugsWorkRequest) {
            request = new PrescribeDrugsWorkRequest();
        }
        
        else if(type == WorkRequest.Type.ShortageDrugsWorkRequest) {
            request = new ShortageDrugsWorkRequest();
        }
        else if(type == WorkRequest.Type.SuspectDrugWorkRequest) {
            request = new SuspectDrugWorkRequest();
        }
        
        else if(type == WorkRequest.Type.SuspectPackageWorkRequest) {
            request = new SuspectPackageWorkRequest();
        }
        
        else if(type == WorkRequest.Type.TheftWorkRequest) {
            request = new TheftWorkRequest();
        }
        
        if(request != null) {
            workRequestList.add(request);
        }
        
        return request;
    }
    
    public void addRequest(WorkRequest request) {
        workRequestList.add(request);
    }
}
