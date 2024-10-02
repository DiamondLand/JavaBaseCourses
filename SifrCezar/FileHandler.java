package SifrCezar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class FileHandler {
    private static final String ALPHABET = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String ALPHABET_LOWER = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяabcdefghijklmnopqrstuvwxyz";
    private static Map<Character, Double> RUSSIAN_FREQUENCIES = new HashMap<>();

    public static void loadFrequencies(String filePath) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (String line : lines) {
                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    char letter = parts[0].charAt(0);
                    double frequency = Double.parseDouble(parts[1]);
                    RUSSIAN_FREQUENCIES.put(letter, frequency);
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке частот: " + e.getMessage());
        }
    }
    public static void encryptFile(Scanner scanner) {
        System.out.print("Введите путь к входному файлу: ");
        String inputFilePath = scanner.nextLine();
        System.out.print("Введите путь к выходному файлу: ");
        String outputFilePath = scanner.nextLine();
        int key = getKeyFromUser(scanner);

        try {
            String content = Files.readString(Paths.get(inputFilePath));
            String encryptedContent = Cipher.encrypt(content, key);
            Files.writeString(Paths.get(outputFilePath), encryptedContent);
            System.out.println("Шифрование завершено. Результат записан в " + outputFilePath);
        } catch (IOException e) {
            System.out.println("Ошибка при обработке файла: " + e.getMessage());
        }
    }

    public static void decryptFile(Scanner scanner) {
        System.out.print("Введите путь к входному файлу: ");
        String inputFilePath = scanner.nextLine();
        System.out.print("Введите путь к выходному файлу: ");
        String outputFilePath = scanner.nextLine();
        int key = getKeyFromUser(scanner);

        try {
            String content = Files.readString(Paths.get(inputFilePath));
            String decryptedContent = Cipher.decrypt(content, key);
            Files.writeString(Paths.get(outputFilePath), decryptedContent);
            System.out.println("Расшифрование завершено. Результат записан в " + outputFilePath);
        } catch (IOException e) {
            System.out.println("Ошибка при обработке файла: " + e.getMessage());
        }
    }

    private static int getKeyFromUser(Scanner scanner) {
        int key = -1;
        while (key < 1 || key > 32) {
            System.out.print("Введите ключ (число от 1 до 32): ");
            String input = scanner.nextLine();
            try {
                key = Integer.parseInt(input);
                if (key < 1 || key > 32) {
                    System.out.println("Ключ должен быть в диапазоне от 1 до 32.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите число.");
            }
        }
        return key;
    }

    public static void bruteForceDecrypt(Scanner scanner) {
        System.out.print("Введите путь к входному файлу: ");
        String inputFilePath = scanner.nextLine();
        try {
            String content = Files.readString(Paths.get(inputFilePath));
            for (int key = 1; key < ALPHABET.length(); key++) {
                String decryptedContent = Cipher.decrypt(content, key);
                System.out.println("Ключ: " + key + ", Результат: " + decryptedContent);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при обработке файла: " + e.getMessage());
        }
    }

    public static void statisticalAnalysisDecrypt(Scanner scanner) {
        System.out.print("Введите путь к входному файлу: ");
        String inputFilePath = scanner.nextLine();
        loadFrequencies("D:\\Programming\\JavaBaseCourses\\SifrCezar/frequencies.txt"); // Загружаем частоты из файла
        try {
            String content = Files.readString(Paths.get(inputFilePath));
            String decryptedContent = decryptWithStatAnalysis(content);
            System.out.println("Результат расшифровки методом статистического анализа: " + decryptedContent);
        } catch (IOException e) {
            System.out.println("Ошибка при обработке файла: " + e.getMessage());
        }
    }

    private static String decryptWithStatAnalysis(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Считаем частоты букв в зашифрованном тексте
        for (char c : text.toCharArray()) {
            if (ALPHABET.indexOf(c) != -1 || ALPHABET_LOWER.indexOf(c) != -1) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        // Определяем самую частую букву в тексте
        char mostFrequentChar = frequencyMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey();

        // Проверяем, загружены ли частоты
        if (RUSSIAN_FREQUENCIES.isEmpty()) {
            System.out.println("Частоты не загружены. Используем 'О' как самую частую букву.");
            // Если частоты не загружены, используем букву 'О'
            int assumedKey = ALPHABET.indexOf(mostFrequentChar) - ALPHABET.indexOf('О');
            if (assumedKey < 0) assumedKey += ALPHABET.length();
            return Cipher.decrypt(text, assumedKey);
        }

        // Если частоты загружены, вычисляем ключ на основе частотного анализа
        char mostFrequentInRussian = RUSSIAN_FREQUENCIES.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get().getKey();

        int assumedKey = ALPHABET.indexOf(mostFrequentChar) - ALPHABET.indexOf(mostFrequentInRussian);
        if (assumedKey < 0) assumedKey += ALPHABET.length();

        return Cipher.decrypt(text, assumedKey);
    }

}
