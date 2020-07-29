package com.copy.cart;

import java.util.List;

public class ShoppingCart implements Cloneable {

    private Integer id;
    private Client client;
    private List<Product> productsList;

    public ShoppingCart(Integer id, Client client) {
        this.id = id;
        this.client = client;
    }

    ShoppingCart(Integer id, Client client, List<Product> productsList) {
        this.id = id;
        this.client = client;
        this.productsList = productsList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ShoppingCart shoppingCart = (ShoppingCart) super.clone();
        shoppingCart.client = (Client) client.clone();
        return shoppingCart;
    }
}
