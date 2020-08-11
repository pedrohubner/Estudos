package com.designpatterns.singleton.lazyload;

public class Bean {

    private Bean() {
    }

    private static class Singleton {
        private static final Bean INSTANCE = new Bean();
    }

    public static Bean getInstance() {
        return Singleton.INSTANCE;
    }
}
