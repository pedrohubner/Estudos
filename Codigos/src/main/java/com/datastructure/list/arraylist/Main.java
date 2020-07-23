package com.datastructure.list.arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> productsList = new ArrayList<>();

        productsList.add(new Product("Dorflex", 5.5, 12));
        productsList.add(new Product("Dipirona", 4.0, 24));
        productsList.add(new Product("Torsilax", 11.9, 36));

        ShoppingCart shoppingCart = ShoppingCart.builder()
                .id(1)
                .productList(productsList)
                .build();

        System.out.println(shoppingCart.getProductList().get(0));
    }
}
