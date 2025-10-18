package org.example.smarthome.device;

public class Thermostat implements Device {
    private int temperature;

    public Thermostat() {
        this.temperature = 22;
    }
    @Override
    public void operate() {
        System.out.println("Setting temperature to " + temperature);
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
