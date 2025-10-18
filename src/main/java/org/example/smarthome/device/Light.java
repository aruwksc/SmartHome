package org.example.smarthome.device;

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
}
