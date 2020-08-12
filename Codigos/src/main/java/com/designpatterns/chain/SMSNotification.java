package com.designpatterns.chain;

public class SMSNotification extends NotificationHandler {

    SMSNotification(NotificationHandler msg) {
        super(msg);
    }

    @Override
    protected String choose(Request request) {
        if (request.getMessageType().equals("Sms"))
            return "SMS: Você possui uma nova mensagem!";
        else
            return next(request);
    }
}
