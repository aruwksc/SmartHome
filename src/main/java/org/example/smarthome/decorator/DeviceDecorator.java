package org.example.smarthome.decorator;

import org.example.smarthome.device.Device;

public abstract class DeviceDecorator implements Device {
    protected Device wrappedDevice;

    public DeviceDecorator(Device wrappedDevice) {
        this.wrappedDevice = wrappedDevice;
    }
    @Override
    public void operate() {
        wrappedDevice.operate();
    }
}
