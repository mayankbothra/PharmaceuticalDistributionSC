/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkRequest;

import Business.Order;

/**
 *
 * @author mayank
 */
public class OrderDrugsWorkRequest extends WorkRequest {
    
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    @Override
    public String toString() {
        return WorkRequest.Type.OrderDrugs.toString();
    }
}
