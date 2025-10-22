package org.example.smarthome;

import org.example.smarthome.decorator.EnergySavingDecorator;
import org.example.smarthome.decorator.RemoteAccessDecorator;
import org.example.smarthome.decorator.VoiceControlDecorator;
import org.example.smarthome.device.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeviceTest {

    private static final String DEFAULT_NAME = "Device";
    private static final String DEFAULT_DESCRIPTION = "Smart Home Device";
    private static final String DEFAULT_ROOM = "Living Room";

    @Test
    public void testLightWithVoiceControlAndEnergySaving() {
        Device light = new Light(DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_ROOM);
        light = new VoiceControlDecorator(light);
        light = new EnergySavingDecorator(light);
        light.operate();
    }

    @Test
    public void testMusicSystemWithRemoteControl() {
        Device musicSystem = new MusicSystem(DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_ROOM);
        musicSystem = new RemoteAccessDecorator(musicSystem);
        musicSystem.operate();
    }

    @Test
    void testThermostatWithEnergySaving() {
        Device thermostat = new Thermostat(DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_ROOM);
        thermostat = new EnergySavingDecorator(thermostat);
        thermostat.operate();
    }

    @Test
    void testSecurityCameraWithRemoteControl() {
        Device securityCamera = new SecurityCamera(DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_ROOM);
        securityCamera = new RemoteAccessDecorator(securityCamera);
        securityCamera.operate();
    }
}
