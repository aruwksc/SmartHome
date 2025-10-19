package org.example.smarthome.Bridge;


import org.example.smarthome.device.Device;
import org.example.smarthome.device.MusicSystem;
import org.example.smarthome.device.Thermostat;

public class VoiceControl implements DeviceControlBridge {
    private Device device;
    public VoiceControl(Device device) {
        this.device = device;
    }
    @Override
    public void turnOn() {
        System.out.println("Voice control: Turning on the device");
        device.operate();
    }
    @Override
    public void turnOff() {
        System.out.println("Voice control: Turning off the device");
        device.operate();
    }
    @Override
    public void setTemperature(int temperature) {
        if(device instanceof Thermostat) {
            System.out.println("Voice control: Setting temperature to " + temperature);
            ((Thermostat) device).setTemperature(temperature);
        } else{
            System.out.println("Voice control: Temperature control not available for this device");
        }
    }
    @Override
    public void playMusic() {
        if(device instanceof MusicSystem) {
            System.out.println("Voice control: Playing music");
            ((MusicSystem) device).operate();
        } else {
            System.out.println("Voice control: MusicSystem not available for this device");
        }
    }
}
