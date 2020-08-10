package com.designpatterns.memento;

public class Message {

    private String message;

    Message() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BackUp saveBackUp() {
        return new BackUp(message);
    }

    public void getBackUp(BackUp backUp) {
        message = backUp.getCheckPoint();
    }

    @Override
    public String toString() {
        return message;
    }
}
