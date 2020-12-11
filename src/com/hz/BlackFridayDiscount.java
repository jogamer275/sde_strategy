package com.hz;

import products.Product;

public class BlackFridayDiscount implements DiscountStrategy{

    private Customer customer;

    public BlackFridayDiscount(Customer customer) {
        this.customer = customer;
    }

    public double getDiscount(Product product, int index) {
        double discount = 0.0;

        // On Black Friday 80% off
            discount = .8;

        return 1 - discount;
    }
}