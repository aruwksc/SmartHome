package org.example.smarthome.Factory;

import org.example.smarthome.device.*;

public class DeviceFactory {
    public enum DeviceType {
        LIGHT,
        MUSIC_SYSTEM,
        THERMOSTAT,
        SECURITY_CAMERA
    }
    public static Device createDevice(DeviceType deviceType, String name, String description, String room) {
        if(deviceType == null) {
            throw new IllegalArgumentException("deviceType is null");
        }

        return switch (deviceType) {
            case LIGHT -> new Light(name, description, room);
            case MUSIC_SYSTEM -> new MusicSystem(name, description, room);
            case THERMOSTAT -> new Thermostat(name, description, room);
            case SECURITY_CAMERA -> new SecurityCamera(name, description, room);
            default -> throw new IllegalArgumentException("Unknown device type");
        };
    }
}
