package org.example.smarthome.device;

import org.example.smarthome.Bridge.DeviceControlBridge;

public class SecurityCamera implements Device {
    private boolean isRecording;
    private DeviceControlBridge controller;

    public SecurityCamera(){
        this.isRecording = false;
    }
    @Override
    public void operate() {
        if(isRecording){
            System.out.println("Stop recording");
            isRecording = false;
        } else {
            System.out.println("Start recording");
            isRecording = true;
        }
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
