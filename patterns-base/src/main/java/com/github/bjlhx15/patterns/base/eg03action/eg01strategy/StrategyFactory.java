package com.github.bjlhx15.patterns.base.eg03action.eg01strategy;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {
    private static Map<String, Strategy> STRATEGY_MAP = new HashMap<>();
    static {
        STRATEGY_MAP.put(StrategyKey.MD5, new MD5Strategy());
        STRATEGY_MAP.put(StrategyKey.RSA, new RSAStrategy());
    }

    private static final Strategy NON_PROMOTION = new EmptyStrategy();

    private StrategyFactory() {

    }

    public static Strategy getPromotionStrategy(String promotionKey) {
        Strategy promotionStrategy = STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }

    private interface StrategyKey{
        String MD5 = "MD5";
        String RSA = "RSA";
    }
}
