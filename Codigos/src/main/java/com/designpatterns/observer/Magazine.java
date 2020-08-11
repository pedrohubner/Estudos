package com.designpatterns.observer;

import java.util.List;

public class Magazine implements Publisher {

    private String name;
    private String disponibility;
    private List<Subscriber> subscriberList;

    Magazine() {
    }

    Magazine(String name, String disponibility, List<Subscriber> subscriberList) {
        this.name = name;
        this.disponibility = disponibility;
        this.subscriberList = subscriberList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisponibility() {
        return disponibility;
    }

    public void setDisponibility(String disponibility) {
        this.disponibility = disponibility;
        notifyObserver();
    }

    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<Subscriber> subscriberList) {
        this.subscriberList = subscriberList;
    }

    @Override
    public void registerObserver(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void removeObserver(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifyObserver() {
        for (Subscriber sub : subscriberList) {
            sub.update(this);
        }
    }
}
