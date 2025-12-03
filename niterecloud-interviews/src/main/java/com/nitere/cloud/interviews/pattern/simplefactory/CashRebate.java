package com.nitere.cloud.interviews.pattern.simplefactory;

/**
 * 折扣率折扣類
 */
public class CashRebate extends CashSuper{
    private double rebate = 1d;//默認沒有折扣

    public CashRebate(double rebate) {
        this.rebate = rebate;
    }

    @Override
    double acceptCash(double money) {
        return money * rebate;
    }
}
