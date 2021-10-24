package refactoring;

import java.util.ArrayList;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        Example1 test = new Example1();
        test.printOwing();
    }

    List<Order> orders = new ArrayList<Order>() {
        {
            add(new Order(20));
            add(new Order(30));
        }
    };
    
    void printOwing() {
        double outstanding = 0.0;
        String name = "Test";
        System.out.println("********************");
        System.out.println("*** Customer Owe ***");
        System.out.println("********************");

        for (Order order : orders) {
            outstanding += order.getAmount();
        }

        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
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


