package tokyo.ramune.ramunepvpcoreplugin.prefix;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import tokyo.ramune.ramunepvpcoreplugin.RamunePvPCorePlugin;

public class PrefixMenu {

    public static Inventory getPrefixMenu(Player player) {
        Inventory inventory = Bukkit.createInventory(null, 27, ChatColor.YELLOW + "§lPrefix Manager");
        Bukkit.getScheduler().runTaskAsynchronously(RamunePvPCorePlugin.getPlugin(), () -> {

        });
        return inventory;
    }
}
