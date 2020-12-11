package com.hz;

import products.Product;

public class ChristmasDiscount implements DiscountStrategy {

    private Customer customer;

    public void setChristmasEve(boolean christmasEve) {

        isChristmasEve = christmasEve;
    }

    private boolean isChristmasEve;

    public ChristmasDiscount(Customer customer) {
        this.customer = customer;
    }

    public double getDiscount(Product product, int index) {

        double discount = 0.0;

        boolean isFirstProduct = index == 0;

        // on Christmas Eve, 1st product 20%, the next 12.5% discount
        if (isFirstProduct) {
            discount = .20;
        } else {
            discount = .125;
        }
        return 1 - discount;
    }

}
