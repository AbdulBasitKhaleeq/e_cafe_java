/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author a_bas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private List<item> menu_items;
    private List<order> orders;
    private Date current;
    public void add_Menu_items() {
        item Item = new item();
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter Name of Item\n");
        String name = sc.next();
        Item.setName(name);

        System.out.println("\nEnter type of Item\n\n1.\n1.appetizers"
                + " \n2.soups\n3.main course dishes \n4. side dishes");

        int opt = sc.nextInt();
        if (opt == 1) {
            Item.setType("appetizers");
        } else if (opt == 2) {
            Item.setType("soups");
        } else if (opt == 3) {
            Item.setType("main course dishes");
        } else if (opt == 4) {
            Item.setType("side dishes");
        } else {
            System.out.println("Enetered wrong values plz come again");
            return;
        }

        System.out.println("\nEnter price of Item\n");
        int price = sc.nextInt();
        Item.setPrice(price);

        menu_items.add(Item);
    }

    private void print_menu() {
        for (int i = 0; i < menu_items.size(); i++) {
            item ii = menu_items.get(i);
            System.out.println((i+1) +"\nItem Name " + ii.getName());
            System.out.println("\n Item Price" + ii.getPrice());
            System.out.println("\n Item type" + ii.getType());
            System.out.println("\n\n");
        }

    }
    
    private void new_order(){
    order oo=new order();
    Scanner sc=new Scanner(System.in);
    System.out.println("\nEnter Name of Customer\n");
    String name = sc.next();
    oo.setCustomer_name(name);
    oo.setOrder_time(current);
    System.out.println("\nEnter Delivery Type\n1.order delivery \n2. self pick\n");
    int d_opt= sc.nextInt();
    if(d_opt==1){
        oo.setDelivery_type("order delivery");
        System.out.println("\nEnter Address\n");
        String address=sc.next();
        oo.setAddress(address);
    }
    else if(d_opt==2){
        oo.setDelivery_type("self pick");
        oo.setAddress(null);
    }
    else{
        return;
    }
    int opt=1;
    do{
        System.out.println("\nSelect item from menu\n");
        
        print_menu();
        
        int item_no=sc.nextInt();
        item item=menu_items.get(item_no-1);
        oo.setItems(item);
        System.out.println("Item is aaded if you want to enter new item press 2"
                + " else press 1 to save");
        
    }while(opt!=1);
    orders.add(oo);
   }

   private void print_orders() {
        for (int i = 0; i < orders.size(); i++) {
            order O = orders.get(i);
            System.out.println((i+1) +"\nCustomer Name " + O.getCustomer_name());
            System.out.println("\n Order Price" + O.Bill());
            System.out.println("\n Delivery Type type" + O.getDelivery_type());
            System.out.println("\n Order Time" + O.getOrder_time());
            System.out.println("\n\n");
        }

    } 
    
    
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Main m=new Main();
        Calendar cal = Calendar.getInstance();
        cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        m.current=sdf.parse( sdf.format(cal.getTime()));
        Date eleven = sdf.parse("11:00");
        Date ten=sdf.parse("22:00");
       //While loop for shop options like this: 
       while( m.current.after(eleven)&& m.current.before(ten)){
        
        System.out.println("\nWelcom to E cafe\n");

        System.out.println("\nAdmin area\n");
        System.out.println("\n1. Add items\n2.See Menu\n3.New order\n4.Orders in Queue\n");

        Scanner sc = new Scanner(System.in);
        int option;
        option = sc.nextInt();

        switch (option) {
            case 1:
                m.add_Menu_items();
                break;
            case 2:
                m.print_menu();
                break;
            case 3:
                m.new_order();

                break;
            case 4:
                m.print_orders();
                break;
            default:
                break;
        }

       }
           System.out.print("E cafe is Close");
    }
}
