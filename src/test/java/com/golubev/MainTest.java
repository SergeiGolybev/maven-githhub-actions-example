package com.golubev;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void findMax() {
        Main main = new Main();
        var array = new long[] {1, 2, 3, 10, 4, 5};
        var expected = 10L;
        var actual = main.findMax(array);
        assertEquals(expected, actual);
    }
}