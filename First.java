import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите целое число (или 'exit' для выхода): ");
            String input = scanner.nextLine();

            // Проверка на команду выхода
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Выход из программы.");
                break;
            }

            try {
                int number = Integer.parseInt(input);
                if (number % 2 == 0) {
                    System.out.println("Число " + number + " является четным.");
                } else {
                    System.out.println("Число " + number + " является нечетным.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите корректное целое число.");
            }
        }

        scanner.close();
    }
}
