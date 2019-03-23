package net.argania.core;

import net.argania.core.cmds.CMDVip;
import net.argania.core.utils.ChatUtil;
import org.bukkit.plugin.java.JavaPlugin;
import pl.endrju.api.Config;

public final class Main extends JavaPlugin {

    public static String prefix = ChatUtil.fixColor("&8>> &3ARG&bANIA");

    @Override
    public void onEnable() {
        getLogger().info("----( ARG-CORE )----");
        getLogger().info(">> Licencja zaakceptowana...");
        getLogger().info(">> IP: " + Config.IP);
        getLogger().info(">> Autorzy: Piechuuu,Adrianekkk");
        getLogger().info(">> Wersja: 1.0-Beta");
        getLogger().info("----( ARG-CORE )----");
        regCmds();

        regFiles();
        regEvents();

    }
    private void regFiles() {
        getLogger().info("Pomyslnie wczytano config...");
    }

    private void regEvents() {
        getLogger().info("Pomyslnie wczytano listenery...");
    }

    private void regCmds() {
        getLogger().info("Pomyslnie wczytano komendy...");
        getCommand("vip").setExecutor(new CMDVip());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
