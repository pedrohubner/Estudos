package com.designpatterns.chain;

public class TeamsNotification extends NotificationHandler {

    TeamsNotification(NotificationHandler msg) {
        super(msg);
    }

    @Override
    protected String choose(Request request) {
        if (request.getMessageType().equals("Teams"))
            return "Teams: você recebeu uma nova mensagem no Teams";
        else
            return next(request);
    }
}
