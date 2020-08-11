package com.designpatterns.singleton.lazy;

public class Bean {

    private static Bean instance = null;

    private Bean() {
    }

    public static Bean getInstance() {
        if (instance == null) {
            synchronized (Bean.class) {
                instance = new Bean();
            }
        }
        return instance;
    }
}
