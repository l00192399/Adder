package com.example.adder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdderTest {

    @Test
    void addTwoPositiveNumbers() {
        assertEquals(5, Adder.add(2, 3));
    }

    @Test
    void addPositiveAndNegativeNumber() {
        assertEquals(2, Adder.add(5, -3));
    }

    @Test
    void addTwoNegativeNumbers() {
        assertEquals(-8, Adder.add(-5, -3));
    }

    @Test
    void addZero() {
        assertEquals(7, Adder.add(7, 0));
    }
}
