package org.example.smarthome.decorator;

import org.example.smarthome.device.Device;

public class RemoteAccessDecorator extends DeviceDecorator {
    public RemoteAccessDecorator(Device wrappedDevice)
    {
        super(wrappedDevice);
    }
    @Override
    public void operate() {
       connectToRemote();
       super.operate();
    }
    public void connectToRemote()
    {
        System.out.println("Connecting to remote device");
    }
    public  void disconnectFromRemote()
    {
        System.out.println("Disconnecting from remote device");
    }

}
