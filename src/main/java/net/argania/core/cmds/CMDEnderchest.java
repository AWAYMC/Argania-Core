package net.argania.core.cmds;

import net.argania.core.utils.ChatUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CMDEnderchest implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) { //JEBAC CIE XD
            sender.sendMessage("ta komenda nie jest od poziomu konsolii");
            return false;
        }
        if(!sender.hasPermission("argania.core.enderchest")){
            sender.sendMessage(ChatUtil.fixColor("&8>> &4Blad: &cNie posiadasz permisji do &7(argania.core.enderchest)"));
            return false;
        }
        Player p = (Player) sender;
        p.openInventory(p.getEnderChest());
        return true;
    }
}

