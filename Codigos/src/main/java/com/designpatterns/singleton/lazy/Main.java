package com.designpatterns.singleton.lazy;

public class Main {
    public static void main(String[] args) {

        Bean bean = Bean.validateInstance();

        System.out.println(bean);
    }
}
