package com.designpatterns.chain;

public class EmailNotification extends NotificationHandler {

    EmailNotification(NotificationHandler msg) {
        super(msg);
    }

    @Override
    protected String choose(Request request) {
        if (request.getMessageType().equals("Email"))
            return "Email: você possui uma nova notificação no email";
        else
            return next(request);
    }
}
