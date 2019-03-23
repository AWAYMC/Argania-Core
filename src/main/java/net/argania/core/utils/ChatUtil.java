package net.argania.core.utils;

import org.bukkit.ChatColor;

public class ChatUtil {

    private ChatUtil() {
    }

    public static String fixColor(String message) {
        if (message.isEmpty()) return "";
        else return ChatColor.translateAlternateColorCodes('&', message.replace("<3", "❤").replace(">>", "»").replace("<<", "«"));
    }
}

