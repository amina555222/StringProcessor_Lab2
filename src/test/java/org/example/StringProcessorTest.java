package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringProcessorTest {

    StringProcessor processor = new StringProcessor();

    @Test
    public void testRepeatString() {
        assertEquals("abcabc", processor.repeatString("abc", 2));
        assertEquals("", processor.repeatString("abc", 0));

        // Проверка на исключение при N < 0
        try {
            processor.repeatString("abc", -1);
            fail("Ожидалось исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Всё ок
        }
    }

    @Test
    public void testCountOccurrences() {
        assertEquals(2, processor.countOccurrences("hello hello", "hello"));
        assertEquals(0, processor.countOccurrences("hello", "world"));

        // Проверка на пустую строку
        try {
            processor.countOccurrences("hello", "");
            fail("Ожидалось исключение IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Всё ок
        }
    }

    @Test
    public void testReplaceDigitsWithWords() {
        assertEquals("один два три", processor.replaceDigitsWithWords("1 2 3"));
    }

    @Test
    public void testRemoveEverySecondChar() {
        StringBuilder sb = new StringBuilder("123456");
        processor.removeEverySecondChar(sb);
        assertEquals("135", sb.toString());
    }
}