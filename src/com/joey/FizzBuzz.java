package com.joey;

public class FizzBuzz {

    public static String fizzbuzz(int n) {
        if ((n % 3) == 0)
            return "Fizz";
        else
            return Integer.toString(n);
    }
}
