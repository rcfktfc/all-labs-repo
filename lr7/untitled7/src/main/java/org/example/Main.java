package org.example;

import static org.example.Hotel.getTotalRooms;
import static org.example.Hotel.t;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hotel h1 = new Hotel("Гранд Европа", 5, 120);
        Hotel h2 = new Hotel("Минск", 4, 252);
        Hotel h3 = new Hotel("Орбита", 3, 210);
        Hotel h4 = new Hotel("Ренессанс", 5, 267);
        Hotel h5 = new Hotel("Уют", 2, 45);
        h5.test1();
        t(h5);

        System.out.println("Список отелей:");
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        System.out.println(h5);

        System.out.println("Всего создано отелей: " + Hotel.getTotalHotels());
        System.out.println("Общее количество номеров: " + Hotel.getTotalRooms());
        System.out.printf("Среднее число номеров: %.2f%n", Hotel.getAverageRooms());
    }
}
