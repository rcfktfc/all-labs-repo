package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Instrument[] spisok = new Instrument[5];

        spisok[0] = new Drel("Bosch GSB 13", 600, 1.8, 2800);
        spisok[1] = new Drel("Makita HP1630", 710, 2.1, 3200);
        spisok[2] = new Drel("DeWalt DWD024", 650, 1.6, 2800);

        spisok[3] = new Pila("Makita HS7601", 1200, 4.0, 190);
        spisok[4] = new Pila("Bosch PKS 55", 1200, 3.9, 160);

        for (int i = 0; i < spisok.length; i++) {
            spisok[i].pokazatInfo();
            spisok[i].ispolzovat();
            System.out.println("Класс безопасности: " + spisok[i].poluchitKlassBezopasnosti());
            System.out.println(" ");
        }
    }
}
