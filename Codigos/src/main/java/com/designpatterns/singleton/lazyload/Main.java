package com.designpatterns.singleton.lazyload;

public class Main {
    public static void main(String[] args) {

        Bean bean = Bean.getInstance();
        Bean bean1 = Bean.getInstance();

        System.out.println(bean.hashCode());
    }
}
