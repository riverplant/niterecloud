package com.nitere.cloud.interviews.algorithems;

/**
 * int有32位，
 * 在循環中，先將1左移到左邊第一位，然後和數字的左邊第一位進行&比較，
 * 如果該位也等於1，&的結果將會是1 此時就打印1
 * 如果該位不等於1.&的結果是0，此時就打印0
 *
 * 想要打印哪一位，就將1左移道道那一位，然後進行&, 結果如果為1就證明該位的值為1， 否則為0
 *  System.out.print 將會打印在同一行
 */
public class Printer32 {
    public static void main(String[] args) {
        print(4);
    }

    //打印整數的32位
    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
    }
}
