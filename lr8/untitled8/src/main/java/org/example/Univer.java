package org.example;

public class Univer extends Zavedenie {
    private int fakultety;

    public Univer(String nazvanie, String adres, int studenty, int fakultety) {
        super(nazvanie, adres, studenty);
        this.fakultety = fakultety;
    }

    public int getFakultety() {
        return fakultety;
    }

    public void setFakultety(int fakultety) {
        this.fakultety = fakultety;
    }

    @Override
    public String poluchitTip() {
        return "Университет";
    }

    @Override
    public void pokazatInfo() {
        System.out.println(poluchitTip() + ": " + getNazvanie() + ", Адрес: " + getAdres() +
                ", Студентов: " + getStudenty() + ", Факультетов: " + fakultety);
    }

    public void provestiLekciyu() {
        System.out.println("Идет лекция в университете " + getNazvanie() + " (факультетов: " + fakultety + ")");
    }
}
