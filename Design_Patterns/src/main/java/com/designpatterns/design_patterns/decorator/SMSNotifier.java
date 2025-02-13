package com.designpatterns.design_patterns.decorator;

public class SMSNotifier extends NotifierDecorator{
    public SMSNotifier(Notifier notifier) {
        super(notifier);
    }
    @Override
    public void send(String message) {
        super.send(message); // First, send the original notification
        System.out.println("Sending SMS: " + message);
    }
}
