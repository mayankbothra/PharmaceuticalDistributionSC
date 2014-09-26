/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

/**
 *
 * @author Mayank
 */
public class ReceiveShippmentWorkRequest extends WorkRequest{
    
    private ShipWorkRequest shipWorkRequest;
    
    public ReceiveShippmentWorkRequest() {
        setStatus(Status.Shipped);
    }

    public ShipWorkRequest getShipWorkRequest() {
        return shipWorkRequest;
    }

    public void setShipWorkRequest(ShipWorkRequest shipWorkRequest) {
        this.shipWorkRequest = shipWorkRequest;
    }
       
    @Override
    public String toString() {
       return WorkRequest.Type.ReceiveShipmentWorkRequest.toString();
    }
}
