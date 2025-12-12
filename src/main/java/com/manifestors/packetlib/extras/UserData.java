package com.manifestors.packetlib.extras;

import com.google.gson.annotations.SerializedName;
import com.manifestors.packetlib.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserData {

    @SerializedName("cname")
    private final String clientUsername;
    @SerializedName("mcname")
    private final String mcName;
    @SerializedName("utype")
    private final UserType userType;

}
