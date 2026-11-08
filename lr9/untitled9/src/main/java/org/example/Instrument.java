package org.example;

public abstract class Instrument {
    private String nazvanie;
    private int moshnost;
    private double ves;

    public Instrument(String nazvanie, int moshnost, double ves) {
        this.nazvanie = nazvanie;
        this.moshnost = moshnost;
        this.ves = ves;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public int getMoshnost() {
        return moshnost;
    }

    public void setMoshnost(int moshnost) {
        this.moshnost = moshnost;
    }

    public double getVes() {
        return ves;
    }

    public void setVes(double ves) {
        this.ves = ves;
    }

    public abstract void ispolzovat();
    public abstract String poluchitKlassBezopasnosti();

    public void pokazatInfo() {
        System.out.println("Инструмент: " + nazvanie +
                ", Мощность: " + moshnost + " Вт" +
                ", Вес: " + ves + " кг");
    }
}
