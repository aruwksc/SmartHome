package org.example.smarthome.device;

import org.example.smarthome.Bridge.DeviceControlBridge;

public class SecurityCamera implements Device {
    private String name;
    private String description;
    private String room;
    private boolean isRecording;
    private DeviceControlBridge controller;

    public SecurityCamera(String name, String description,  String room) {
        this.isRecording = false;
        this.name = name;
        this.description = description;
        this.room = room;
    }
    @Override
    public void operate() {
        if(isRecording){
            System.out.println(name +  "stop recording in" + room);
            isRecording = false;
        } else {
            System.out.println(name + "start recording in" + room);
            isRecording = true;
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
            controller.turnOn();
        }
    }

}
