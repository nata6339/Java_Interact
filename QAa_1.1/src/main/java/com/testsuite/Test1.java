package com.testsuite;

public class Test1 {
    public static void main(String[] args) {
        sum();
        avg();
        mod();
        inc();
        mul();
        com();
    }

    public static void sum() {
        int multi = 2 + 7;
        System.out.println("1.Sum result: " + multi);
    }

    public static void avg() {
        int a = 6;
        int b = 3;
        int c = 25;
        float avg = (a + b + c) / 3f;
        System.out.println("2.Average result: " + avg);
    }

    public static void mod() {
        int b = 30;
        System.out.println("3.Modulo of 30 / 7 = " + b % 7);
    }

    public static void inc() {
        int y = 122;
        System.out.println("4. Increase by 1: 122 + 1 = " + ++y);
    }

    public static void mul() {
        int c = 17;
        float mul = c * 1.5f;
        System.out.println("5.Multiplication: 7 * 1.5 = " + mul);
    }

    public static void com() {
        int com = ((12 + 5) - (7 * 3));
        System.out.println("6.Complex equation: ( 12 + 5 ) - ( 7 * 3 ) = " + com);
    }


}

