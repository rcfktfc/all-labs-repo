package org.example;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Train {
    private String destination;
    private String trainNumber;
    private String departureTime;
    private int kol;


    public void setKol(int kol) {
        this.kol = kol;
    }

    public int getKol() {
        return kol;
    }

    public Train(String destination, String trainNumber, String departureTime, int kol) {
        this.kol = kol;
        this(destination, trainNumber, departureTime);
    }


    public Train(String destination, String trainNumber, String departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }


    public String getDestination() {
        return destination;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void isDelayed(int minutes) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime vremya = LocalTime.parse(departureTime, format);
        LocalTime novoeVremya = vremya.plusMinutes(minutes);
        departureTime = novoeVremya.format(format);
    }
}