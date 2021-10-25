package refactoring;

public class ReplaceTempWithQueru {

    public double getPrice(int quantity, int itemPrice) {
        return basePrice(quantity, itemPrice) * discountFactor(quantity, itemPrice);
    }

    private double discountFactor(int quantity, int itemPrice) {
        if (basePrice(quantity, itemPrice) > 1000) {
            return 0.95;
        } else {
            return 0.98;
        }
    }

    private int basePrice(int quantity, int itemPrice) {
        return quantity * itemPrice;
    }

}
