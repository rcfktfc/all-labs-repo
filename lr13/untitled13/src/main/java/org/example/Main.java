package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VetKlinika klinika = new VetKlinika("Друг");

        try {
            Pitomec p1 = new Pitomec("Барсик", "Кот", 3, 4.5, "Иван");
            Pitomec p2 = new Pitomec("Рекс", "Собака", 5, 18.2, "Ольга");
            Pitomec p3 = new Pitomec("Чижик", "Хомяк", 1, 0.3, "Максим");

            klinika.zaregistrirovat(p1);
            klinika.zaregistrirovat(p2);
            klinika.zaregistrirovat(p3);
        } catch (NepravilnyeDannyeIsklyuchenie e) {
            System.err.println("Ошибка при создании: " + e.getMessage());
        }

        System.out.println(" ");
        klinika.pokazatVseh();
        System.out.println(" ");

        try {
            Pitomec naydenniy = klinika.naytiPitomca("Барсик");
            naydenniy.posetitVeterinara("Осмотр");
            naydenniy.obnovitVes(4.8);
        } catch (PitomecNeNaydenIsklyuchenie | VeterinarIsklyuchenie | NepravilnyeDannyeIsklyuchenie e) {
            System.err.println("Ошибка: " + e.getMessage());
        }


        try {
            Pitomec nepravilniy = new Pitomec("Шарик", "Собака", -2, 10.0, "Анна");
        } catch (NepravilnyeDannyeIsklyuchenie e) {
            System.err.println("Поймано исключение: " + e.getMessage());
        }


        try {
            klinika.naytiPitomca("Мурзик");
        } catch (PitomecNeNaydenIsklyuchenie e) {
            System.err.println("Поймано исключение: " + e.getMessage());
        }


        try {
            Pitomec chizhik = klinika.naytiPitomca("Чижик");
            chizhik.posetitVeterinara("Опасная операция");
        } catch (PitomecNeNaydenIsklyuchenie | VeterinarIsklyuchenie e) {
            System.err.println("Поймано исключение: " + e.getMessage());
        }


        try {
            Pitomec reks = klinika.naytiPitomca("Рекс");
            reks.obnovitVes(-5.0);
        } catch (PitomecNeNaydenIsklyuchenie | NepravilnyeDannyeIsklyuchenie e) {
            System.err.println("Поймано исключение: " + e.getMessage());
        }
    }
}
