package org.example.smarthome.Bridge;

import org.example.smarthome.device.SecurityCamera;

public class SecurityCameraControlBridge implements DeviceControlBridge {

    private SecurityCamera camera;

    public SecurityCameraControlBridge(SecurityCamera camera) {
        this.camera = camera;
    }

    @Override
    public void turnOn() {
        System.out.println("Security camera is now ON.");
        camera.operate();
    }

    @Override
    public void turnOff() {
        System.out.println("Security camera is now OFF.");
        camera.operate();
    }

    @Override
    public void setTemperature(int temperature) {

    }

    @Override
    public void playMusic() {

    }
}
