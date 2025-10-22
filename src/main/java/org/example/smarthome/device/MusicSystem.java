package org.example.smarthome.device;

import org.example.smarthome.Bridge.DeviceControlBridge;

public class MusicSystem implements Device {
    private String name;
    private String description;
    private String room;
    private boolean isPlaying;
    private DeviceControlBridge controller;

    public MusicSystem(String name, String description, String room) {
        this.isPlaying = false;
        this.name = name;
        this.description = description;
        this.room = room;
    }
    @Override
    public void operate() {
        if (isPlaying) {
            System.out.println(name + "pausing music");
            isPlaying = false;
        }  else {
            System.out.println(name + "playing music..");
            isPlaying = true;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getRoom() {
        return room;
    }

    public void setController(DeviceControlBridge controller) {
        this.controller = controller;
    }
    public void controlDevice() {
        if(controller != null) {
            controller.playMusic();
        }
    }

}
