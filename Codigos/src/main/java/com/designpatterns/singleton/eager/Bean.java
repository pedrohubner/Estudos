package com.designpatterns.singleton.eager;

public class Bean {

    private static final Bean SINGLE_INSTANCE = new Bean();

    private Bean() {
    }

    public static Bean getInstance() {
        return SINGLE_INSTANCE;
    }
}
