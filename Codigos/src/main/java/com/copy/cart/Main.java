package com.copy.cart;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Country country = new Country("Brasil");

        Address address = new Address("Rua Dom Casmurro", 55, country);

        Client client = new Client("Pedro","Hübner", 18, address);

        ShoppingCart shoppingCart = new ShoppingCart(1, client);
        ShoppingCart shoppingCart1 = (ShoppingCart) shoppingCart.clone();

        shoppingCart1.getClient().getAddress().getCountry().setName("Argentina");

        System.out.println("Hey");
    }
}
