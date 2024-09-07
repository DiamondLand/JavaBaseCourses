import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();
        int a = 0, b = 1;
        System.out.print("Первые " + N + " чисел Фибоначчи: ");
        for (int i = 0; i < N; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
