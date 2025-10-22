package org.example.smarthome;

import org.example.smarthome.Builder.HomeAutomationBuilder;
import org.example.smarthome.Facade.HomeAutomationFacade;
import org.example.smarthome.device.Light;
import org.example.smarthome.device.MusicSystem;
import org.example.smarthome.device.SecurityCamera;
import org.example.smarthome.device.Thermostat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomeAutomationBuilderTest {

    private static final String DEFAULT_NAME = "Device";
    private static final String DEFAULT_DESCRIPTION = "Smart Home Device";
    private static final String DEFAULT_ROOM = "Living Room";

    @Test
    void testLightWithVoiceControl() {
        HomeAutomationFacade homeAutomationSystem = new HomeAutomationBuilder()
                .setLight(new Light(DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_ROOM))
                .addVoiceControlToLight()
                .build();

        assertNotNull(homeAutomationSystem);
        assertTrue(homeAutomationSystem instanceof HomeAutomationFacade);
    }

    @Test
    void testMusicSystemWithRemoteAccess() {
        HomeAutomationFacade homeAutomationSystem = new HomeAutomationBuilder()
                .setMusicSystem(new MusicSystem(DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_ROOM))
                .addRemoteAccessToMusicSystem()
                .build();

        assertNotNull(homeAutomationSystem);
        assertTrue(homeAutomationSystem instanceof HomeAutomationFacade);
    }

    @Test
    void testThermostatWithEnergySaving() {
        HomeAutomationFacade homeAutomationSystem = new HomeAutomationBuilder()
                .setThermostat(new Thermostat(DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_ROOM))
                .addEnergySavingToThermostat()
                .build();

        assertNotNull(homeAutomationSystem);
        assertTrue(homeAutomationSystem instanceof HomeAutomationFacade);
    }

    @Test
    void testMultipleDevicesWithDecorators() {
        HomeAutomationFacade homeAutomationSystem = new HomeAutomationBuilder()
                .setLight(new Light(DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_ROOM))
                .setMusicSystem(new MusicSystem(DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_ROOM))
                .setThermostat(new Thermostat(DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_ROOM))
                .setSecurityCamera(new SecurityCamera(DEFAULT_NAME, DEFAULT_DESCRIPTION, DEFAULT_ROOM))
                .addVoiceControlToLight()
                .addRemoteAccessToMusicSystem()
                .addEnergySavingToThermostat()
                .addRemoteAccessToSecurityCamera()
                .startPartyMode()
                .build();

        assertNotNull(homeAutomationSystem);
        assertTrue(homeAutomationSystem instanceof HomeAutomationFacade);
    }
}
