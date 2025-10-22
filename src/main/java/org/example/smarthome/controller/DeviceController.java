package org.example.smarthome.controller;

import org.example.smarthome.device.Device;
import org.example.smarthome.device.Light;
import org.example.smarthome.device.MusicSystem;
import org.example.smarthome.device.Thermostat;
import org.example.smarthome.device.SecurityCamera;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/device")
public class DeviceController {

    private List<Device> devices = new ArrayList<>();

    @PostMapping("/add")
    public String addDevice(@RequestBody DeviceRequest request) {
        Device newDevice = null;

        switch (request.getType()) {
            case "Light":
                newDevice = new Light(request.getName(), request.getDescription(), request.getRoom());
                break;
            case "Thermostat":
                newDevice = new Thermostat(request.getName(), request.getDescription(), request.getRoom());
                break;
            case "MusicSystem":
                newDevice = new MusicSystem(request.getName(), request.getDescription(), request.getRoom());
                break;
            default:
                return "Unknown device type";
        }

        devices.add(newDevice);
        return "Device added successfully!";
    }

    @GetMapping("/list")
    public List<Device> getDeviceList() {
        return devices;
    }

    public static class DeviceRequest {
        private String name;
        private String type;
        private String room;
        private String description;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getRoom() {
            return room;
        }

        public void setRoom(String room) {
            this.room = room;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}
