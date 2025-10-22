package org.example.smarthome.Builder;

import org.example.smarthome.Facade.HomeAutomationFacade;
import org.example.smarthome.decorator.EnergySavingDecorator;
import org.example.smarthome.decorator.RemoteAccessDecorator;
import org.example.smarthome.decorator.VoiceControlDecorator;
import org.example.smarthome.device.*;

public class HomeAutomationBuilder {
    private Device light;
    private Device musicSystem;
    private Device thermostat;
    private Device securityCamera;

    private static final String DEFAULT_NAME = "Device";
    private static final String DEFAULT_DESCRIPTION = "Smart Home Device";
    private static final String DEFAULT_ROOM = "Living Room";

    public HomeAutomationBuilder() {
        this.light = new Light(DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_ROOM);
        this.musicSystem = new MusicSystem(DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_ROOM);
        this.thermostat = new Thermostat(DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_ROOM);
        this.securityCamera = new SecurityCamera(DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_ROOM);
    }
    public HomeAutomationBuilder setLight(Device light) {
        this.light = light;
        return this;
    }
    public HomeAutomationBuilder setMusicSystem(Device musicSystem) {
        this.musicSystem = musicSystem;
        return this;
    }
    public HomeAutomationBuilder setThermostat(Device thermostat) {
        this.thermostat = thermostat;
        return this;
    }
    public HomeAutomationBuilder setSecurityCamera(Device securityCamera) {
        this.securityCamera = securityCamera;
        return this;
    }
    public HomeAutomationBuilder addVoiceControlToLight() {
        this.light = new VoiceControlDecorator(this.light);
        return this;
    }
    public HomeAutomationBuilder addRemoteAccessToMusicSystem() {
        this.musicSystem = new RemoteAccessDecorator(this.musicSystem);
        return this;
    }

    public HomeAutomationBuilder addEnergySavingToThermostat() {
        this.thermostat = new EnergySavingDecorator(this.thermostat);
        return this;
    }
    public HomeAutomationBuilder addRemoteAccessToSecurityCamera() {
        this.securityCamera = new RemoteAccessDecorator(this.securityCamera);
        return this;
    }
    public HomeAutomationBuilder startPartyMode() {
        this.light.operate();
        this.musicSystem.operate();
        System.out.println("Party Mode Started");
        return this;
    }
    public HomeAutomationBuilder activateNightMode() {
        this.light.operate();
        this.thermostat.operate();
        this.securityCamera.operate();
        System.out.println("Night Mode Started");
        return this;
    }
    public HomeAutomationFacade build() {
        return new HomeAutomationFacade(light, musicSystem, thermostat, securityCamera, null, null);
    }
}
