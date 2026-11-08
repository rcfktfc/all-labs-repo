package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Obuchenie.pokazatPravila();
        System.out.println(" ");

        Vypusk[] spisok = new Vypusk[5];

        spisok[0] = new Shkola("Школа №1", 550, 22);
        spisok[1] = new Shkola("Гимназия №5", 770, 30);
        spisok[2] = new Shkola("Лицей №2", 330, 12);
        spisok[3] = new Univer("БГУИР", 12000, 8);
        spisok[4] = new Univer("БНТУ", 16000, 16);

        for (int i = 0; i < spisok.length; i++) {
            Obuchenie uch = (Obuchenie) spisok[i];
            uch.obuchat();
            System.out.println("Учащихся до выпуска: " + uch.getStudenty());

            spisok[i].vypustit();
            System.out.println("Всего выпускников: " + spisok[i].getVypuskniki());
            System.out.println("Осталось учащихся: " + uch.getStudenty());
            System.out.println(" ");
        }
    }
}
