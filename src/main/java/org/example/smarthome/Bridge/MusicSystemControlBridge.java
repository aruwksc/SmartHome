package org.example.smarthome.Bridge;

import org.example.smarthome.device.MusicSystem;

public class MusicSystemControlBridge implements DeviceControlBridge {

    private MusicSystem musicSystem;

    public MusicSystemControlBridge(MusicSystem musicSystem) {
        this.musicSystem = musicSystem;
    }

    @Override
    public void turnOn() {
        System.out.println("Music system is now playing.");
        musicSystem.operate();
    }

    @Override
    public void turnOff() {
        System.out.println("Music system is now stopped.");
        musicSystem.operate();
    }
    @Override
    public void playMusic() {
        System.out.println("Starting music system.");
        musicSystem.operate();
    }

    @Override
    public void setTemperature(int temperature) {
        throw new UnsupportedOperationException("setTemperature is not supported for MusicSystem");
    }
}
