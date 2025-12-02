package com.nitere.cloud.interviews.algorithems.lee;

import io.micrometer.common.util.StringUtils;

import java.util.Arrays;

/**
 * 給定兩個字符串A,B. 判斷B在A中是否存在，返回A中的下標。不存在返回-1
 * KBM:
 * 1. 對於一個字符串來説，前綴就是去掉最後一位，前面的所有字符組成的字符串就是前綴
 * 2. 對於一個字符串來説，后綴就是去掉第一位，后面的所有字符組成的字符串就是后綴
 */
public class StringSearch {

    public static void main(String[] args) {
        int[] a = buildLps("aaab");
        System.out.println(Arrays.toString(a));
    }

    //暴力算法
    public static int StringSearch(String text, String pattern) {

        if (StringUtils.isBlank(pattern))
            return 0;
        if (text == null || text.length() < pattern.length())
            return -1;

        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }
            if (j == m) //查找到了
                return i;
        }

        return -1;
    }

    /**
     * KMP算法
     * 當匹配失敗時，不要把 pattern 指針退回到 0，而是退到「一個最合適的位置」。
     * 這個「最合適位置」就是利用 pattern 自身的前綴 / 後綴相等的性質
     */
    public static int StringSearchKmp(String text, String pattern) {
        if (pattern == null || pattern.isEmpty()) return 0;
        if (text == null || text.isEmpty()) return -1;

        int n = text.length();
        int m = pattern.length();

        int[] lps = buildLps(pattern);

        int i = 0; // text下標
        int j = 0; // pattern下標

        while (i < n) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;

                if (j == m) {
                    return i - j;
                }
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return -1;
    }

    /**
     * 構建lps表，獲得pattern字符串前綴等於後綴的最大長度
     */
    public static int[] buildLps(String pattern) {
       int m = pattern.length();
       int i = 1;
       int lenth = 0;
       int[] lps = new int[m];
       lps[0] = 0;
       while(i<m) {
           if(pattern.charAt(i) == pattern.charAt(lenth)) {
               lenth++;
               lps[i] = lenth;
               i++;
           }else {
               if(lenth > 0) {
                   lenth = lps[lenth-1];
               }else {
                   lps[i] = 0;
                   i++;
               }
           }
       }

       return lps;

    }
}
