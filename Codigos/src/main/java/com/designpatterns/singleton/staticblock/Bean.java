package com.designpatterns.singleton.staticblock;

public class Bean {

    private static Bean instance;

    private Bean() {
    }
    
    static {
        try {
            instance = new Bean();
        } catch (RuntimeException e) {
            System.out.println("Ocorreu um erro na criação do objeto.");
        }
    }

    public static Bean getInstance() {
        return instance;
    }
}
