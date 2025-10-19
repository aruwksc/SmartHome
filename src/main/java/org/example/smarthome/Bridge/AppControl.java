package org.example.smarthome.Bridge;

import org.example.smarthome.device.Device;
import org.example.smarthome.device.MusicSystem;
import org.example.smarthome.device.Thermostat;

public class AppControl implements DeviceControlBridge{
    private Device device;

    public AppControl(Device device){
        this.device = device;
    }
    @Override
    public void turnOn() {
        System.out.println("App control: turning on the device");
        device.operate();
    }
    @Override
    public void turnOff() {
        System.out.println("App control: turning off the device");
        device.operate();
    }
    @Override
    public void setTemperature(int temperature) {
        if (device instanceof Thermostat) {
            System.out.println("App control: setting temperature to " + temperature);
            ((Thermostat)device).setTemperature(temperature);
        }  else {
            System.out.println("App control: Temperature not available for this device");
        }
    }
    @Override
    public void playMusic() {
        if(device instanceof MusicSystem) {
            System.out.println("App control: playing music");
            ((MusicSystem) device).operate();
        } else {
            System.out.println("App control: music not available for this device");
        }
    }
}
