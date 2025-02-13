package com.designpatterns.design_patterns.decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        // Step 6.1: Basic Email Notification
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Hello User!");

        System.out.println("\nAdding SMS Notification:");
        // Step 6.2: Email + SMS Notification
        Notifier smsNotifier = new SMSNotifier(emailNotifier);
        smsNotifier.send("Hello User!");

        System.out.println("\nAdding Push Notification:");
        // Step 6.3: Email + SMS + Push Notification
        Notifier pushNotifier = new PushNotifier(smsNotifier);
        pushNotifier.send("Hello User!");
    }
}

