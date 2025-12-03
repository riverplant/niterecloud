package com.nitere.cloud.interviews.pattern.stratege;
/**
 * 折扣率折扣類
 */
public class CashRebate implements CashSuper {
    private double rebate = 1d;//默認沒有折扣

    public CashRebate(double rebate) {
        this.rebate = rebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * rebate;
    }

    @Override
    public String type() {
        return "rebate";
    }
}
