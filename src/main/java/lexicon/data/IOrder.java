package lexicon.data;

import lexicon.model.Product;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public interface IOrder {
    int MAX_ITEM = 10;

    Product[] getItems();

    void removeItem(Product item);

    void addItem(Product item);

    default double calculatePrice() {
        double total = 0;
        for (Product item : getItems()) {
            total += item.getPrice();
        }
        return total;
    }

    default String calculatePriceWithTax() {
        double total = 0;
        for (Product item : getItems()) {
            total += item.getPrice() + item.calculateTaxes();
        }
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);

        return df.format(total);
    }

    default void displayItems() {
        int counter = 1;
        for (Product item : getItems()) {
            System.out.println("ORDER [" + counter++ + "]---------------");
            item.displayInfo();
        }
        System.out.println("######################");
        System.out.println("Total Order Cost: " + calculatePrice());
        System.out.println("Total Order Cost With Tax: " + calculatePriceWithTax());
        System.out.println("######################");
    }
}
