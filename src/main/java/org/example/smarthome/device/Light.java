package org.example.smarthome.device;

import org.example.smarthome.Bridge.DeviceControlBridge;

public class Light implements Device {
    private String name;
    private String description;
    private String room;
    private boolean isOn;
    public Light(String name, String description, String room) {
        this.isOn = false;
        this.name = name;
        this.description = description;
        this.room = room;
    }
    @Override
    public void operate() {
        if (isOn) {
            System.out.println(name + " in " + room + " is now OFF.");
            isOn = false;
        }
        else {
            System.out.println(name + " in " + room + " is now ON.");
            isOn = true;
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

    private DeviceControlBridge controller;
    public void setController(DeviceControlBridge controller) {
        this.controller = controller;
    }
    public void controlDevice() {
        if(controller != null) {
            controller.turnOn();
        }
    }
}
