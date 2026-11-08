package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void zadanie1() {
        String imyaFayla = "lyubimoe_zhivotnoe.txt";
        File fayl = new File(imyaFayla);

        try (FileWriter pisatel = new FileWriter(fayl)) {
            pisatel.write("Животное: Кот\n");
            pisatel.write("Кличка: Барсик\n");
            pisatel.write("Порода: Британский короткошерстный\n");
            pisatel.write("Возраст: 3 года\n");
            pisatel.write("Особенность: Любит спать на клавиатуре\n");
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла: " + e.getMessage());
            return;
        }

        System.out.println("\nДанные о файле");
        System.out.println("Имя файла: " + fayl.getName());
        System.out.println("Абсолютный путь: " + fayl.getAbsolutePath());
        System.out.println("Размер: " + fayl.length() + " байт");
        System.out.println("Доступен для чтения: " + (fayl.canRead() ? "Да" : "Нет"));
        System.out.println("Доступен для записи: " + (fayl.canWrite() ? "Да" : "Нет"));

        System.out.println("\nСодержимое файла");
        try (FileReader chitatel = new FileReader(fayl)) {
            int simvol;
            while ((simvol = chitatel.read()) != -1) {
                System.out.print((char) simvol);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    public static void zadanie2(Scanner skanner) {
        String imyaFayla = "f.txt";

        System.out.println("\nВведите 10 целых чисел через пробел или Enter:");
        try (FileWriter pisatel = new FileWriter(imyaFayla)) {
            for (int i = 0; i < 10; i++) {
                int chislo = skanner.nextInt();
                pisatel.write(chislo + " ");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
            return;
        }

        int schetchik = 0;
        System.out.println("Числа, считанные из файла 'f':");
        try (Scanner faylSkanner = new Scanner(new File(imyaFayla))) {
            while (faylSkanner.hasNextInt()) {
                int chislo = faylSkanner.nextInt();
                System.out.print(chislo + " ");
                if (chislo % 2 == 0 && chislo > 10) {
                    schetchik++;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
            return;
        }

        System.out.println("\nКоличество четных чисел, больших 10: " + schetchik);
    }

    public static void zadanie3() {
        String faylF = "f.txt";
        String faylG = "g.txt";
        String faylH = "h.txt";

        Random random = new Random();

        try (FileWriter pisatelF = new FileWriter(faylF)) {
            for (int i = 0; i < 20; i++) {
                int sluchaynoeChislo = random.nextInt(200) + 1;
                pisatelF.write(sluchaynoeChislo + " ");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл f: " + e.getMessage());
            return;
        }

        try (Scanner chitatelF = new Scanner(new File(faylF));
             FileWriter pisatelG = new FileWriter(faylG);
             FileWriter pisatelH = new FileWriter(faylH)) {

            while (chitatelF.hasNextInt()) {
                int chislo = chitatelF.nextInt();
                if (chislo % 2 != 0 && chislo < 100) {
                    pisatelG.write(chislo + " ");
                } else {
                    pisatelH.write(chislo + " ");
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при распределении чисел: " + e.getMessage());
            return;
        }

        System.out.println("\nФайл 'f' успешно заполнен 20 случайными числами.");
        System.out.println("Нечетные числа меньше 100 записаны в файл 'g'.");
        System.out.println("Все остальные числа записаны в файл 'h'.");
    }

    public static void zadanie4(Scanner skanner) {
        String imyaFayla = "kpd.txt";

        System.out.println("\nВведите 10 вещественных");
        try (FileWriter pisatel = new FileWriter(imyaFayla)) {
            for (int i = 0; i < 5; i++) {
                double znachenie = skanner.nextDouble();
                if (znachenie < 0) {
                    System.out.println("Кпд не может быть меньше 0 (введите ккорректное значение)");
                    znachenie = skanner.nextDouble();
                }
                pisatel.write(znachenie + " ");
            }

        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
            return;
        }

        double summa = 0.0;
        int kolichestvo = 0;

        try (Scanner faylSkanner = new Scanner(new File(imyaFayla))) {
            faylSkanner.useLocale(Locale.US);
            while (faylSkanner.hasNextDouble()) {
                double kpd = faylSkanner.nextDouble();
                summa += kpd;
                kolichestvo++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
            return;
        }

        if (kolichestvo > 0) {
            double sredniyKpd = summa / kolichestvo;
            System.out.printf(Locale.US, "Средний КПД: %.2f%n", sredniyKpd);
        } else {
            System.out.println("Файл пуст.");
        }
    }

    public static void zadanie5() {
        String imyaFayla = "f.txt";
        Random random = new Random();

        try (FileWriter pisatel = new FileWriter(imyaFayla)) {
            for (int i = 0; i < 10; i++) {
                int chislo = random.nextInt(120) + 1;
                pisatel.write(chislo + " ");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
            return;
        }

        int schetchik = 0;
        System.out.println("\nСгенерированные числа в файле 'f':");
        try (Scanner faylSkanner = new Scanner(new File(imyaFayla))) {
            while (faylSkanner.hasNextInt()) {
                int chislo = faylSkanner.nextInt();
                System.out.print(chislo + " ");
                if (chislo >= 10 && chislo <= 90) {
                    schetchik++;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
            return;
        }

        System.out.println("\nКоличество чисел в диапазоне от 10 до 90: " + schetchik);
    }

    public static void main(String[] args) {
        Scanner skanner = new Scanner(System.in);
        skanner.useLocale(Locale.US);

        while (true) {
            System.out.println("1. Информация о любимом животном (создание, свойства, чтение)");
            System.out.println("2. 10 целых чисел в файл 'f' (четные и > 10)");
            System.out.println("3. Случайные числа в 'f' -> разделение в 'g' и 'h'");
            System.out.println("4. 10 значений КПД и расчет среднего");
            System.out.println("5. 10 целых чисел в 'f' (числа в диапазоне [10; 90])");

            int vybor = skanner.nextInt();

            switch (vybor) {
                case 1:
                    zadanie1();
                    break;
                case 2:
                    zadanie2(skanner);
                    break;
                case 3:
                    zadanie3();
                    break;
                case 4:
                    zadanie4(skanner);
                    break;
                case 5:
                    zadanie5();
                    break;
                default:
                    System.out.println("Неверный пункт меню! Попробуйте снова.");
            }
        }
    }
}
