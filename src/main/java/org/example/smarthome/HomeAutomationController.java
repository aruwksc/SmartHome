package org.example.smarthome;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/control")
public class HomeAutomationController {

    @PostMapping("/light/on")
    public String turnLightOn() {
        // Логика для включения света
        return "Light turned on";
    }

    @PostMapping("/light/off")
    public String turnLightOff() {
        // Логика для выключения света
        return "Light turned off";
    }

    @PostMapping("/music/play")
    public String playMusic() {
        // Логика для включения музыки
        return "Music started";
    }

    @PostMapping("/music/stop")
    public String stopMusic() {
        // Логика для остановки музыки
        return "Music stopped";
    }

    @PostMapping("/thermostat/increase")
    public String increaseTemperature() {
        // Логика для повышения температуры термостата
        return "Temperature increased";
    }

    @PostMapping("/thermostat/decrease")
    public String decreaseTemperature() {
        // Логика для понижения температуры термостата
        return "Temperature decreased";
    }

    @PostMapping("/camera/on")
    public String turnCameraOn() {
        // Логика для включения камеры
        return "Camera turned on";
    }

    @PostMapping("/camera/off")
    public String turnCameraOff() {
        // Логика для выключения камеры
        return "Camera turned off";
    }

    @PostMapping("/mode/party")
    public String startPartyMode() {
        // Логика для активации party mode
        return "Party mode activated";
    }

    @PostMapping("/mode/night")
    public String startNightMode() {
        // Логика для активации night mode
        return "Night mode activated";
    }

    @PostMapping("/leave")
    public String leaveHome() {
        // Логика для активации режима Leave Home
        return "Leaving home: All devices turned off, security activated";
    }
}
