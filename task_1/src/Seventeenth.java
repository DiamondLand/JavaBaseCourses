import java.util.Scanner;

public class Seventeenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два целых числа A и B: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print("Простые числа в диапазоне: ");
        for (int num = a; num <= b; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
