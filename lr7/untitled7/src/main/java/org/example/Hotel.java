package org.example;

import static java.lang.System.*;

public class Hotel {

    private String name;
    private int stars;
    private int rooms;

    private static int totalHotels = 0;
    private static int totalRooms = 0;

    public Hotel(String name, int stars, int rooms) {
        this.name = name;
        this.stars = stars;
        this.rooms = rooms;

        totalHotels++;
        totalRooms += rooms;
    }

    public static double getAverageRooms() {
        if (totalHotels == 0) {
            return 0.0;
        }
        return (double) totalRooms / totalHotels;
    }

    public static int getTotalHotels() {
        return totalHotels;
    }

    public static int getTotalRooms() {
        return totalRooms;
    }

    public void test1() {
        out.println("Название" + name + " звезд " + stars + " комнат " + rooms);
    }

    public static void t(Hotel obj) {
        out.println("Название" + obj.name + " звезд " + obj.stars + " комнат " + obj.rooms);
    }

    @Override
    public String toString() {
        return String.format("Отель \"%s\" (%d★) — номеров: %d", name, stars, rooms);
    }
}
