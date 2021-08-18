package com.jpmc.lab07;

public class MessageAlarm implements Alarm {
    public void activate() {
        System.out.println("MessageAlarm activated");
    }

    public void deactivate() {
        System.out.println("MessageAlarm deactivated");
    }
}
