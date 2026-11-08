package org.example;

public class Institution {
    private String nazvanie;
    private String adres;
    private int kolichestvoStudentov;

    public Institution(String nazvanie, String adres, int kolichestvoStudentov) {
        this.nazvanie = nazvanie;
        this.adres = adres;
        this.kolichestvoStudentov = kolichestvoStudentov;
    }

    public void teach() {
        System.out.println("Учу");
    }

    public void teach(String subject) {
        System.out.println("Учу предмету " + subject);
    }

    public void teach(int hours) {
        System.out.println("Учу " + hours + " часов");
    }

    public String getType() {
        return "Учебное заведение";
    }

    public String getNazvanie() {
        return nazvanie;
    }

    public String getAdres() {
        return adres;
    }

    public int getKolichestvoStudentov() {
        return kolichestvoStudentov;
    }
}