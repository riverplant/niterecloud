package com.nitere.cloud.interviews.pattern.stratege;

//普通類
public class CashNormal implements CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }

    @Override
    public String type() {
        return "normal";
    }
}
