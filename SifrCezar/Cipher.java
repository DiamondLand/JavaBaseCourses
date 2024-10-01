package SifrCezar;

public class Cipher {
    private static final String ALPHABET = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private static final String ALPHABET_LOWER = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    public static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();
        for (char character : text.toCharArray()) {
            if (ALPHABET.indexOf(character) != -1) {
                int newIndex = (ALPHABET.indexOf(character) + key) % ALPHABET.length();
                result.append(ALPHABET.charAt(newIndex));
            } else if (ALPHABET_LOWER.indexOf(character) != -1) {
                int newIndex = (ALPHABET_LOWER.indexOf(character) + key) % ALPHABET_LOWER.length();
                result.append(ALPHABET_LOWER.charAt(newIndex));
            } else {
                result.append(character); // не изменяем символы, не входящие в алфавит
            }
        }
        return result.toString();
    }

    public static String decrypt(String text, int key) {
        return encrypt(text, ALPHABET.length() - key); // расшифровка - это шифрование с обратным сдвигом
    }
}

