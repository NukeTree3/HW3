package com.nuketree3.example;

public class Calculator {

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static <T> boolean compareArrays(T[] a, T[] b) {
        if (a == null || b == null) {
            return a == null && b == null;
        }
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null || b[i] == null) {
                if(a[i] == null && b[i] == null) {
                    continue;
                }
                return false;
            }
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }
}
