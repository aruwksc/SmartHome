package org.example.smarthome.adapter;

import org.example.smarthome.device.SmartOven;

public class SmartOvenAdapter implements DeviceAdapter {
    private String name;
    private String description;
    private String room;
    private SmartOven smartOven;

    public SmartOvenAdapter(String name, String description, String room, SmartOven smartOven) {
        this.smartOven = smartOven;
        this.name = name;
        this.description = description;
        this.room = room;
    }
    @Override
    public void operate() {
        System.out.println("Smart oven operating");
        smartOven.preheat();
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
