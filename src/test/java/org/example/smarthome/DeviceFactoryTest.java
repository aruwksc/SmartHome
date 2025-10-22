package org.example.smarthome;

import org.example.smarthome.Factory.DeviceFactory;
import org.example.smarthome.device.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeviceFactoryTest {

    private static final String DEFAULT_NAME = "Device";
    private static final String DEFAULT_DESCRIPTION = "Smart Home Device";
    private static final String DEFAULT_ROOM = "Living Room";

    @Test
    public void testCreateLight() {
        Device light = DeviceFactory.createDevice(DeviceFactory.DeviceType.LIGHT, DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_ROOM);
        assertNotNull(light, "Light should not be null");
        assertTrue(light instanceof Light, "Created device should be an instance of Light");
    }

    @Test
    public void testCreateMusicSystem() {
        Device musicSystem = DeviceFactory.createDevice(DeviceFactory.DeviceType.MUSIC_SYSTEM, DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_ROOM);
        assertNotNull(musicSystem, "Music System should not be null");
        assertTrue(musicSystem instanceof MusicSystem, "Created device should be an instance of MusicSystem");
    }

    @Test
    public void testCreateThermostat() {
        Device thermostat = DeviceFactory.createDevice(DeviceFactory.DeviceType.THERMOSTAT, DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_ROOM);
        assertNotNull(thermostat, "Thermostat should not be null");
        assertTrue(thermostat instanceof Thermostat, "Created device should be an instance of Thermostat");
    }

    @Test
    public void testCreateSecurityCamera() {
        Device securityCamera = DeviceFactory.createDevice(DeviceFactory.DeviceType.SECURITY_CAMERA, DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_ROOM);
        assertNotNull(securityCamera, "Security Camera should not be null");
        assertTrue(securityCamera instanceof SecurityCamera, "Created device should be an instance of SecurityCamera");
    }

    @Test
    public void testCreateDeviceType() {
        assertThrows(IllegalArgumentException.class, () -> DeviceFactory.createDevice(null, DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_ROOM));
    }
}
