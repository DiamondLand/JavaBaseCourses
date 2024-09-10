import java.util.Scanner;

public class Twentieth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        int sum = 0;
        int temp = number;
        int digits = String.valueOf(number).length();

        while (temp > 0) {
            int digit = temp % 10;
            // Вот как тыт делать я догнать не могу чё-то
            temp /= 10;
        }
        System.out.println("Является числом Армстронга: " + (sum == number));
    }
}
