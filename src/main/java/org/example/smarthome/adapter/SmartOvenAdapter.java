package org.example.smarthome.adapter;

import org.example.smarthome.device.SmartOven;

public class SmartOvenAdapter implements DeviceAdapter {
    private SmartOven smartOven;

    public SmartOvenAdapter(SmartOven smartOven) {
        this.smartOven = smartOven;
    }
    @Override
    public void operate() {
        System.out.println("Smart oven operating");
        smartOven.preheat();
    }
    @Override
    public void connect() {
        System.out.println("Smart oven connecting to network");
        smartOven.connectToNetwork();
    }
    @Override
    public void disconnect() {
        System.out.println("Smart oven disconnecting from network");
        smartOven.disconnectFromNetwork();
    }
}
