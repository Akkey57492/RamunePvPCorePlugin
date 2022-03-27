package tokyo.ramune.ramunepvpcoreplugin.menu;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import tokyo.ramune.ramunepvpcoreplugin.RamunePvPCorePlugin;

public class MenuManager {

    public static void openMenu(Player player) {
    }

    public static Inventory getMenu(Player player) {
        Inventory inv = Bukkit.createInventory(null, 27, "");
        Bukkit.getScheduler().runTaskAsynchronously(RamunePvPCorePlugin.getPlugin(), () -> {

        });
        return inv;
    }

    public static void onClickMenu(InventoryClickEvent e) {

    }
}
