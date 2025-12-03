package com.nitere.cloud.interviews.pattern.simplefactory;

/**
 * 簡單工廠設計模式
 */
public class CashFactory {

    public static CashSuper createCashAdapter(String type) {
        return switch (type) {
            case "正常收費" -> new CashNormal();
            case "滿300返100" -> new CashReturn(300, 100);
            case "打0折" -> new CashRebate(0.8);
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }
}
