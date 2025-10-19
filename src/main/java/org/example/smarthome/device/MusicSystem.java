package org.example.smarthome.device;

import org.example.smarthome.Bridge.DeviceControlBridge;

public class MusicSystem implements Device {
    private boolean isPlaying;
    private DeviceControlBridge controller;

    public MusicSystem() {
        this.isPlaying = false;
    }
    @Override
    public void operate() {
        if (isPlaying) {
            System.out.println("Pausing music..");
            isPlaying = false;
        }  else {
            System.out.println("Playing music..");
            isPlaying = true;
        }
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
