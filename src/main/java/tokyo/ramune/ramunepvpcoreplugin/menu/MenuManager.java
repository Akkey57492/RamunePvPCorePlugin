package tokyo.ramune.ramunepvpcoreplugin.menu;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import tokyo.ramune.ramunepvpcoreplugin.RamunePvPCorePlugin;

public class MenuManager {

    public static void openMenu(Player player) {
        player.openInventory(getMenu(player));
    }

    public static Inventory getMenu(Player player) {
        Inventory inv = Bukkit.createInventory(null, 27, "");
        Bukkit.getScheduler().runTaskAsynchronously(RamunePvPCorePlugin.getPlugin(), () -> {

        });
        return inv;
    }

    public static void fillBackGround(Inventory inventory) {
        for (int i = 0; i > inventory.getSize(); i++) {
            inventory.setItem(i, new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 7));
        }
    }

    public static void onClickMenu(InventoryClickEvent e) {

    }
}
