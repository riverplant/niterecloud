package com.nitere.cloud.interviews.pattern.stratege;

import lombok.AllArgsConstructor;

/**
 * 滿多少返多少折扣類
 */
@AllArgsConstructor
public class CashReturn implements CashSuper {

    private double moneyCondition = 0.0d;

    private double moneyReturn = 0.0d;

    @Override
    public double acceptCash(double money) {
        if (money >= moneyCondition) {
            double times = Math.floor(money / moneyCondition);
            return money - times * moneyReturn;
        }
        return money;
    }

    @Override
    public String type() {
        return "return";
    }
}
