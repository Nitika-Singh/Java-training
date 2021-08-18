package com.jpmc.lab07;

public class VisualAlarm implements Alarm {
    public void activate() {
        System.out.println("VisualAlarm activated");
    }

    public void deactivate() {
        System.out.println("VisualAlarm deactivated");
    }
}
