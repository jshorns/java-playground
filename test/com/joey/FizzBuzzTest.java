package com.joey;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    public void test1() {
        assertEquals("1", FizzBuzz.fizzbuzz(1));
    }
}