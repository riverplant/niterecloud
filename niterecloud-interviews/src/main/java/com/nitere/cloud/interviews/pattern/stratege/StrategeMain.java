package com.nitere.cloud.interviews.pattern.stratege;

public class StrategeMain {

    public static void main(String[] args) {
        String str = "正常收費";
        CashContext cc = new CashContext(str);
        double result = cc.getResult(100d);
        System.out.println(result);
    }
}
