package com.copy.deepcopy;

public class Product implements Cloneable {

    private String productsName;
    private Double value;
    private Integer amount;

    Product(String productsName, Double value, Integer amount) {
        this.productsName = productsName;
        this.value = value;
        this.amount = amount;
    }

    public String getProductsName() {
        return productsName;
    }

    public void setProductsName(String productsName) {
        this.productsName = productsName;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Produto: " + productsName + "\nPreço: " + value + "\nQuantidade: " + amount;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
