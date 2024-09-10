import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;


public class MathFunctions {

    // 1. Функция для нахождения максимума
    public int findMax(int a, int b) {
        if (a == b) {
            throw new IllegalArgumentException("Числа равны");
        }
        return Math.max(a, b);
    }

    // 2. Калькулятор деления
    public double divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Недопустимо деление на ноль");
        }
        return (double) dividend / divisor;
    }

    // 3. Конвертер строк в числа
    public int parseStringToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Невозможно конвертировать строку в число");
        }
    }

    // 4. Проверка возраста
    public void checkAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Некорректный возраст");
        }
    }

    // 5. Нахождение корня
    public double findSquareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Отрицательное число");
        }
        return Math.sqrt(number);
    }

    // 6. Факториал
    public long factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Отрицательное число");
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    // 7. Проверка массива на нули
    public void checkArrayForZeros(int[] array) {
        for (int num : array) {
            if (num == 0) {
                throw new IllegalArgumentException("Массив содержит нули");
            }
        }
    }

    // 8. Калькулятор возведения в степень
    public double power(double base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Отрицательная степень");
        }
        return Math.pow(base, exponent);
    }

    // 9. Обрезка строки
    public String trimString(String str, int length) {
        if (length > str.length()) {
            throw new IllegalArgumentException("Длина больше длины строки");
        }
        return str.substring(0, length);
    }

    // 10. Поиск элемента в массиве
    public int findElementInArray(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        throw new IllegalArgumentException("Элемент не найден");
    }

    // 11. Конвертация в двоичную систему
    public String convertToBinary(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Отрицательное число");
        }
        return Integer.toBinaryString(number);
    }

    // 12. Проверка делимости
    public boolean isDivisible(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Недопустимо деление на ноль");
        }
        return a % b == 0;
    }

    // 13. Чтение элемента списка
    public <T> T getElementAtIndex(List<T> list, int index) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка");
        }
        return list.get(index);
    }

    // 14. Парольная проверка
    public void checkPassword(String password) {
        if (password.length() < 8) {
            throw new IllegalArgumentException("Слишком слабый пароль");
        }
    }

    // 15. Проверка даты
    public void checkDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            LocalDate.parse(date, formatter);
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Некорректная дата");
        }
    }

    // 16. Конкатенация строк
    public String concatenateStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new NullPointerException("Одна из строк равна null");
        }
        return str1 + str2;
    }

    // 17. Остаток от деления
    public int remainder(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Недопустимо деление на ноль");
        }
        return a % b;
    }

    // 18. Квадратный корень
    public double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Отрицательное число");
        }
        return Math.sqrt(number);
    }

    // 19. Конвертер температуры
    public double celsiusToFahrenheit(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Температура ниже абсолютного нуля");
        }
        return (celsius * 9/5) + 32;
    }

    // 20. Проверка строки на пустоту
    public void checkString(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Строка пустая или равна null");
        }
    }

}
