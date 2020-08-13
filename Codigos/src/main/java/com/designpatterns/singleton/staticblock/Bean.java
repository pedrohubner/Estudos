package com.designpatterns.singleton.staticblock;

public class Bean {

    private static Bean instance;

    private Bean() {
    }
    
    static {
        try {
            instance = new Bean();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado.");
        }
    }

    public static Bean getInstance() {
        return instance;
    }
}
