package org.example;

public class Zavedenie {
    private String nazvanie;
    private String adres;
    private int studenty;

    public Zavedenie(String nazvanie, String adres, int studenty) {
        this.nazvanie = nazvanie;
        this.adres = adres;
        this.studenty = studenty;
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getStudenty() {
        return studenty;
    }

    public void setStudenty(int studenty) {
        this.studenty = studenty;
    }

    public String poluchitTip() {
        return "Учебное заведение";
    }

    public void pokazatInfo() {
        System.out.println(poluchitTip() + ": " + nazvanie + ", Адрес: " + adres + ", Учащихся: " + studenty);
    }
}
