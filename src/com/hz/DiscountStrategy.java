package com.hz;

import products.Product;

public interface DiscountStrategy {

    public double getDiscount(Product product, int index);
}
