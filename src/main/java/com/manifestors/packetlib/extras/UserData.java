package com.manifestors.packetlib.extras;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.manifestors.packetlib.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserData {

    @SerializedName("hname")
    private final String harmonyUsername;
    @SerializedName("mcname")
    private final String mcName;
    @SerializedName("utype")
    private final UserType userType;

    public String toJson() {
        return new Gson().toJson(this);
    }

}
