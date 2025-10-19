package org.example.smarthome.Bridge;

public interface DeviceControlBridge {
    void turnOn();
    void turnOff();
    void setTemperature(int temperature);
    void playMusic();
}
