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
    
    public HomeAutomationBuilder() {
        this.light = new Light();
        this.musicSystem = new MusicSystem();
        this.thermostat = new Thermostat();
        this.securityCamera = new SecurityCamera();
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
    public HomeAutomationBuilder addEnergySavingTothermostat() {
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
