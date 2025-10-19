package org.example.smarthome;

import org.example.smarthome.Facade.HomeAutomationFacade;
import org.example.smarthome.decorator.EnergySavingDecorator;
import org.example.smarthome.decorator.RemoteAccessDecorator;
import org.example.smarthome.decorator.VoiceControlDecorator;
import org.example.smarthome.device.*;

public class Main {
    public static void main(String[] args) {
        Device light = new Light();
        Device musicSystem = new MusicSystem();
        Device thermostat = new Thermostat();
        Device securityCamera = new SecurityCamera();

        light = new VoiceControlDecorator(light);  
        musicSystem = new RemoteAccessDecorator(musicSystem);  
        thermostat = new EnergySavingDecorator(thermostat);  
        securityCamera = new RemoteAccessDecorator(securityCamera);  

        HomeAutomationFacade homeAutomationSystem = new HomeAutomationFacade(light, musicSystem, thermostat, securityCamera, null, null);

        System.out.println("Activating Night Mode...");
        homeAutomationSystem.activateNightMode(); 

        System.out.println("\nStarting Party Mode...");
        homeAutomationSystem.startPartyMode();  

        System.out.println("\nControlling devices dynamically:");
        homeAutomationSystem.leaveHome(); 

        System.out.println("\nUsing Voice Control for light:");
        light.operate(); 

        System.out.println("\nUsing Remote Access for music system:");
        musicSystem.operate();  

        System.out.println("\nSetting thermostat to 20°C via AppControl:");
        thermostat.operate();
        if(thermostat instanceof Thermostat) {
            ((Thermostat)thermostat).setTemperature(20);
        } else {
            System.err.println("Thermostat is not available");
        }
    }
}
