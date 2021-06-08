package com.joey;

import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        System.out.print("Period (Years): ");
        byte mortgageYears = scanner.nextByte();
        int numberOfPayments = mortgageYears * MONTHS_IN_YEAR;
        double mortgagePayment = principal
                               * ((monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfPayments))
                                / (Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1));
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(mortgagePayment);
        System.out.println("Mortgage: " + formattedMortgage);
    }
}
