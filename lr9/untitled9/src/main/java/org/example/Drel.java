package org.example;

public class Drel extends Instrument {
    private int skorost;

    public Drel(String nazvanie, int moshnost, double ves, int skorost) {
        super(nazvanie, moshnost, ves);
        this.skorost = skorost;
    }

    public int getSkorost() {
        return skorost;
    }

    public void setSkorost(int skorost) {
        this.skorost = skorost;
    }

    @Override
    public void ispolzovat() {
        System.out.println("Действие: Сверлит отверстия");
    }

    @Override
    public String poluchitKlassBezopasnosti() {
        return "Класс I";
    }

    @Override
    public void pokazatInfo() {
        System.out.println("[Дрель] Название: " + getNazvanie() +
                ", Мощность: " + getMoshnost() + " Вт" +
                ", Вес: " + getVes() + " кг" +
                ", Скорость: " + skorost + " об/мин");
    }
}
