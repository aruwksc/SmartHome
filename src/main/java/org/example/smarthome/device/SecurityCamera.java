package org.example.smarthome.device;

public class SecurityCamera implements Device {
    private boolean isRecording;

    public SecurityCamera(){
        this.isRecording = false;
    }
    @Override
    public void operate() {
        if(isRecording){
            System.out.println("Stop recording");
            isRecording = false;
        } else {
            System.out.println("Start recording");
            isRecording = true;
        }
    }
}
