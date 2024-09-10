import java.util.Scanner;

public class Nineteenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку, состоящую из нескольких слов: ");
        String string = scanner.nextLine();
        String[] words = string.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        System.out.println("Слова в обратном порядке: " + reversed.toString().trim());
    }
}
