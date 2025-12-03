package com.nitere.cloud.interviews.pattern.stratege;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class CashFactory {
    private static final Map<String, Supplier<CashSuper>> CASH_STRATEGIES = new HashMap<>();

    static {
        CASH_STRATEGIES.put("正常收費", CashNormal::new);
        CASH_STRATEGIES.put("滿300返100", () -> new CashReturn(300, 100));
        CASH_STRATEGIES.put("打八折", () -> new CashRebate(0.8));
    }

    public static CashSuper getCashSuper(String type) {
        Supplier<CashSuper> supplier = CASH_STRATEGIES.get(type);
        if (supplier == null) {
            throw new IllegalArgumentException("未知的收費類型: " + type);
        }
        return supplier.get(); //每一次呼叫get(),會創建一個新的對象
    }
}
