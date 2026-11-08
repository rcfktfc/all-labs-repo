package org.example;

public class Main {
    public static void main(String[] args) {
        Train poezd = new Train("Moskva", "123A", "14:30", 1);

        System.out.println(poezd.getDestination());
        System.out.println(poezd.getTrainNumber());
        System.out.println(poezd.getDepartureTime());

        poezd.isDelayed(30);

        System.out.println(poezd.getDepartureTime());
        System.out.println(poezd.getKol());
    }
}