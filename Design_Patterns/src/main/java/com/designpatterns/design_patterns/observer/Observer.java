package com.designpatterns.design_patterns.observer;

public interface Observer {
    void update(String videoName, String channelName);
    String getName();
}
