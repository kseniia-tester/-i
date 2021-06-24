package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.Radio;


import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldInitField() {
        Radio radio = new Radio();
        assertNull(radio.getName());
        assertEquals(10, radio.getMaxStation());
        assertEquals(0, radio.getMinStation());
        assertEquals(0, radio.getCurrentStation());
        assertEquals(100, radio.getMaxVolumeLevel());
        assertEquals(0, radio.getMinVolumeLevel());
        assertEquals(0, radio.getCurrentVolumeLevel());
        assertFalse(radio.isOn());
    }

    @Test
    public void radioMaxChannel() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        assertEquals(10, radio.getMaxStation());
    }



    @Test
    public void shouldPrevStation()  {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.prevRadioStation();
        int  expected=7;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStation()  {
        Radio radio = new Radio();
        int currentStation = 0;
        radio.setMinStation(currentStation);
        radio.prevRadioStation();
        int  expected=1;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldUseRadio() {
        Radio radio = new Radio();
    }




    @Test
    public void shouldIncreaseStation()  {
        Radio radio = new Radio();
        int currentStation = 0;
        radio.setCurrentStation(currentStation);
        radio.nextRadioStation();
        int  expected=1;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldMaxStation()  {
        Radio radio = new Radio();
        int currentStation = 9;
        radio.setMaxStation(currentStation);
        radio.nextRadioStation();
        int  expected=1;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void shouldMaxVolume()  {
        Radio radio = new Radio();
        int currentStation = 100;
        radio.setMaxStation(currentStation);
        radio.setCurrentVolumeLevel();
        int  expected=0;
        assertEquals(expected, radio.getCurrentVolumeLevel());
    }



    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolumeLevel());


    }

    @Test
    public void shouldDecreaseSound1() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolumeLevel());
    }

    @Test
    public void shouldSwitchStation1() {
    Radio radio = new Radio();
    radio.setCurrentRadioStation(0);
    radio.prevRadioStation();
    assertEquals(10, radio.getCurrentStation());
}

    @Test
    public void shouldSwitchStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchStation3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.prevRadioStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldSwitchStation4() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(11);
        radio.nextRadioStation();
        assertEquals(0, radio.getCurrentStation());
    }






    @Test
    void shouldSetCurrentRadioStationBackToZero() {
        Radio radio = new Radio();
        int currentStation = 10;
        radio.setCurrentStation(currentStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();
        int currentStation = -99;
        radio.setCurrentStation(currentStation);
        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());

    }

    @Test
    void shouldChangeOnMaxRadioStationIfStationIsMin() {
        Radio radio = new Radio();
        int currentStation = 0;
        radio.setCurrentStation(currentStation);
        radio.prevRadioStation();
        int expected = 10;
        assertEquals(expected, radio.getCurrentStation());
    }


    @Test
    public void shouldIncreaseSound2() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(100);
        radio.decreaseVolume();
        assertEquals(99, radio.getCurrentVolumeLevel());
    }

    @Test
    public void shouldIncreaseSound() {
        Radio radio = new Radio();
        radio.setMaxVolumeLevel(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolumeLevel());
    }

    @Test
    public void shouldDecreaseSound() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(7);
        radio.decreaseVolume();
        assertEquals(6, radio.getCurrentVolumeLevel());
    }



    @Test
    void shouldSetVolumeIfVolumeIsOverMax() {
        Radio radio = new Radio();
        int currentVolume = 101;
        radio.setCurrentVolumeLevel();
        int expected = 100;
        assertEquals(expected, radio.getCurrentVolumeLevel());
    }

    @Test
    void shouldSetVolumeIfVolumeIsUnderMin() {
        Radio radio = new Radio();
        int currentVolume = -1;
        radio.setCurrentVolumeLevel();
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolumeLevel());
    }


    @Test
    void shouldNotChangeVolumeIfVolumeIsMin() {
        Radio radio = new Radio();
        int currentVolume = 0;
        radio.setCurrentVolumeLevel();
        radio.decreaseVolume();
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolumeLevel());

    }

    @Test
    void volumeUpForOne() {
        Radio radio = new Radio();

        radio.setCurrentVolumeLevel(8);
        radio.increaseVolume();
        int expected = 9;
        assertEquals(expected, radio.getCurrentVolumeLevel());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMax() {
        Radio radio = new Radio();
        radio.setMaxVolumeLevel(100);
        radio.increaseVolume();
        int expected = 100;
        assertEquals(expected, radio.getCurrentVolumeLevel());
    }

    @Test
    void volumeDownForOne() {
        Radio radio = new Radio ();
        int currentVolumeLevel = 100;
        radio.setCurrentVolumeLevel(currentVolumeLevel);
        radio.decreaseVolume();
        int expected = 99;
        assertEquals(expected, radio.getCurrentVolumeLevel());
    }

    @Test
    public void shouldIncreaseSound1() {
        Radio radio = new Radio();
        radio.setCurrentVolumeLevel(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolumeLevel());

    }
    @Test
    public void shouldCreate() {
        Radio Radio = new Radio();
    }


    @Test
    public void shouldChangeFields() {
        Radio radio = new Radio();
        assertEquals(0, radio.currentStation);
        radio.currentStation = 5;
        assertEquals(5, radio.currentStation);
    }
}



