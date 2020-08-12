package com.designpatterns.chain;

public abstract class NotificationHandler {

    private NotificationHandler notification;

    NotificationHandler(NotificationHandler notification) {
        this.notification = notification;
    }

    protected abstract String choose(Request request);

    protected String next(Request request) {
        return notification.choose(request);
    }
}
