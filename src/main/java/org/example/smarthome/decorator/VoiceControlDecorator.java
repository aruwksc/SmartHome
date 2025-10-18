package org.example.smarthome.decorator;

import org.example.smarthome.device.Device;

public class VoiceControlDecorator extends DeviceDecorator{
    public VoiceControlDecorator(Device wrappedDevice){
        super(wrappedDevice);
    }
    @Override
    public void operate() {
        System.out.println("Activating voice control");
        super.operate();
    }

}
