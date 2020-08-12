package com.designpatterns.singleton.lazy;

public class Bean {

    private static Bean instance = null;

    private Bean() {
    }

    public static Bean validateInstance() {
        if (instance == null) {
            instance = new Bean();
            System.out.println("Objeto singleton criado");
        }
        return instance;
    }
}
