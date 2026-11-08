package org.example;

import java.util.List;

public class Museum {
    private int id;
    private String name;
    private String city;
    private int stars;
    private List<Integer> visitorRatings;

    public Museum(int id, String name, String city, int stars, List<Integer> visitorRatings) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.stars = stars;
        this.visitorRatings = visitorRatings;
    }

    public double getAverageRating() {
        if (visitorRatings == null || visitorRatings.isEmpty()) {
            return 0.0;
        }
        double summa = 0;
        for (int ocenka : visitorRatings) {
            summa += ocenka;
        }
        return summa / visitorRatings.size();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
