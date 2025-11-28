package com.nitere.cloud.interviews.algorithems;

import java.util.Arrays;

/**
 * f(n) = f(n-1) + f(n-2)
 */
public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

   //Memoization 備忘錄
    public static int fibonacci2(int n) {
        int[] memo = new int[n + 1]; //包括f(0)~f(n)
        Arrays.fill(memo, -1);
        return fib(memo, n);
    }


    public static int fib(int[] memo, int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        if (memo[n] != -1) return memo[n];
        memo[n] = fib(memo, n - 1) + fib(memo, n - 2);
        return memo[n];
    }
}
