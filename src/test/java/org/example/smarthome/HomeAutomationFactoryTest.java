package org.example.smarthome;

import org.example.smarthome.Factory.HomeAutomationFactory;
import org.example.smarthome.Factory.LuxuryHomeAutomationFactory;
import org.example.smarthome.Factory.StandardHomeAutomationFactory;
import org.example.smarthome.device.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomeAutomationFactoryTest {
    @Test
     void testStandardHomeAutomationFactory() {
        HomeAutomationFactory factory = new StandardHomeAutomationFactory();
        Device light = factory.createLight();
        Device musicSystem = factory.createMusicSystem();
        Device thermostat = factory.createThermostat();
        Device securityCamera = factory.createSecurityCamera();

        assertNotNull(light, "Lightshould not be null");
        assertTrue(light instanceof Light, "created device should be an instance of Light");
        assertNotNull(musicSystem, "MusicSystem should not be null");
        assertTrue(musicSystem instanceof MusicSystem, "created device should be an instance of MusicSystem");
        assertNotNull(thermostat, "Thermostat should not be null");
        assertTrue(thermostat instanceof Thermostat, "created device should be an instance of Thermostat");
        assertNotNull(securityCamera, "SecurityCamera should not be null");
        assertTrue(securityCamera instanceof SecurityCamera, "created device should be an instance of SecurityCamera");
    }
    @Test
    void testLuxuryHomeAutomationFactoryWithDevice() {
        HomeAutomationFactory factory = new LuxuryHomeAutomationFactory();
        Device light = factory.createLight();
        Device musicSystem = factory.createMusicSystem();
        Device thermostat = factory.createThermostat();
        Device securityCamera = factory.createSecurityCamera();

        assertNotNull(light, "Lightshould not be null");
        assertTrue(light instanceof Light, "created device should be an instance of Light");
        assertNotNull(musicSystem, "MusicSystem should not be null");
        assertTrue(musicSystem instanceof MusicSystem, "created device should be an instance of MusicSystem");
        assertNotNull(thermostat, "Thermostat should not be null");
        assertTrue(thermostat instanceof Thermostat, "created device should be an instance of Thermostat");
        assertNotNull(securityCamera, "SecurityCamera should not be null");
        assertTrue(securityCamera instanceof SecurityCamera, "created device should be an instance of SecurityCamera");
    }
    @Test
    void testFactoryProducesCorrectDevices() {
        HomeAutomationFactory luxuryFactory = new LuxuryHomeAutomationFactory();
        HomeAutomationFactory standardFactory = new StandardHomeAutomationFactory();


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
