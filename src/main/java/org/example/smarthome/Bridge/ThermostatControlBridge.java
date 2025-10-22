package org.example.smarthome.Bridge;

import org.example.smarthome.device.Thermostat;

public class ThermostatControlBridge implements DeviceControlBridge {

    private Thermostat thermostat;

    public ThermostatControlBridge(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void turnOn() {
        System.out.println("Thermostat is now ON.");
        thermostat.operate();
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat is now OFF.");
        thermostat.operate();
    }

    @Override
    public void setTemperature(int temperature) {
        thermostat.setTemperature(temperature);
    }

    @Override
    public void playMusic() {
        throw new UnsupportedOperationException("playMusic is not supported for Thermostat");
    }
}
