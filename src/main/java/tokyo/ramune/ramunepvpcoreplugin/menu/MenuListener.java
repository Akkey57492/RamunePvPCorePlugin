package tokyo.ramune.ramunepvpcoreplugin.menu;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MenuListener implements Listener {

    @EventHandler
    public void onClickMenu(InventoryClickEvent e) {
        MenuManager.onClickMenu(e);
    }
}
