package com.designpatterns.dependencyinjection;

public class Computer {

    private Internet internet;

    Computer() {
    }

    public Internet getInternet() {
        return internet;
    }

    public void setInternet(Internet internet) {
        this.internet = internet;
    }
}
