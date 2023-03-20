package com.liverday;

public class Calculator {
    public static double add (double aNumber, double anotherNumber) {
        return aNumber + anotherNumber;
    }

    public static double subtract(double aNumber, double anotherNumber) {
        return aNumber - anotherNumber;
    }

    public static double multiply(double aNumber, double anotherNumber) {
        return aNumber * anotherNumber;
    }

    public static double divide(double aNumber, double anotherNumber) {
        if (anotherNumber == 0)
            return 0;

        return aNumber / anotherNumber;
    }
}