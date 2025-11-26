package com.manifestors.packetlib.packets;

import com.google.gson.Gson;

public interface Packet {

    Gson gson = new Gson();

    default String toJson() {
        return gson.toJson(this);
    }

}
