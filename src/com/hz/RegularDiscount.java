package com.hz;

import products.Product;

public class RegularDiscount implements DiscountStrategy {

    private Customer customer;

    public RegularDiscount(Customer customer) {
        this.customer = customer;
    }

    public double getDiscount(Product product, int index) {
        double discount = 0.0;

        // Default situation: new customers full price, regular 15% off
        if (customer.isRegular()) {
            discount = .15;
        }

        return 1 - discount;
    }
}

