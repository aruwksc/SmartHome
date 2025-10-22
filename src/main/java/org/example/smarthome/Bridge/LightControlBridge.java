package org.example.smarthome.Bridge;

import org.example.smarthome.device.Light;

public class LightControlBridge implements DeviceControlBridge {

    private Light light;

    public LightControlBridge(Light light) {
        this.light = light;
    }

    @Override
    public void turnOn() {
        System.out.println("Light is now ON.");
        light.operate();
    }

    @Override
    public void turnOff() {
        System.out.println("Light is now OFF.");
        light.operate();
    }
    @Override
    public void playMusic() {
        throw new UnsupportedOperationException("play Music is not supported for Light");
    }
    @Override
    public void setTemperature(int temperature) {
        throw new UnsupportedOperationException("set temperature is not supported for Light");
    }

}
