package com.designpatterns.design_patterns.decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Hello User!");
        System.out.println("\nAdding SMS Notification:");
        Notifier smsNotifier = new SMSNotifier(emailNotifier);
        smsNotifier.send("Hello User!");
        System.out.println("\nAdding Push Notification:");
        Notifier pushNotifier = new PushNotifier(smsNotifier);
        pushNotifier.send("Hello User!");
    }
}

