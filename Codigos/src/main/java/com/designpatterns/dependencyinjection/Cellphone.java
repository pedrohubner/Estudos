package com.designpatterns.dependencyinjection;

public class Cellphone {

    private Internet internet;

    Cellphone(Internet internet) {
        this.internet = internet;
    }

    public Internet getInternet() {
        return internet;
    }

    public void setInternet(Internet internet) {
        this.internet = internet;
    }

    public String internetOn() {
        if (!internet.getOn())
            return "Estamos sem internet.";
        return "Internet esta ligada";
    }
}
