package com.jpmc.lab07;

//A class should be dependent on abstractions
//Not on implementations
public class Door {
    //private SoundAlarm alarm;
    //private VisualAlarm alarm;
    private Alarm alarm;

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public void open() {
        alarm.activate();
    }

    public void close() {
        alarm.deactivate();
    }
}
