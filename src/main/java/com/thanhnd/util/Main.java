package com.thanhnd.util;


import com.thanhnd.util.mathutil.core.MathUtility;

public class Main {
    public static void main(String[] args) {
        verifyFactorialGivenRightArgRunsWell();
        verifyFactorialGivenRightArg1RunsWell();
        verifyFactorialGivenRightArg2RunsWell();
        verifyFactorialGivenRightArg3RunsWell();
    }

    // TEST CASE #1: Factorial of 0
    public static void verifyFactorialGivenRightArgRunsWell(){
        int n = 0;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        System.out.println("0! = expected: " + expected + " | actual: " + actual);
    }

    // TEST CASE #2: Factorial of 1
    public static void verifyFactorialGivenRightArg1RunsWell(){
        int n = 1;
        long expected = 1;
        long actual = MathUtility.getFactorial(n);
        System.out.println("1! = expected: " + expected + " | actual: " + actual);
    }

    // TEST CASE #3: Factorial of 2
    public static void verifyFactorialGivenRightArg2RunsWell(){
        int n = 2;
        long expected = 2;
        long actual = MathUtility.getFactorial(n);
        System.out.println("2! = expected: " + expected + " | actual: " + actual);
    }

    // TEST CASE #4: Factorial of 3
    public static void verifyFactorialGivenRightArg3RunsWell(){
        int n = 3;
        long expected = 6;
        long actual = MathUtility.getFactorial(n);
        System.out.println("3! = expected: " + expected + " | actual: " + actual);

        System.out.println("4! = expected: 24 | actual: " + MathUtility.getFactorial(4));

        System.out.println("5! = expected: 120 | actual: " + MathUtility.getFactorial(5));

        System.out.println("6! = expected: 720 | actual: " + MathUtility.getFactorial(6));
    }
}