package lexicon.model;

public enum CheeseType {
    WITHOUT_CHEESE(0),
    GODA(10),
    CHILI_CHEESE(20);

    private double price;

    CheeseType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
