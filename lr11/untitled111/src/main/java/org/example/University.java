package org.example;

public class University extends Institution {

    public University(String nazvanie, String adres, int kolichestvoStudentov) {
        super(nazvanie, adres, kolichestvoStudentov);
    }

    @Override
    public String getType() {
        return "Университет";
    }
}