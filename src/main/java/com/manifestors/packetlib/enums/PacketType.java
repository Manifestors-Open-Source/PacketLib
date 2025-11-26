package com.manifestors.packetlib.enums;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PacketType {
    JOIN("JOIN"),
    LEAVE("LEAVE"),
    @SerializedName("LIST")
    USER_LIST("LIST"),
    CAPE_STATUS("CAPE_STATUS"),
    @SerializedName("CAPE_UPDATE")
    CAPE_STATUS_UPDATE("CAPE_UPDATE"),
    @SerializedName("MSG")
    MESSAGE("MSG");

    private final String type;

    public static PacketType getPacketByType(String type) {
        for (PacketType packet : PacketType.values()) {
            if (packet.type.equalsIgnoreCase(type))
                return packet;
        }

        return null;
    }
}
