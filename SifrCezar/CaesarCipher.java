package SifrCezar;

import java.util.Scanner;


public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Шифровать текст");
            System.out.println("2. Расшифровать текст");
            System.out.println("3. Расшифровка методом brute force");
            System.out.println("4. Расшифровка методом статистического анализа");
            System.out.println("5. Выход");
            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (choice) {
                case 1:
                    FileHandler.encryptFile(scanner);
                    break;
                case 2:
                    FileHandler.decryptFile(scanner);
                    break;
                case 3:
                    FileHandler.bruteForceDecrypt(scanner);
                    break;
                case 4:
                    FileHandler.statisticalAnalysisDecrypt(scanner);
                    break;
                case 5:
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте еще раз.");
            }
        }
    }
}
