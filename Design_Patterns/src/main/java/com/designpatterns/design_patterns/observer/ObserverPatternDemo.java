package com.designpatterns.design_patterns.observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        YouTubeChannel techChannel = new YouTubeChannel("British Airlines");

        Observer sub1 = new Subscriber("Alice");
        Observer sub2 = new Subscriber("Bob");

        techChannel.subscribe(sub1);
        techChannel.subscribe(sub2);

        techChannel.uploadVideo("Observer Pattern Explained");

        techChannel.unsubscribe(sub1);

        techChannel.uploadVideo("Design Patterns in Java");
    }
}

