package org.example;

public class Shkola extends Zavedenie {
    private int klassy;

    public Shkola(String nazvanie, String adres, int studenty, int klassy) {
        super(nazvanie, adres, studenty);
        this.klassy = klassy;
    }

    public int getKlassy() {
        return klassy;
    }

    public void setKlassy(int klassy) {
        this.klassy = klassy;
    }

    @Override
    public String poluchitTip() {
        return "Школа";
    }

    @Override
    public void pokazatInfo() {

        super.pokazatInfo();

        System.out.println(super.nazvanie);
        System.out.println(" Классов: " + klassy);
    }

    public void provestiUrok() {
        System.out.println("Идет урок в школе " + getNazvanie() + " (всего классов: " + klassy + ")");
    }
}
