package com.nitere.cloud.interviews.pattern.simplefactory;
//普通類
public class CashNormal extends CashSuper{
    @Override
    double acceptCash(double money) {
        return money;
    }
}
