package com.manifestors.packetlib.extras;

import com.google.gson.annotations.SerializedName;
import com.manifestors.packetlib.enums.CapeStyle;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CapeData {

    @SerializedName("cstatus")
    private boolean isCapeActive;
    @SerializedName("cstyle")
    private CapeStyle capeStyle;

}
