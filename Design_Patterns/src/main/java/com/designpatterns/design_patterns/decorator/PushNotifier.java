package com.designpatterns.design_patterns.decorator;

public class PushNotifier extends NotifierDecorator{
    public PushNotifier(Notifier notifier) {
        super(notifier);
    }
    @Override
    public void send(String message) {
        super.send(message); // First, send the original notification
        System.out.println("Sending Push Notification: " + message);
    }
}
