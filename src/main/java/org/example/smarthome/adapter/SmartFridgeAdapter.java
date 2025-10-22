package org.example.smarthome.adapter;

import org.example.smarthome.device.Device;
import org.example.smarthome.device.SmartFridge;

public class SmartFridgeAdapter implements DeviceAdapter{
    private SmartFridge smartFridge;

    public SmartFridgeAdapter(SmartFridge smartFridge) {
        this.smartFridge = smartFridge;
    }
    @Override
    public void operate() {
        System.out.println("Operating SmartFridge");
        smartFridge.adjustTemperature();
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public String getRoom() {
        return "";
    }

    @Override
    public void connect() {
        System.out.println("Connecting SmartFridge");
        smartFridge.connectToNetwork();
    }
    @Override
    public void disconnect() {
        System.out.println("Disconnecting SmartFridge");
        smartFridge.disconnectFromNetwork();
    }
}
