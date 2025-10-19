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
        System.out.println("Turning off the light");
        light.operate();
        System.out.println("Setting thermostat to eco mode");
        thermostat.operate();
        System.out.println("Enabling security camera");
        securityCamera.operate();
    }

    public void startPartyMode() {
        System.out.println("Starting party mode");
        System.out.println("Turning on the light with dim effect");
        light.operate();
        System.out.println("Playing music");
        musicSystem.operate();
    }

    public void leaveHome() {
        System.out.println("Leaving home");
        System.out.println("Turning off the thermostat");
        thermostat.operate();
        System.out.println("Turning off the security camera");
        securityCamera.operate();
        System.out.println("Turning off the music system");
        musicSystem.operate();
        System.out.println("Turning off the light");
        light.operate();
    }

}
