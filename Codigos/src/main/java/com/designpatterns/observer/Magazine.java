package com.designpatterns.observer;

import java.util.List;

public class Magazine implements Publisher {

    private String name;
    private String availability;
    private List<Subscriber> subscriberList;

    Magazine() {
    }

    Magazine(String name, String availability, List<Subscriber> subscriberList) {
        this.name = name;
        this.availability = availability;
        this.subscriberList = subscriberList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getavailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
        notifySubscriber();
    }

    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<Subscriber> subscriberList) {
        this.subscriberList = subscriberList;
    }

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscriber() {
        for (Subscriber sub : subscriberList) {
            sub.update(this);
        }
    }
}
