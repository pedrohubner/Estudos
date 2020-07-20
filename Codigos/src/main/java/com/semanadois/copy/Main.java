package com.semanadois.copy;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Country country = new Country("Brasil");

        Address address = new Address("Rua Dom Casmurro", 55, country);

        Client client = new Client("Pedro","Hübner", 18, address);

        ShoppingCart shoppingCart = new ShoppingCart(1, client);

        Country newCountry = (Country) country.clone();
        Address newAddress = (Address) address.clone();
        Client newClient = (Client) client.clone();

        newCountry.setName("Argentina");
        newAddress.setStreet("Rua Camboriú");
        newAddress.setNumber(58);
        newClient.setFirstName("Naã");

        System.out.println("País antigo: " + country.getName());
        System.out.println("País novo: " + newCountry.getName());

        System.out.println("\nNome da rua antigo: " + address.getStreet());
        System.out.println("Nome da rua novo: " + newAddress.getStreet());

        System.out.println("\nNúmero da rua antigo: " + address.getNumber());
        System.out.println("Número da rua novo: " + newAddress.getNumber());

        System.out.println("\nCliente antigo: " + client.getFirstName());
        System.out.println("Cliente novo: " + newClient.getFirstName());

        newClient.setAddress(newAddress);

        System.out.println(newClient.getAddress());
    }
}
