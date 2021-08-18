package com.jpmc.lab07;

public class DoorUser {
    public static void main(String[] args) {
        Door door = new Door();
        Alarm alarm = new SoundAlarm();

        door.setAlarm(alarm);
        door.open();
        door.close();
        alarm = new VisualAlarm();
        door.setAlarm(alarm);
        door.open();
        door.close();
        alarm = new MessageAlarm();
        door.setAlarm(alarm);
        door.open();
        door.close();
    }
}
