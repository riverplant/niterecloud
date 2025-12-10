package com.nitere.cloud.gateway.domian.enums;

import lombok.Getter;

@Getter
public enum UserTypeEnum {
    DIAMOND(3, "diamond"),
    GOLD(2, "gold"),
    SILVER(1, "silver"),
    NORMAL(0, "normal");

    private final int level;
    private final String name;

    UserTypeEnum(int level, String name) {
        this.level = level;
        this.name = name;
    }

    public static UserTypeEnum fromLevel(int level) {
        for (UserTypeEnum type : values()) {
            if (type.level == level) {
                return type;
            }
        }
        throw new IllegalArgumentException("未知的用戶等級 level: " + level);
    }

    public static UserTypeEnum  fromName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("displayName 不能為空或 null");
        }
        for (UserTypeEnum type : values()) {
            if (type.name.equalsIgnoreCase(name)) {
                return type;

            }
        }
        throw new IllegalArgumentException(
                "未知的用戶等級名稱 displayName: " + name + "，可選值: " + allowedDisplayNames()
        );
    }

    private static String allowedDisplayNames() {
        StringBuilder sb = new StringBuilder();
        for (UserTypeEnum t : values()) {
            if (!sb.isEmpty()) sb.append(", ");
            sb.append(t.name);
        }
        return sb.toString();
    }

}
