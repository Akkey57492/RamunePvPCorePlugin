package tokyo.ramune.ramunepvpcoreplugin.player;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import tokyo.ramune.ramunepvpcoreplugin.RamunePvPCorePlugin;
import tokyo.ramune.ramunepvpcoreplugin.database.SQL;
import tokyo.ramune.ramunepvpcoreplugin.database.SQLDateTime;

public class PlayerManager {

    public static void registerPlayer(Player player) {
        if (!SQL.exists("uuid", player.getUniqueId().toString(), "players")) {
            SQL.insertData("uuid, username, language, prefix, latest_join_date, status",
                    player.getUniqueId().toString() + ", " + player.getName() + ", ENGLISH, NONE, " + new SQLDateTime().getDate() + ", 1",
                    "players");
        }
    }

    public static void onPlayerJoin(PlayerJoinEvent e) {
        Bukkit.getScheduler().runTaskAsynchronously(RamunePvPCorePlugin.getPlugin(), () -> {
            if (!SQL.exists("uuid", e.getPlayer().getUniqueId().toString(), "players")) {

            }

        });
    }
}
