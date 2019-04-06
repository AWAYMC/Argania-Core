package net.lowmc.core.command.cmd;

import net.lowmc.core.CorePlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMDVIP implements CommandExecutor {

    private CorePlugin plugin;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            final Player player = (Player) sender;
            for (String s : this.plugin.getConfig().getStringList("config.message.vip")) {
                s = s.replace("&", "§");
                s = s.replace(">>", "»");
                s = s.replace("<<", "«");
                player.sendMessage(s);
            }
        } else {
            sender.sendMessage("Nie mozesz wykonac z poziomu konsoli");
        }
        return false;
    }
}
