package tokyo.ramune.ramunepvpcoreplugin.database;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import tokyo.ramune.ramunepvpcoreplugin.RamunePvPCorePlugin;

public class DatabaseManager {

    public static void createTables() {
        if (!SQL.tableExists("players")) {
            SQL.createTable("players", "UUID NOT NULL, Latest_join_date DATETIME NOT NULL, Language text NOT NULL");
        }
    }

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
