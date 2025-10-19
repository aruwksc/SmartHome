package org.example.smarthome.Facade;

import org.example.smarthome.device.Device;

public class HomeAutomationFacade {
    private Device light;
    private Device securityCamera;
    private Device musicSystem;
    private Device thermostat;

    public HomeAutomationFacade(Device light, Device securityCamera, Device musicSystem, Device thermostat) {
        this.light = light;
        this.securityCamera = securityCamera;
        this.musicSystem = musicSystem;
        this.thermostat = thermostat;
    }
    public void activateNightMode() {
        System.out.println("Activating night mode");
        light.operate();
        thermostat.operate();
        securityCamera.operate();
    }

    public void startPartyMode() {
        System.out.println("Starting party mode");
        light.operate();
        musicSystem.operate();
    }

    public void leaveHome() {
        System.out.println("Leaving home");
        thermostat.operate();
        securityCamera.operate();
        musicSystem.operate();
        light.operate();
    }

}
