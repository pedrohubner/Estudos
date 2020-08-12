package com.designpatterns.observer;

public interface Publisher {

    public void registerSubscriber(Subscriber subscriber);
    public void removeSubscriber(Subscriber subscriber);
    public void notifySubscriber();
}
