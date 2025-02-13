package com.designpatterns.design_patterns.decorator;

public abstract class NotifierDecorator implements Notifier {
    Notifier notifier;
    public NotifierDecorator(Notifier notifier){
        this.notifier = notifier;
    }
    @Override
    public void send(String message) {
        notifier.send(message);
    }
}
