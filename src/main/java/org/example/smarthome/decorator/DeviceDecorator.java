package org.example.smarthome.decorator;

import org.example.smarthome.device.Device;

public abstract class DeviceDecorator implements Device {
    private String name;
    private String description;
    private String room;
    protected Device wrappedDevice;

    public DeviceDecorator(Device wrappedDevice) {
        this.name = wrappedDevice.getName();
        this.description = wrappedDevice.getDescription();
        this.room = wrappedDevice.getRoom();
        this.wrappedDevice = wrappedDevice;
    }
    @Override
    public void operate() {
        wrappedDevice.operate();
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getDescription() {
        return description;
    }
    @Override
    public String getRoom() {
        return room;
    }
}
