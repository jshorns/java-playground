package com.fizzbuzz;

public class FizzBuzz {

    public static String fizzbuzz(int n) {
        if (n == 0)
            return "0";
        else if (n % 3 == 0 && n % 5 == 0)
            return "Fizzbuzz";
        else if (n % 3 == 0)
            return "Fizz";
        else if (n % 5 == 0)
            return "Buzz";
        else
            return Integer.toString(n);
    }
}
