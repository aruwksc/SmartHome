package org.example.smarthome.Factory;

import org.example.smarthome.device.Device;

public interface HomeAutomationFactory {
    Device createLight();
    Device createMusicSystem();
    Device createThermostat();
    Device createSecurityCamera();
}
