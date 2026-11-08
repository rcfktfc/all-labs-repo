package org.example;

public class Shkola implements Obuchenie, Vypusk {
    private String nazvanie;
    private int studenty;
    private int klassy;
    private int vypuskniki;

    public Shkola(String nazvanie, int studenty, int klassy) {
        this.nazvanie = nazvanie;
        this.studenty = studenty;
        this.klassy = klassy;
        this.vypuskniki = 0;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public int getKlassy() {
        return klassy;
    }

    @Override
    public void obuchat() {
        System.out.println("Школа " + nazvanie + " проводит уроки для " + klassy + " классов.");
    }

    @Override
    public int getStudenty() {
        return studenty;
    }

    @Override
    public void vypustit() {
        vypuskniki = studenty / 11;
        studenty -= vypuskniki;
        System.out.println("Школа " + nazvanie + " выпустила " + vypuskniki + " учеников.");
    }

    @Override
    public int getVypuskniki() {
        return vypuskniki;
    }
}
