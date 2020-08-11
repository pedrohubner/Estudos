package com.designpatterns.observer;

public interface Publisher {

    public void registerObserver(Subscriber subscriber);
    public void removeObserver(Subscriber subscriber);
    public void notifyObserver();
}
