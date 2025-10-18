package org.example.smarthome.device;

public class MusicSystem implements Device {
    private boolean isPlaying;

    public MusicSystem() {
        this.isPlaying = false;
    }
    @Override
    public void operate() {
        if (isPlaying) {
            System.out.println("Pausing music..");
            isPlaying = false;
        }  else {
            System.out.println("Playing music..");
            isPlaying = true;
        }
    }
}
