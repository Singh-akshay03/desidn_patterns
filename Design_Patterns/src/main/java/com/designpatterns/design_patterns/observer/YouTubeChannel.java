package com.designpatterns.design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject{
    String name;
    List<Observer> subscribers=new ArrayList<>();
    public YouTubeChannel(String name){
        this.name=name;
    }

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
        System.out.println(observer.getName()+" has subscribed the channel");
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
        System.out.println(observer.getName()+" has unsubscribed from the channel");
    }

    @Override
    public void notifySubscribers(String videoName) {
        for(Observer observer:subscribers){
            observer.update(videoName,this.name);
        }
    }
    public void uploadVideo(String videoName){
        notifySubscribers(videoName);
    }
}
