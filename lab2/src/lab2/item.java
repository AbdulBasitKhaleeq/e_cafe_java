/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author a_bas
 */
public class item {
    private String name;
    private String type;
    private int price;
    
    
    public item(){}
    
    public item(String item_name,String item_type,int item_price) {
       this.name=item_name;
       this.type=item_type;
       this.price=item_price;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
       
}
