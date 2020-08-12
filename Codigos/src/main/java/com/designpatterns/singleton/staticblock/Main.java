package com.designpatterns.singleton.staticblock;

public class Main {
    public static void main(String[] args) {

        Bean bean = Bean.getInstance();
        Bean bean1 = Bean.getInstance();

        System.out.println("HashCode do objeto Bean é: " + bean.hashCode());
        System.out.println("HashCode do objeto Bean1 é: " + bean1.hashCode());
    }
}
