package org.example.smarthome;

import org.example.smarthome.decorator.EnergySavingDecorator;
import org.example.smarthome.decorator.RemoteAccessDecorator;
import org.example.smarthome.decorator.VoiceControlDecorator;
import org.example.smarthome.device.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeviceTest {

    @Test
    public void testLightWithVoiceControlAndEnergySaving() {
        Device light = new Light();
        light = new VoiceControlDecorator(light);
        light = new EnergySavingDecorator(light);
        light.operate();
    }
    @Test
    public void testMusicSystemWithRemoteControl() {
        Device musicSystem = new MusicSystem();
        musicSystem = new RemoteAccessDecorator(musicSystem);
        musicSystem.operate();
    }
    @Test
    void testThermostatWithEnergySaving() {
        Device thermostat = new Thermostat();
        thermostat = new EnergySavingDecorator(thermostat);
        thermostat.operate();
    }
    @Test
    void testSecurityCameraWithRemoteControl() {
        Device securityCamera = new SecurityCamera();
        securityCamera = new RemoteAccessDecorator(securityCamera);
        securityCamera.operate();
    }
}
