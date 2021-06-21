package ru.netology;


public class Radio {


    public int currentStation;
    private String name = "radio";
    private int maxStation = 10;
    private int minStation = 0;

    private int maxVolumeLevel = 100;
    private int minVolumeLevel = 0;
    private int currentVolumeLevel;
    private boolean on;



    public Radio(int currentStation, String name, int maxStation, int minStation, int maxVolumeLevel, int minVolumeLevel, int currentVolumeLevel, boolean on) {
        this.currentStation = currentStation;
        this.name = name;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.maxVolumeLevel = maxVolumeLevel;
        this.minVolumeLevel = minVolumeLevel;
        this.currentVolumeLevel = currentVolumeLevel;
        this.on = on;
    }


    public Radio() {
       }



    public String getName() {
        return name;

    }





    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    public boolean isOn() {
        return on;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxStation) {
            currentRadioStation = maxStation;
        }
        if (currentRadioStation < minStation) {
            currentRadioStation = minStation;
        }
        this.currentStation = currentRadioStation;
    }

    public void setCurrentVolume(int currentSoundVolume) {
        if (currentSoundVolume > maxVolumeLevel) {
            currentSoundVolume = maxVolumeLevel;
        }
        if (currentSoundVolume < minVolumeLevel) {
            currentSoundVolume = minVolumeLevel;
        }
        this.currentVolumeLevel = currentSoundVolume;
    }

    public int nextRadioStation() {
        if (currentStation >= maxStation) {
            currentStation = minStation;
            return minStation;
        }
        currentStation++;

        return currentStation;
    }

    public int prevRadioStation() {
        if (currentStation <= minStation) {
            currentStation = maxStation;
            return maxStation;
        }
        currentStation--;

        return currentStation;
    }

    public int increaseVolume() {
        if (currentVolumeLevel >= 100) {
            return 100;
        }
         return currentVolumeLevel++;
    }

    public int decreaseVolume() {
        if (currentVolumeLevel <= 0) {
            return 0;
        }
       return  currentVolumeLevel--;
    }


    public int getMaxStation() {
        return maxStation; 
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxVolumeLevel() {
        return maxVolumeLevel;
    }

    public int getMinVolumeLevel() {
        return minVolumeLevel; 
    }



    public void setCurrentStation(int currentStation) {
        
    }

    public void setMinStation(int currentStation) {
    }

    public void setMaxStation(int currentStation) {
    }

    public void setCurrentVolumeLevel() {
    }

    public void setMaxVolumeLevel(int currentVolumeLevel) {
    }

    public void setCurrentVolumeLevel(int currentVolumeLevel) {
    }

    public void setMinVolumeLevel(int currentStation) {
    }

    public void setName(String expected) {
    }
}