package org.example;

public class Pila extends Instrument {
    private int dlinaLezviya;
    

    public Pila(String nazvanie, int moshnost, double ves, int dlinaLezviya) {
        super(nazvanie, moshnost, ves);
        this.dlinaLezviya = dlinaLezviya;
    }

    public int getDlinaLezviya() {
        return dlinaLezviya;
    }

    public void setDlinaLezviya(int dlinaLezviya) {
        this.dlinaLezviya = dlinaLezviya;
    }

    @Override
    public void ispolzovat() {
        System.out.println("Действие: Режет материалы");
    }

    @Override
    public String poluchitKlassBezopasnosti() {
        return "Класс II";
    }

    @Override
    public void pokazatInfo() {
        System.out.println("[Пила] Название: " + getNazvanie() +
                ", Мощность: " + getMoshnost() + " Вт" +
                ", Вес: " + getVes() + " кг" +
                ", Длина лезвия: " + dlinaLezviya + " мм");
    }
}
