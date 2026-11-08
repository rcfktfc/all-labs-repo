package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Museum> spisokMuzeev = new ArrayList<>();

        spisokMuzeev.add(new Museum(1, "Эрмитаж", "Санкт-Петербург", 5, List.of(5, 5, 4, 5)));
        spisokMuzeev.add(new Museum(2, "Третьяковка", "Москва", 4, List.of(4, 4, 3, 4)));
        spisokMuzeev.add(new Museum(3, "Лувр", "Париж", 5, List.of(5, 5, 5, 5)));
        spisokMuzeev.add(new Museum(4, "Краеведческий", "Минск", 3, List.of(3, 2, 3, 4)));
        spisokMuzeev.add(new Museum(5, "Альбом", "Минск", 3, List.of(4, 4, 3, 4)));

        System.out.println("1. Музеи с рейтингом > 3");
        for (Museum muzey : spisokMuzeev) {
            if (muzey.getAverageRating() > 3.0) {
                System.out.println("Музей: " + muzey.getName() + " | Рейтинг: " + muzey.getAverageRating());
            }
        }

        System.out.println("\n2. Повышение звезд для рейтинга >= 4");
        for (Museum muzey : spisokMuzeev) {
            if (muzey.getAverageRating() >= 4.0) {
                int starieZvezdy = muzey.getStars();
                muzey.setStars(starieZvezdy + 1);
                System.out.println("Музей " + muzey.getName() + " Был: " + starieZvezdy + ", Стала: " + muzey.getStars());
            }
        }

        System.out.println("\n3. Печать музеев с заданным количеством звезд 6 звезд");
        printMuseums(spisokMuzeev, 6);

        System.out.println("\n4. Сортировка по убыванию рейтинга");
        Collections.sort(spisokMuzeev, new MuseumKomparator());

        for (Museum muzey : spisokMuzeev) {
            System.out.println("ИД: " + muzey.getId() + " | Название: " + muzey.getName() + " | Рейтинг: " + muzey.getAverageRating());
        }

        System.out.println("\n5. Работа с картой СпортивноеОборудование");
        Map<String, SportsEquipment> kartaOborudovania = new HashMap<>();

        kartaOborudovania.put("Футбольный Мяч", new Ball("Футбольный Мяч", 101, 0.43, "Футбол"));
        kartaOborudovania.put("Баскетбольный Мяч", new Ball("Баскетбольный Мяч", 102, 0.62, "Баскетбол"));
        kartaOborudovania.put("Теннисный Мяч", new Ball("Теннисный Мяч", 103, 0.05, "Теннис"));

        kartaOborudovania.put("Ракетка Вилсон", new Racket("Ракетка Вилсон", 201, 0.31, 25));
        kartaOborudovania.put("Ракетка Хэд", new Racket("Ракетка Хэд", 202, 0.29, 24));
        kartaOborudovania.put("Ракетка Баболат", new Racket("Ракетка Баболат", 203, 0.30, 26));

        kartaOborudovania.put("Шлем Бауэр", new Helmet("Шлем Бауэр", 301, 0.85, "Л"));
        kartaOborudovania.put("Шлем ССМ", new Helmet("Шлем ССМ", 302, 0.82, "М"));

        for (Map.Entry<String, SportsEquipment> para : kartaOborudovania.entrySet()) {
            System.out.println("Ключ: " + para.getKey() + " -> Значение: " + para.getValue());
        }
    }

    public static void printMuseums(List<Museum> museums, int stars) {
        for (Museum muzey : museums) {
            if (muzey.getStars() == stars) {
                System.out.println("ИД: " + muzey.getId() + " | Название: " + muzey.getName() + " | Город: " + muzey.getCity() + " | Звезды: " + muzey.getStars());
            }
        }
    }
}
