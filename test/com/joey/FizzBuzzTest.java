package com.joey;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    public void testForNonDivisible() {
        assertEquals("1", FizzBuzz.fizzbuzz(1));
    }
    @Test
    public void testForDivisibleByThree() {
        assertEquals("Fizz", FizzBuzz.fizzbuzz(9));
    }
    @Test
    public void testForDivisibleByFive() {
        assertEquals("Buzz", FizzBuzz.fizzbuzz(10));
    }
    @Test
    public void testForDivisibleByThreeAndFive() {
        assertEquals("Fizzbuzz", FizzBuzz.fizzbuzz(15));
    }
    @Test
    public void testForZero() {
        assertEquals("0", FizzBuzz.fizzbuzz(0));
    }
}