package com.designpatterns.chain;

public class Request {

    private String messageType;

    Request(String messageType) {
        this.messageType = messageType;
    }

    String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
}
