package org.example;

public class Univer implements Obuchenie, Vypusk {
    private String nazvanie;
    private int studenty;
    private int fakultety;
    private int vypuskniki;

    public Univer(String nazvanie, int studenty, int fakultety) {
        this.nazvanie = nazvanie;
        this.studenty = studenty;
        this.fakultety = fakultety;
        this.vypuskniki = 0;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public int getFakultety() {
        return fakultety;
    }

    @Override
    public void obuchat() {
        System.out.println("Университет " + nazvanie + " читает лекции на " + fakultety + " факультетах.");
    }

    @Override
    public int getStudenty() {
        return studenty;
    }

    @Override
    public void vypustit() {
        vypuskniki = studenty / 4;
        studenty -= vypuskniki;
        System.out.println("Университет " + nazvanie + " выдал дипломы " + vypuskniki + " студентам.");
    }

    @Override
    public int getVypuskniki() {
        return vypuskniki;
    }
}
