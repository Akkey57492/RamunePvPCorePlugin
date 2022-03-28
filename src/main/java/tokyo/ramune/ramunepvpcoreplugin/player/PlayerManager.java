package tokyo.ramune.ramunepvpcoreplugin.player;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import tokyo.ramune.ramunepvpcoreplugin.RamunePvPCorePlugin;
import tokyo.ramune.ramunepvpcoreplugin.database.SQL;

public class PlayerManager {
    public static void registerPlayer(Player player) {
        if (!SQL.exists("uuid", player.getUniqueId().toString(), "players")) {

        }
    }

    public static void onPlayerJoin(PlayerJoinEvent e) {
        Bukkit.getScheduler().runTaskAsynchronously(RamunePvPCorePlugin.getPlugin(), () -> {
            if (!SQL.exists("uuid", e.getPlayer().getUniqueId().toString(), "players")) {

            }

        });
    }
}
