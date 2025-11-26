package com.manifestors.packetlib.packets.clientbound;

import com.google.gson.annotations.SerializedName;
import com.manifestors.packetlib.enums.PacketType;
import com.manifestors.packetlib.extras.CapeData;
import com.manifestors.packetlib.extras.UserData;
import com.manifestors.packetlib.packets.Packet;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserJoinC2SPacket implements Packet {

    private final PacketType type = PacketType.JOIN;

    private UserData data;
    @SerializedName("cdata")
    private CapeData capeData;

}
