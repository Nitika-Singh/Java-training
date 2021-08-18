package com.jpmc.lab07;

public class SoundAlarm implements Alarm {
    public void activate() {
        System.out.println("SoundAlarm activated");
    }
    public void deactivate() {
        System.out.println("SoundAlarm deactivated");
    }
}
