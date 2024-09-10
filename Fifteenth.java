import java.util.Scanner;

public class Fifteenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
