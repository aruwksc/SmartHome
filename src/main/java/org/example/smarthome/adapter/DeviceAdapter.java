package org.example.smarthome.adapter;

import org.example.smarthome.device.Device;

public interface DeviceAdapter extends Device {
    void connect();
    void disconnect();
}
