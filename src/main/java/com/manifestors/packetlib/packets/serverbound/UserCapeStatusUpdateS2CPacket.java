package com.manifestors.packetlib.packets.serverbound;

import com.manifestors.packetlib.enums.PacketType;
import com.manifestors.packetlib.extras.CapeData;
import com.manifestors.packetlib.packets.Packet;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserCapeStatusUpdateS2CPacket implements Packet {

    private final PacketType type = PacketType.CAPE_STATUS_UPDATE;

    private String author;
    private CapeData data;

}
