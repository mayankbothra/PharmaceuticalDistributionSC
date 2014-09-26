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
public class Order {
    
    private static int count = 0;
    private int orderNumber;
    private String date;
    private ArrayList<OrderItem> orderItemList;
    
    public Order() {
        orderItemList = new ArrayList<>();
        count++;
        orderNumber = count;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    
    
    public OrderItem newOrderItem() {
        OrderItem orderItem = new OrderItem();
        orderItemList.add(orderItem);
        return orderItem;                
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Order.count = count;
    }

    @Override
    public String toString() {
        return (String.valueOf(orderNumber));
    }
}
