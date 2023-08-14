package lexicon;

import lexicon.data.Order;
import lexicon.model.Burger;
import lexicon.model.CheeseType;
import lexicon.model.Drink;
import lexicon.model.Fries;

public class App {
    public static void main(String[] args) {

        Burger cheeseburger = new Burger("Cheeseburger", 99.00, "Beef");
        Drink soda = new Drink("Soda", 9.00, "Medium");

        Burger burger = new Burger("Burger", 89.00,"Beef");
        Drink cola = new Drink("Cola", 19.00, "Small");

        Fries normalFries = new Fries("NormalFries", 19.00, CheeseType.WITHOUT_CHEESE);
        Fries friesWithCheese = new Fries("NormalFries", 19.00, CheeseType.GODA);

        Order order1 = new Order();
        order1.addItem(cheeseburger);
        order1.addItem(soda);
        order1.addItem(burger);
        order1.addItem(cola );
        order1.addItem(soda);
        order1.displayItems();
    }
}
