import java.util.Scanner;

public class Thirteenth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String string = scanner.nextLine();
        boolean isPalindrome = string.equals(new StringBuilder(string).reverse().toString());
        System.out.println("Является палиндромом: " + isPalindrome);
    }
}
