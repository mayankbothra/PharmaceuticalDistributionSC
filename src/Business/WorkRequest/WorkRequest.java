/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.UserAccount;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Mayank
 */
public abstract class WorkRequest {

    public static enum Status {

        ForApproval { @Override
            public String toString() {
                return "For Approval";
            }},
        OrderRejected { @Override
            public String toString() {
                return "Order Rejected";
            }},
         Processed { @Override
            public String toString() {
                return "Processed";
            }},
         AddedToCatalog { @Override
            public String toString() {
                return "Added To Catalog";
            }},
         CreateBatch { @Override
            public String toString() {
                return "Create Batch";
            }},
         BatchCreated { @Override
            public String toString() {
                return "Batch Created";
            }},
        OrderPlaced { @Override
            public String toString() {
                return "Order Placed";
            }},
        OrderProcessing { @Override
            public String toString() {
                return "Order Processing";
            }},
        OrderApproved { @Override
            public String toString() {
                return "Order Approved";
            }},
        MakeShippment { @Override
            public String toString() {
                return "Make Shippment";
        }},
        Shipped { @Override
            public String toString() {
                return "Shipped";
        }},
        Prescribed { @Override
            public String toString() {
                return "Drugs Prescribed";
        }},
        SuspectDrugComplaint { @Override
            public String toString() {
                return "Suspect Complaint";
        }},
        
        SuspectPackageComplaint { @Override
            public String toString() {
                return "Suspect Complaint";
        }},
        FAKE { @Override
            public String toString() {
                return "FAKE";
        }},
        THEFT { @Override
            public String toString() {
                return "THEFT";
        }},
         
        OrderReceived { @Override
            public String toString() {
            return "Order Received";
        }};
    }

    public static enum Type {
        
        ApplyForLicenseRequest { @Override
            public String toString() {
                return "Apply License WR";
            }},
        DrugCreationRequest { @Override
            public String toString() {
                return "Drug Creation WR";
            }},
        ApproveDrugRequest { @Override
            public String toString() {
                return "Approve Drug WR";
            }},
        RejectDrugRequest { @Override
            public String toString() {
                return "Reject Drug WR";
            }},
        CreateBatchRequest { @Override
            public String toString() {
                return "Create Batch WR";
            }},
        OrderDrugs { @Override
            public String toString() {
                return "Drugs Order WR";
            }},
        SalesWorkReuest { @Override
            public String toString() {
                return "Sales WR";
            }},
        ShipWorkRequest { @Override
            public String toString() {
                return "Ship WR";
            }},
        ComplaintWorkRequest { @Override
            public String toString() {
                return "Complaint WR";
            }},
        PrescribeDrugsWorkRequest { @Override
            public String toString() {
                return "Prescribe WR";
            }},
        ShortageDrugsWorkRequest { @Override
            public String toString() {
                return "Shortage Drugs WR";
            }},
        SuspectDrugWorkRequest { @Override
            public String toString() {
                return "Suspect Drug WR";
        }},
        SuspectPackageWorkRequest { @Override
            public String toString() {
                return "Suspect Package WR";
        }},
        TheftWorkRequest { @Override
            public String toString() {
                return "Theft Report WR";
        }},
        ReceiveShipmentWorkRequest { @Override
            public String toString() {
                return "Receive Shipment WR";
            }};
    }
    
    private WorkRequest.Status status;
    private UserAccount sender;
    private UserAccount receiver;
    private String requestDate;
    private String resolveDate;

    public WorkRequest() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM dd yy HH:mm:ss");
        Date date = new Date();
        String currentDate = sdf.format(date);
        requestDate = currentDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(String resolveDate) {
        this.resolveDate = resolveDate;
    }
    
    

}
