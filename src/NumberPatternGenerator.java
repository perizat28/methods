import java.util.Scanner;
public class NumberPatternGenerator {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        // Запрашиваем размер (количество строк)
        System.out.print("Enter pattern size: ");
        int size = scanner.nextInt();

        // Запрашиваем тип узора (1-5)
        System.out.print("Choose pattern type (1-5): ");
        int type = scanner.nextInt();

        // Вызываем метод для отрисовки узора
        generatePattern(size, type);
    }

    // метод для создания узора
    public static void generatePattern(int size, int type) {
        // 1. Right Triangle
        if (type == 1) {
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        // 2. Inverted Right Triangle
        else if (type == 2) {
            for (int i = size; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        // 3. Pyramid
        else if (type == 3) {
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= size - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        // 4. Inverted Pyramid (Перевернутая пирамида)
        else if (type == 4) {
            for (int i = size; i >= 1; i--) {
                for (int j = 1; j <= size - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        // 5. Another Example of a Pattern
        else if (type == 5) {
            for (int i = 1; i <= size; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}
