import java.util.Scanner;

public class Sixteenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int positives = 0;
        int negatives = 0;
        for (int num : array) {
            if (num > 0) {
                positives++;
            } else if (num < 0) {
                negatives++;
            }
        }
        System.out.println("Количество положительных чисел: " + positives);
        System.out.println("Количество отрицательных чисел: " + negatives);
    }
}
