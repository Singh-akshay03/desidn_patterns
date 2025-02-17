package com.designpatterns.design_patterns.observer;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name){
        this.name = name;
    }
    @Override
    public void update( String videoName ,String channelName) {
        System.out.println("Hey "+name+"! New video uploaded on "+channelName+" with title "+videoName);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
