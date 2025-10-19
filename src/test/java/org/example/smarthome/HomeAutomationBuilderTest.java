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
    @Test
    void testLightWithVoiceControl() {
        HomeAutomationFacade homeAutomationSystem = new HomeAutomationBuilder()
                .setLight(new Light())
                .addVoiceControlToLight()
                .build();

        assertNotNull(homeAutomationSystem);
        assertTrue(homeAutomationSystem instanceof HomeAutomationFacade);
    }
    @Test
    void testMusicSystemWithRemoteAccess() {
        HomeAutomationFacade homeAutomationSystem = new HomeAutomationBuilder()
                .setMusicSystem(new MusicSystem())
                .addRemoteAccessToMusicSystem()
                .build();
        assertNotNull(homeAutomationSystem);
        assertTrue(homeAutomationSystem instanceof HomeAutomationFacade);
    }
    @Test
    void testThermostatWithEnergySaving() {
        HomeAutomationFacade homeAutomationSystem = new HomeAutomationBuilder()
                .setThermostat(new Thermostat())
                .addEnergySavingTothermostat()
                .build();
        assertNotNull(homeAutomationSystem);
        assertTrue(homeAutomationSystem instanceof HomeAutomationFacade);
    }
    @Test
    void testMultipleDevicesWithDecorators() {
        HomeAutomationFacade homeAutomationSystem = new HomeAutomationBuilder()
                .setLight(new Light())
                .setMusicSystem(new MusicSystem())
                .setThermostat(new Thermostat())
                .setSecurityCamera(new SecurityCamera())
                .addVoiceControlToLight()
                .addRemoteAccessToMusicSystem()
                .addEnergySavingTothermostat()
                .addRemoteAccessToSecurityCamera()
                .startPartyMode()
                .build();
        assertNotNull(homeAutomationSystem);
        assertTrue(homeAutomationSystem instanceof HomeAutomationFacade);
    }
}
