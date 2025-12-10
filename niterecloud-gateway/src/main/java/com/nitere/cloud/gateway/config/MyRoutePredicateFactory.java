package com.nitere.cloud.gateway.config;

import com.nitere.cloud.gateway.domian.enums.UserTypeEnum;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.cloud.gateway.handler.predicate.GatewayPredicate;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.server.ServerWebExchange;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * 自定義網關的Predicate
 * 需求說明: 自定義配置會員等級userType, 按照鑽/金/銀和yml配置的會員等級
 */
@Component
public class MyRoutePredicateFactory extends AbstractRoutePredicateFactory<MyRoutePredicateFactory.Config> {

    public static final String USER_TYPE_KEY = "userType";

    public MyRoutePredicateFactory() {
        super(MyRoutePredicateFactory.Config.class);
    }

    public List<String> shortcutFieldOrder() {
        // 讓 yml 支援簡寫：- MyRoute=GOLD
        return Collections.singletonList(USER_TYPE_KEY);
    }

    //
    public Predicate<ServerWebExchange> apply(final MyRoutePredicateFactory.Config config) {
        return new GatewayPredicate() {
            public boolean test(ServerWebExchange serverWebExchange) {

                //http://10.0.0.168:9527/production/gateway/get/1?userType=diamond
                var userType = serverWebExchange.getRequest()
                        .getQueryParams()
                        .getFirst(USER_TYPE_KEY);

                UserTypeEnum requestType = UserTypeEnum.fromName(userType);

                // 如果請求用戶等級 >= 路由要求等級，則匹配
                return requestType.getLevel() >= config.userType.getLevel();
            }

            public Object getConfig() {
                return config;
            }

            public String toString() {
                return String.format("userType:>= %s", config.userType.getName());
            }
        };
    }

    @Setter
    @Getter
    @Validated
    public static class Config {
        private @NotNull UserTypeEnum userType; // yml配置的會員等級（DIAMOND/GOLD/SILVER/NORMAL）

        public Config() {
        }

    }
}
