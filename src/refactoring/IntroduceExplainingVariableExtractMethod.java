package refactoring;

public class IntroduceExplainingVariableExtractMethod {

    double price(int quantity, int itemPrice) {
        return basePrice(quantity, itemPrice)
                - quantityDiscount(quantity, itemPrice)
                + shipping(quantity, itemPrice);
    }

    private double shipping(int quantity, int itemPrice) {
        return Math.min(basePrice(quantity, itemPrice) * 0.1, 100);
    }

    private double quantityDiscount(int quantity, int itemPrice) {
        return Math.max(0, quantity - 500) * itemPrice * 0.05;
    }

    private double basePrice(int quantity, int itemPrice) {
        return quantity * itemPrice;
    }

}
