package com.nitere.cloud.interviews.algorithems;

/**
 * 反轉一個String
 */
public class ReverseString {

    public static void main(String[] args) {
        System.out.print(reverseString2("abcdefg"));
    }
    public static String reverseString(String str) {
       if(str==null || str.length() <=1) return str;
       return reverseString(str.substring(1))+str.charAt(0);
    }


    public static String reverseString2(String str) {
        if(str==null || str.length() <=1) return str;
        char[] charArray = str.toCharArray();
        int i = 0, j = charArray.length - 1;
        while(i<j) {
            char temp = charArray[i];
            charArray[i] = charArray[j] ;
            charArray[j] = temp;
            i++;
            j--;
        }
        return new String(charArray);
    }
}
