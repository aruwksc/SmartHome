package org.example.smarthome.device;

import org.example.smarthome.Bridge.DeviceControlBridge;

public class Thermostat implements Device {
    private String name;
    private String room;
    private String description;
    private DeviceControlBridge deviceControlBridge;
    private int temperature;
    private DeviceControlBridge controller;

    public Thermostat(String name, String description, String room) {
        this.temperature = 22;
        this.name = name;
        this.room = room;
        this.description = description;
    }
    @Override
    public void operate() {
        System.out.println("Setting temperature to " + temperature);
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
            controller.setTemperature(temperature);
        }
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Setting temperature to " + temperature);
    }
}
