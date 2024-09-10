import java.util.Scanner;

public class Eighteenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = scanner.nextLine();
        int vowels = 0;
        int consonants = 0;
        String lowerCaseString = string.toLowerCase();
        for (char ch : lowerCaseString.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Количество гласных: " + vowels);
        System.out.println("Количество согласных: " + consonants);
    }
}
