package tokyo.ramune.ramunepvpcoreplugin.database;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class DatabaseListener implements Listener {

    @EventHandler
    public void onJoinPlayer(PlayerJoinEvent e) {
        DatabaseManager.onPlayerJoin(e);
    }
}
