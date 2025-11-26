package com.manifestors.packetlib.enums;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserType {
    @SerializedName("n")
    NONE(""),
    @SerializedName("banned")
    BLACKLIST("banned"),
    @SerializedName("user")
    USER("user"),
    @SerializedName("mod")
    MODERATOR("mod"),
    @SerializedName("dev")
    DEVELOPER("dev");

    private final String type;

    public static UserType getUserByType(String type) {
        for (UserType user : UserType.values()) {
            if (user.type.equalsIgnoreCase(type))
                return user;
        }

        return null;
    }
}
