package com.nitere.cloud.interviews.pattern.simplefactory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * 滿多少返多少折扣類
 */
@AllArgsConstructor
public class CashReturn extends CashSuper{

    private double moneyCondition = 0.0d;

    private double moneyReturn = 0.0d;
    @Override
    double acceptCash(double money) {
        double result = money;
        if(money >= moneyCondition)
            result = result - moneyReturn;
        return result;
    }
}
