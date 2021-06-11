package com.fizzbuzz;

public class FizzBuzz {

    public static String fizzbuzz(int number) {
        if (number == 0) return "0";
        if (number % 15 == 0) return "Fizzbuzz";
        if (number % 3 == 0) return "Fizz";
        if (number % 5 == 0) return "Buzz";
        return Integer.toString(number);
    }
}
