package com.designpatterns.design_patterns.observer;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifySubscribers(String videoName);
}
