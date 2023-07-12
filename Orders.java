import java.util.ArrayList;
import java.util.Locale;
import java.text.NumberFormat;

public class Orders {
    private String name;
    private boolean ready;
    private ArrayList<Items> items;

    // CONSTRUCTORS
    public Orders() {
        this.name = "Guest";
        items = new ArrayList<Items>();
    }

    public Orders(String name) {
        this.name = name;
        items = new ArrayList<Items>();
    }

    public Orders(String name, boolean ready) {
        this.ready = ready;
        items = new ArrayList<Items>();
    }

    public Orders(String name, boolean ready, ArrayList<Items> items) {
        this.name = name;
        this.ready = ready;
        this.items = items;
    }


        // GETTERS
    public String getName() {
        return name;
    }

    public boolean isReady() {
        return ready;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }

    // METHODS

    public String getOrderTotal() {
        double total = 0;
        for (Items item : items) {
            total += item.getPrice();
        }
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        return currencyFormatter.format(total);
    }
    
    public void addItem(Items item) {
        items.add(item);
    }

    public String getOrderStatus() {
        if (ready) {
            return "Your order is ready.";
        } else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public void display() {
        if (name == "Guest") {
            System.out.println("Welcome to the Java Cafe!");
        } else {
            System.out.println("Welcome to the Java Cafe, " + name + "!");
        }
        System.out.println(getOrderStatus());
        System.out.println("Items Ordered: ");
        System.out.print("Items Ordered: ");
        for (Items item : items) {
            System.out.print(item.getName() + " - " + item.getFormattedPrice() + ", ");
        }
        System.out.println("\n");
        System.out.println("Your total is " + getOrderTotal() + "\n");
        System.out.println("Thank you for visiting the Java Cafe! :)\n\n");
    }
}

