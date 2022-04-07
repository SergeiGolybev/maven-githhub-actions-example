package com.golubev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void shouldCalcSum() {
        Main service = new Main();
        int[] sales = {25,45,31,29,10};
        int expected = 140;

        int actual = service.calcSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMax() {
        Main service = new Main();
        int[] sales = {25,45,31,29,10};
        int expected = 45;

        int actual = service.findMax(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCheckLength() {
        Main service = new Main();
        String[] words = {"Аб", "Ф", "Фыва"};
        int expected = 4;

        int actual = service.findLongestWord(words);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindAverage() {
        Main service = new Main();
        int[] sales = {25,45,31,29,10};
        int expected = 28;

        int actual = service.findAverage(sales);

        assertEquals(expected, actual);
    }
}