package com.nitere.cloud.interviews.pattern.stratege;

public class CashContext {

    private final CashSuper cs;

    public CashContext(String type) {
       this.cs = CashFactory.getCashSuper(type);
    }

    public double getResult(double money) {
        return cs.acceptCash(money);
    }
}
