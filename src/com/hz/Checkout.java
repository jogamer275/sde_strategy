package com.hz;

import products.Product;

public class Checkout {

    public void nextInLine(Customer customer, String day) {

        DiscountStrategy strategy;


        // init checkout
        switch (day) {
            case "Christmas":
                strategy = new ChristmasDiscount(customer);
                break;
            case "Black Friday":
                strategy = new BlackFridayDiscount(customer);
                break;
            default:
                strategy = new RegularDiscount(customer);
        }

        // Welcome customer
        String welcome = String.format("Hello %s, would you pass me your shopping cart?",
                customer.getName());
        Console.write(welcome);

        // perform checkout
        ShoppingCart cart = customer.getCart();

        double amountToPay = cart.getTotalPrice(strategy);
        String payinfo = String.format("Let's see, that will be.. %.02f. Cash or card?", amountToPay);
        Console.write(payinfo);
    }
}
