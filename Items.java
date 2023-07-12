import java.util.Locale;
import java.text.NumberFormat;

public class Items {
    // MEMBER VARIABLES
    private String name;
    private double price;

    // CONSTRUCTORS
    public Items() {
    }
    public Items(String name) {
        this.name = name;
    }

    public Items(double price) {
        this.price = price;
    }

    public Items(String name, double price) {
        this.name = name;
        this.price = price;
    }

        // GETTERS
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getFormattedPrice() {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        return currencyFormatter.format(price);
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be greater than 0");
        }
    }

    // METHODS



    
}
