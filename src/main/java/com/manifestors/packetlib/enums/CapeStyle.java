package com.manifestors.packetlib.enums;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Custom enum for a private project. You can edit/delete this.
 * @author metokt
 * @since 25.11.2026
 * */
@Getter
@AllArgsConstructor
public enum CapeStyle {
    @SerializedName("Harmony")
    HARMONY("Harmony"),
    @SerializedName("Hot")
    HOT("Hot"),
    @SerializedName("Anime Girl")
    ANIME_GIRL("Anime Girl"),
    @SerializedName("Kasane Teto")
    KASANE_TETO("Kasane Teto"),
    @SerializedName("???")
    WTF_IS_THIS("???");

    final String style;

    public static CapeStyle getStyleByName(String name) {
        for (CapeStyle style : CapeStyle.values()) {
            if (style.style.equalsIgnoreCase(name))
                return style;
        }

        return null;
    }

}
