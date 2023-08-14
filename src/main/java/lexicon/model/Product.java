package lexicon.model;

public abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Item: " + name);
        System.out.println("Price: SEK " + price);
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculateTaxes();
}
