package net.lowmc.core;

import net.lowmc.core.command.cmd.CMDVIP;
import org.bukkit.plugin.java.JavaPlugin;

public final class CorePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        regCmds();
        regEvents();

    }

    private void regCmds() {
        getCommand("vip").setExecutor(new CMDVIP());
    }

    private void regEvents() {
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
