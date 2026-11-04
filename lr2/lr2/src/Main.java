import java.util.Scanner;
import java.util.Random;

void main() {
    Scanner scan = new Scanner(System.in);
    Random random = new Random();

    System.out.print("ZADANIE=");
    int zadanie = scan.nextInt();

    switch(zadanie) {
        case 1:
            System.out.print("Введите размер массива n: ");
            int n = scan.nextInt();
            int[] nums = new int[n];

            for (int i = 0; i < nums.length; i++) {
                nums[i] = random.nextInt(201) - 100;
                System.out.println(nums[i]);
            }

            boolean yb = true;

            for (int i = 0; i < n - 1; i++) {
                if (nums[i] <= nums[i+1]) {
                    yb = false;
                    break;
                }
            }

            if (yb) {
                System.out.println("убывающий");
            } else {
                System.out.println("ne убывающий");
            }
            break;

        case 2:
            System.out.print("введите размер квадратной матрицы (n): ");
            int nn = scan.nextInt();
            int[][] mass = new int[nn][nn];

            System.out.println("исходный массив:");
            for (int i = 0; i < mass.length; i++) {
                for (int j = 0; j < mass[i].length; j++) {
                  //  mass[i][j] = random.nextInt(201) - 100;
                    mass[i][j] = scan.nextInt();
                    System.out.print(mass[i][j] + "\t");
                }
                System.out.println();
            }

            int minznach = Integer.MAX_VALUE;
            int minRow = 0;
            int minCol = 0;

            for (int i = 0; i < mass.length; i++) {
                for (int j = 0; j < mass[i].length; j++) {
                    if (mass[i][j] < minznach) {
                        minznach = mass[i][j];
                        minRow = i;
                        minCol = j;
                    }
                }
            }

            System.out.println("\nминимум: " + minznach );

            for (int k = 0; k < mass.length; k++) {
                if (k != minRow && k != minCol) {
                    int t = mass[minRow][k];
                    mass[minRow][k] = mass[k][minCol];
                    mass[k][minCol] = t;
                }
            }

            System.out.println("\nмассив после перестановки:");
            for (int i = 0; i < mass.length; i++) {
                for (int j = 0; j < mass[i].length; j++) {
                    System.out.print(mass[i][j] + "\t");
                }
                System.out.println();
            }
            break;
    }
}