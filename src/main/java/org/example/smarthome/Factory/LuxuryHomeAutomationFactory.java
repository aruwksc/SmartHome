package org.example.smarthome.Factory;

import org.example.smarthome.device.*;

public class LuxuryHomeAutomationFactory implements HomeAutomationFactory {
    @Override
    public Device createLight() {
        return new Light();
    }
    @Override
    public Device createThermostat() {
        return new Thermostat();
    }
    @Override
    public Device createSecurityCamera() {
        return new SecurityCamera();
    }
    @Override
    public Device createMusicSystem() {
        return new MusicSystem();
    }
}
