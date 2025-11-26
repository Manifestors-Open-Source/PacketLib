package com.manifestors.packetlib.packets.clientbound;

import com.google.gson.annotations.SerializedName;
import com.manifestors.packetlib.enums.PacketType;
import com.manifestors.packetlib.enums.UserType;
import com.manifestors.packetlib.packets.Packet;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserMessageC2SPacket implements Packet {

    private final PacketType type = PacketType.MESSAGE;

    private String sender;
    @SerializedName("usertype")
    private UserType userType;
    private String message;

}
