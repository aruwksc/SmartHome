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

        switch (deviceType) {
            case LIGHT:
                return new Light();
            case MUSIC_SYSTEM:
                return new MusicSystem();
             case THERMOSTAT:
                 return new Thermostat();
             case SECURITY_CAMERA:
                  return new SecurityCamera();
              default:
                   throw new IllegalArgumentException("Unknown device type");
        }
    }
}
