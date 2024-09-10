public class Main {
    public static void main(String[] args) {
        MathFunctions mathFunctions = new MathFunctions();

        // 1. Функция для нахождения максимума
        System.out.println("Максимум: " + mathFunctions.findMax(5, 10));

        // 2. Калькулятор деления
        System.out.println("Деление: " + mathFunctions.divide(10, 2));

        // 3. Конвертер строк в числа
        System.out.println("Конвертация: " + mathFunctions.parseStringToInt("123"));

        // 4. Проверка возраста
        mathFunctions.checkAge(25);
        System.out.println("Возраст корректен");

        // 5. Нахождение корня
        System.out.println("Квадратный корень: " + mathFunctions.findSquareRoot(16));

        // 6. Факториал
        System.out.println("Факториал: " + mathFunctions.factorial(5));

        // 7. Проверка массива на нули
        int[] arrayWithNoZeros = {1, 2, 3, 4};
        mathFunctions.checkArrayForZeros(arrayWithNoZeros);
        System.out.println("Массив не содержит нулей");

        // 8. Калькулятор возведения в степень
        System.out.println("Возведение в степень: " + mathFunctions.power(2, 3));

        // 9. Обрезка строки
        System.out.println("Обрезанная строка: " + mathFunctions.trimString("Hello, World!", 5));

        // 10. Поиск элемента в массиве
        int[] arrayToSearch = {1, 2, 3, 4, 5};
        System.out.println("Элемент найден на индексе: " + mathFunctions.findElementInArray(arrayToSearch, 3));

        // 11. Конвертация в двоичную систему
        System.out.println("Двоичное представление: " + mathFunctions.convertToBinary(10));
    }
}
