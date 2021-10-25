package refactoring;

import java.util.ArrayList;
import java.util.List;

public class ExtractMethod {
    public static void main(String[] args) {
        ExtractMethod test = new ExtractMethod();
        test.printOwing();
    }

    List<Order> orders = new ArrayList<Order>() {
        {
            add(new Order(20));
            add(new Order(30));
        }
    };

    void printOwing() {

        String name = "Test";
        printBanner();
        double outstanding = getOutstanding();
        printDetail(outstanding, name);
    }

    private double getOutstanding() {
        double outstanding = 0.0;
        for (Order order : orders) {
            outstanding += order.getAmount();
        }
        return outstanding;
    }

    private void printDetail(double outstanding, String name) {
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
    }

    private void printBanner() {
        System.out.println("********************");
        System.out.println("*** Customer Owe ***");
        System.out.println("********************");
    }

    public class Order {
        double amount = 10;

        public Order(double amount) {
            this.amount = amount;
        }

        public double getAmount() {
            return amount;
        }
    }
}


