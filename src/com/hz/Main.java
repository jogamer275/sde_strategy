package com.hz;

import products.BlenderWithIntegratedRadio;
import products.CuteTeddyBear;
import products.TVScreen;

public class Main {

    // Main scenario
    public static void main(String[] args) {

        // There is a shop with a checkout
        Checkout kassa5 = new Checkout();

        // Two customers enter the shop
        Customer piet = new Customer(CustomerType.New, "Piet");
        Customer anne = new Customer(CustomerType.Regular, "Anne");
        Customer jan = new Customer(CustomerType.New, "Jan");
        Customer sjaak = new Customer(CustomerType.New, "Sjaak");


        // buying stuff
        piet.buys(new CuteTeddyBear());
        piet.buys(new CuteTeddyBear());
        anne.buys(new TVScreen());
        jan.buys(new TVScreen());
        jan.buys(new BlenderWithIntegratedRadio());
        sjaak.buys(new BlenderWithIntegratedRadio());

        // Proceed to checkout
        // Piet bought two Teddy Bears on Christmas eve. One with 20% discount and the other with 12.5% discount
        // Calculation: (0.8 * 6.97) + (0.875 * 6.97) = 11,67
        kassa5.nextInLine(piet, "Christmas");

        // Anne is a regular customer and has bought a TV
        // Calculation: 0.85 * 897.99 = 763,29
        kassa5.nextInLine(anne, "Regular Customer Discount");

        // Jan bought a TV and a blender on Black Friday
        // Calculation: 0.2 * (1897.99 + 897.99) = 559.20
        kassa5.nextInLine(jan, "Black Friday");

        // Sjaak bought a blender on a normal day
        // Sjaak is de sjaak. En moet het volle pond betalen.
        kassa5.nextInLine(sjaak, "No discount for you");
    }
}
