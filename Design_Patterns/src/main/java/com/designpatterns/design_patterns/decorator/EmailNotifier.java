package com.designpatterns.design_patterns.decorator;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Email Notification: " + message);
    }
}
