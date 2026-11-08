package org.example;

public class Main {
    public static void main(String[] args) {
        School shkolaNomerOdin = new School("Средняя школа №1", "ул. Ленина, д. 10", 850);
        University bsuirUniversitet = new University("БГУИР", "ул. П. Бровки, д. 6", 12000);

        System.out.println("Тип: " + shkolaNomerOdin.getType());
        System.out.println("Название: " + shkolaNomerOdin.getNazvanie());
        System.out.println("Адрес: " + shkolaNomerOdin.getAdres());
        System.out.println("Учащихся: " + shkolaNomerOdin.getKolichestvoStudentov());

        shkolaNomerOdin.teach();
        shkolaNomerOdin.teach("Математика");
        shkolaNomerOdin.teach(4);

        System.out.println(" ");

        System.out.println("Тип: " + bsuirUniversitet.getType());
        System.out.println("Название: " + bsuirUniversitet.getNazvanie());
        System.out.println("Адрес: " + bsuirUniversitet.getAdres());
        System.out.println("Студентов: " + bsuirUniversitet.getKolichestvoStudentov());

        bsuirUniversitet.teach();
        bsuirUniversitet.teach("Программирование на Java");
        bsuirUniversitet.teach(6);
    }
}
