package org.example.smarthome.Factory;

import org.example.smarthome.device.*;

public class LuxuryHomeAutomationFactory implements HomeAutomationFactory {

    private String name;
    private String description;
    private String room;

    public LuxuryHomeAutomationFactory(String name, String description, String room) {
        this.name = name;
        this.description = description;
        this.room = room;
    }

    @Override
    public Device createLight() {
        return new Light(name, description, room);
    }

    @Override
    public Device createThermostat() {
        return new Thermostat(name, description, room);
    }

    @Override
    public Device createSecurityCamera() {
        return new SecurityCamera(name, description, room);
    }

    @Override
    public Device createMusicSystem() {
        return new MusicSystem(name, description, room);
    }
}
