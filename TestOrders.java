import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Items item1 = new Items("Drip Coffee", 1.50);
        Items item2 = new Items("Latte", 3.50);
        Items item3 = new Items("Mocha", 2.00);
        Items item4 = new Items("Cappuccino", 3.50);

        Orders order1 = new Orders();
        Orders order2 = new Orders();

        // Early Testing
        //System.out.println(item1.getName() + "- " + item1.getPrice());
        // Early Testing
        //System.out.println(order1.getName());

        // Create 3 orders using the overloaded constructor 
        //to give each a name for the order.
        Orders order3 = new Orders("John");
        Orders order4 = new Orders("Jane");
        Orders order5 = new Orders("Joe");

        // Early Testing
        //System.out.println(order3.getName());
        //System.out.println(order4.getName());
        //System.out.println(order5.getName());

        // Add items to orders 
        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item3);
        order2.addItem(item4);

        order3.addItem(item1);
        order3.addItem(item2);

        order4.addItem(item3);
        order4.addItem(item4);

        order5.addItem(item1);
        order5.addItem(item2);

        // Early Testing
        //System.out.println(order1.getOrderTotal());
        //System.out.println(order2.getOrderTotal());
        //System.out.println(order3.getOrderTotal());
        //System.out.println(order4.getOrderTotal());
        //System.out.println(order5.getOrderTotal());

        // Create an ArrayList of orders
        ArrayList<Orders> orders = new ArrayList<Orders>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);

        // Loop through the ArrayList of orders and print the name and total for each
        //for (Orders order : orders) {
            //System.out.println(order.getName() + " - " + order.getOrderTotal());
        //}
        
        order1.setReady(true);
        order2.setReady(true);

        //System.out.println(order1.getOrderStatus());
       // System.out.println(order2.getOrderStatus());
        //System.out.println(order3.getOrderStatus());

        // Loop through the ArrayList of orders and use display to print each
        for (Orders order : orders) {
            order.display();
        }
    }
}
