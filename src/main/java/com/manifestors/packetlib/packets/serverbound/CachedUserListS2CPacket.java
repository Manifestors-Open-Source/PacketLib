package com.manifestors.packetlib.packets.serverbound;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.manifestors.packetlib.enums.PacketType;
import com.manifestors.packetlib.packets.Packet;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CachedUserListS2CPacket implements Packet {

    private final PacketType type = PacketType.USER_LIST;

    @SerializedName("users")
    private JsonElement activeUsers;
    @SerializedName("capes")
    private JsonElement activeUsersCape;

}