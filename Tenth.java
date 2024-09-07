import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int num = scanner.nextInt();
        int count = String.valueOf(Math.abs(num)).length();
        System.out.println("Количество цифр в числе: " + count);
    }
}
