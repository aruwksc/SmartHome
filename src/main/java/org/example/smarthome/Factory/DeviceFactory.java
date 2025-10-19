package org.example.smarthome.Factory;

import org.example.smarthome.device.*;

public class DeviceFactory {
    public enum DeviceType {
        LIGHT,
        MUSIC_SYSTEM,
        THERMOSTAT,
        SECURITY_CAMERA
    }
    public static Device createDevice(DeviceType deviceType) {
        if(deviceType == null) {
            throw new IllegalArgumentException("deviceType is null");
        }

        return switch (deviceType) {
            case LIGHT -> new Light();
            case MUSIC_SYSTEM -> new MusicSystem();
            case THERMOSTAT -> new Thermostat();
            case SECURITY_CAMERA -> new SecurityCamera();
            default -> throw new IllegalArgumentException("Unknown device type");
        };
    }
}
