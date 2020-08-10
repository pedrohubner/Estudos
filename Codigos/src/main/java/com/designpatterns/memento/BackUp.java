package com.designpatterns.memento;

public class BackUp {

    private String checkPoint;

    BackUp() {
    }

    BackUp(String checkPoint) {
        this.checkPoint = checkPoint;
    }

    public String getCheckPoint() {
        return checkPoint;
    }

    public void setCheckPoint(String checkPoint) {
        this.checkPoint = checkPoint;
    }
}
