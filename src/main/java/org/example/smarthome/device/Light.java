package org.example.smarthome.device;

import org.example.smarthome.Bridge.DeviceControlBridge;

public class Light implements Device {
    private boolean isOn;
    public Light() {
        this.isOn = false;
    }
    @Override
    public void operate() {
        if (isOn) {
            System.out.println("Turning off...");
            isOn = false;
        }
        else {
            System.out.println("Turning on...");
            isOn = true;
        }
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
