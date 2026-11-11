package org.example;

public class StringProcessor {

    // Задача 1: Повторение строки N раз
    public String repeatString(String s, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N не может быть отрицательным");
        }
        if (n == 0) {
            return "";
        }
        return s.repeat(n);
    }

    // Задача 2: Количество вхождений подстроки
    public int countOccurrences(String source, String search) {
        if (search == null || search.isEmpty()) {
            throw new IllegalArgumentException("Строка поиска не может быть пустой или null");
        }
        int count = 0;
        int index = 0;
        while ((index = source.indexOf(search, index)) != -1) {
            count++;
            index += search.length();
        }
        return count;
    }

    // Задача 3: Замена цифр на слова
    public String replaceDigitsWithWords(String source) {
        if (source == null) return null;
        return source.replace("1", "один")
                .replace("2", "два")
                .replace("3", "три");
    }

    // Задача 4: Удаление каждого второго символа в StringBuilder
    public void removeEverySecondChar(StringBuilder sb) {
        if (sb == null) return;
        // Идем с конца, чтобы удаление не сбивало индексы
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (i % 2 != 0) { // Удаляем элементы с нечетным индексом (1, 3, 5...)
                sb.deleteCharAt(i);
            }
        }
    }
}
