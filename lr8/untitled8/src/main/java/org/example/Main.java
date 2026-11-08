package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Zavedenie[] spisok = new Zavedenie[5];

        spisok[0] = new Shkola("Школа №1", "ул. Ленина, 10", 500, 20);
        spisok[1] = new Shkola("Гимназия №5", "ул. Мира, 25", 750, 30);
        spisok[2] = new Shkola("Лицей №2", "ул. Кирова, 5", 300, 12);
        spisok[3] = new Univer("БГУИР", "ул. П. Бровки, 6", 15000, 8);
        spisok[4] = new Univer("БНТУ", "пр. Независимости, 65", 20000, 16);

        for (int i = 0; i < spisok.length; i++) {
            spisok[i].pokazatInfo();

            if (spisok[i] instanceof Shkola) {
                Shkola s = (Shkola) spisok[i];
                s.provestiUrok();
            } else if (spisok[i] instanceof Univer) {
                Univer u = (Univer) spisok[i];
                u.provestiLekciyu();
            }

            System.out.println(" ");
        }
    }
}
