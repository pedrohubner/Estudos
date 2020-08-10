package com.designpatterns.dependencyinjection;

public class Internet {

    private Boolean on;

    Internet(Boolean on) {
        this.on = on;
    }

    public Boolean getOn() {
        return on;
    }

    public void setOn(Boolean on) {
        this.on = on;
    }
}
