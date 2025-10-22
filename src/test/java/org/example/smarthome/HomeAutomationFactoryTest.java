package org.example.smarthome;

import org.example.smarthome.Factory.DeviceFactory;
import org.example.smarthome.Factory.HomeAutomationFactory;
import org.example.smarthome.Factory.LuxuryHomeAutomationFactory;
import org.example.smarthome.Factory.StandardHomeAutomationFactory;
import org.example.smarthome.device.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomeAutomationFactoryTest {

    private static final String DEFAULT_NAME = "Device";
    private static final String DEFAULT_DESCRIPTION = "Smart Home Device";
    private static final String DEFAULT_ROOM = "Living Room";

    @Test
    void testStandardHomeAutomationFactory() {
        HomeAutomationFactory factory = new StandardHomeAutomationFactory(DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_ROOM);
        Device light = factory.createLight();
        Device musicSystem = factory.createMusicSystem();
        Device thermostat = factory.createThermostat();
        Device securityCamera = factory.createSecurityCamera();

        assertNotNull(light, "Light should not be null");
        assertTrue(light instanceof Light, "Created device should be an instance of Light");
        assertNotNull(musicSystem, "Music System should not be null");
        assertTrue(musicSystem instanceof MusicSystem, "Created device should be an instance of Music System");
        assertNotNull(thermostat, "Thermostat should not be null");
        assertTrue(thermostat instanceof Thermostat, "Created device should be an instance of Thermostat");
        assertNotNull(securityCamera, "Security Camera should not be null");
        assertTrue(securityCamera instanceof SecurityCamera, "Created device should be an instance of Security Camera");
    }

    @Test
    void testLuxuryHomeAutomationFactoryWithDevice() {
        HomeAutomationFactory factory = new LuxuryHomeAutomationFactory(DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_ROOM);
        Device light = factory.createLight();
        Device musicSystem = factory.createMusicSystem();
        Device thermostat = factory.createThermostat();
        Device securityCamera = factory.createSecurityCamera();

        assertNotNull(light, "Light should not be null");
        assertTrue(light instanceof Light, "Created device should be an instance of Light");
        assertNotNull(musicSystem, "Music System should not be null");
        assertTrue(musicSystem instanceof MusicSystem, "Created device should be an instance of Music System");
        assertNotNull(thermostat, "Thermostat should not be null");
        assertTrue(thermostat instanceof Thermostat, "Created device should be an instance of Thermostat");
        assertNotNull(securityCamera, "Security Camera should not be null");
        assertTrue(securityCamera instanceof SecurityCamera, "Created device should be an instance of Security Camera");
    }

    @Test
    void testFactoryProducesCorrectDevices() {
        HomeAutomationFactory luxuryFactory = new LuxuryHomeAutomationFactory(DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_ROOM);
        HomeAutomationFactory standardFactory = new StandardHomeAutomationFactory(DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_ROOM);

        Device luxuryLight = luxuryFactory.createLight();
        Device luxuryMusicSystem = luxuryFactory.createMusicSystem();
        Device luxuryThermostat = luxuryFactory.createThermostat();
        Device luxurySecurityCamera = luxuryFactory.createSecurityCamera();

        Device standardLight = standardFactory.createLight();
        Device standardMusicSystem = standardFactory.createMusicSystem();
        Device standardThermostat = standardFactory.createThermostat();
        Device standardSecurityCamera = standardFactory.createSecurityCamera();

        assertTrue(luxuryLight instanceof Light);
        assertTrue(luxuryMusicSystem instanceof MusicSystem);
        assertTrue(luxuryThermostat instanceof Thermostat);
        assertTrue(luxurySecurityCamera instanceof SecurityCamera);

        assertTrue(standardLight instanceof Light);
        assertTrue(standardMusicSystem instanceof MusicSystem);
        assertTrue(standardThermostat instanceof Thermostat);
        assertTrue(standardSecurityCamera instanceof SecurityCamera);
    }
}
