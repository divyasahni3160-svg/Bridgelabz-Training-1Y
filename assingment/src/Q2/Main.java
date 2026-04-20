package Q2;

public class Product {
    String name;
    double price;
    double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public double getPrice() { return price; }
    public double getRating() { return rating; }
    @Override public String toString() { return name + " ($" + price + ")"; }
}