package org.example;

public class School extends Institution {

    public School(String nazvanie, String adres, int kolichestvoStudentov) {
        super(nazvanie, adres, kolichestvoStudentov);
    }

    @Override
    public String getType() {
        return "Школа";
    }
}