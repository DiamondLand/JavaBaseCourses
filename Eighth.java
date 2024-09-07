import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два целых числа A и B: ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int sum = 0;
        for (int i = Math.min(A, B); i <= Math.max(A, B); i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма четных чисел в диапазоне: " + sum);
    }
}
