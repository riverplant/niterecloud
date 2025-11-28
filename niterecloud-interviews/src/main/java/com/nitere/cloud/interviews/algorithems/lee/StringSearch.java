package com.nitere.cloud.interviews.algorithems.lee;

import io.micrometer.common.util.StringUtils;

/**
 * 給定兩個字符串A,B. 判斷B在A中是否存在，返回A中的下標。不存在返回-1
 * KBM:
 * 1. 對於一個字符串來説，前綴就是去掉最後一位，前面的所有字符組成的字符串就是前綴
 * 2. 對於一個字符串來説，后綴就是去掉第一位，后面的所有字符組成的字符串就是后綴
 */
public class StringSearch {

    public static void main(String[] args) {

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
   //KMP算法
    public static int StringSearchKmp(String text, String pattern) {



        return -1;
    }
}
