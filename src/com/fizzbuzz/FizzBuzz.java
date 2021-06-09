package com.fizzbuzz;

public class FizzBuzz {

    public static String fizzbuzz(int number) {
        if (number == 0)
            return "0";
        else if (number % 15 == 0)
            return "Fizzbuzz";
        else if (number % 3 == 0)
            return "Fizz";
        else if (number % 5 == 0)
            return "Buzz";
        else
            return Integer.toString(number);
    }
}
