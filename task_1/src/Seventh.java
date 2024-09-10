import java.util.Scanner;

public class Seventh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();
        System.out.print("Числа от " + N + " до 1 в обратном порядке: ");
        for (int i = N; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
