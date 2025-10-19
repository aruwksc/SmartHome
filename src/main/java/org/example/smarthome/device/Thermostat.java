package org.example.smarthome.device;

import org.example.smarthome.Bridge.DeviceControlBridge;

public class Thermostat implements Device {
    private int temperature;
    private DeviceControlBridge controller;

    public Thermostat() {
        this.temperature = 22;
    }
    @Override
    public void operate() {
        System.out.println("Setting temperature to " + temperature);
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
