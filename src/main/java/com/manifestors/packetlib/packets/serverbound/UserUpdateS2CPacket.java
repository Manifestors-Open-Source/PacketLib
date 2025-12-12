package com.manifestors.packetlib.packets.serverbound;

import com.google.gson.annotations.SerializedName;
import com.manifestors.packetlib.enums.PacketType;
import com.manifestors.packetlib.extras.UserData;
import com.manifestors.packetlib.packets.Packet;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserUpdateS2CPacket implements Packet {

    private final PacketType type = PacketType.UPDATE;

    @SerializedName("mcname")
    private String mcName;
    @SerializedName("data")
    private UserData userData;

}
