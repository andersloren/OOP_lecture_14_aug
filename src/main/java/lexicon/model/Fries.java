package lexicon.model;

public class Fries extends Product {

    private CheeseType cheeseType;

    public Fries(String name, double price, CheeseType cheeseType) {
        super(name, (price + cheeseType.getPrice()));
        this.cheeseType = cheeseType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("CheeseType: " + cheeseType);
    }

    // Here we cannot use static, because of getPrice(), why is that?
    private double addExtraPrice(CheeseType cheeseType) {
        return getPrice() + cheeseType.getPrice();
    }

    @Override
    public double calculateTaxes() {
        return getPrice() * 0.2;
    }
}
