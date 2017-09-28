/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 *
 * @author a_bas
 */
public class order {
    private String delivery_type; //order delivery or self pick
    private String customer_name;  //customer Name
    private Date order_time;        //order_Time
    private List<item> items;       //ordered items in the list
    private String address;         //delivery address
    private int bill;
    public order() {
    }

    public order(String delivery_type, String customer_name, Date order_time, List<item> items, String address) {
        this.delivery_type = delivery_type;
        this.customer_name = customer_name;
        this.order_time = order_time;
        this.items = items;
        this.address = address;
    }

    public void setDelivery_type(String delivery_type) {
        this.delivery_type = delivery_type;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setOrder_time(Date order_time) {
        this.order_time = order_time;
    }

    public void setItems(item items) {
        this.items.add(items);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDelivery_type() {
        return delivery_type;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public Date getOrder_time() {
        return order_time;
    }

    public List<item> getItems() {
        return items;
    }

    public String getAddress() {
        return address;
    }
    
    
    public Void getBill(){
    int price=0;
        for (int i = 0; i < items.size(); i++) {
            item ii = items.get(i);
            System.out.println((i+1) +"\nItem Name " + ii.getName());
            System.out.println("\n Item Price" + ii.getPrice());
            System.out.println("\n Item type" + ii.getType());
            System.out.println("\n\n");
            price=price+ii.getPrice();
        }
    
    System.out.println("Total Price is: " + price);
        return null;
    }
    public int Bill(){
        int price=0;
        for (int i = 0; i < items.size(); i++) {
            item ii=items.get(i);
             price=price+ii.getPrice();
        }
    return bill;}

    
    
}
