package com.nitere.cloud.interviews.algorithems;

/**
 * 計算階層(1! + 2! + ...+ n!)
 */
public class Factorial {

    public static void main(String[] args) {

    }


    public static int factorial(int n) {

        int cur = 1; //先獲得1的階層
        int sum = 1; //總和
        for (int i = 2; i <= n; i++) {
            cur = cur * i;
            sum += cur;
        }

        return sum;
    }
}
