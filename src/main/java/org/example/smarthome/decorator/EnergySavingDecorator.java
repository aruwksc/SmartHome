package org.example.smarthome.decorator;

import org.example.smarthome.device.Device;

public class EnergySavingDecorator extends DeviceDecorator{
    public EnergySavingDecorator(Device wrappedDevice) {
        super(wrappedDevice);
    }
    @Override
    public void operate() {
        System.out.println("Activating energy saving mode");
        super.operate();
    }
}
