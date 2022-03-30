package tokyo.ramune.ramunepvpcoreplugin.player;

import org.bukkit.BanList;
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
                    player.getUniqueId().toString() + ", " + player.getName() + ", ENGLISH, NONE, " + new SQLDateTime().getSQLDate() + ", 1",
                    "players");
        }
    }

    public static void banPlayer(Player player, String reason) {
        if (SQL.exists("uuid", player.getUniqueId().toString(), "bans")) {
            return;
        }

    }

    public static void tempBanPlayer(Player player, SQLDateTime sqlDateTime, String reason) {

    }

    public static void unBanPlayer(Player player) {
        if (SQL.exists("target_uuid", player.getUniqueId().toString(), "bans")) {
            SQL.deleteData("target_uuid", "=", player.getUniqueId().toString(), "bans");
        }
    }

    public static boolean updateBan(Player player) {
        if (SQL.exists()) {
            ; // エラーの根源は死ね!なにこれ...
        }
    }

    public static boolean isBanned(Player player) {

    }

    public static BanInfo getPlayerBanInfo(Player player) {
        if (!SQL.exists("uuid", player.getUniqueId().toString(), "bans")) {
            return null;
        }
        if (SQL.get("unban_date", "uuid", "=", player.getUniqueId().toString(), "bans") == null) {
            return new BanInfo(player,
                    null,
                    String.valueOf(SQL.get("reason", "uuid" , "=", player.getUniqueId().toString(), "bans")));
        }
        return new BanInfo(player,
                new SQLDateTime(String.valueOf(SQL.get("unban_date", "uuid", "=", player.getUniqueId().toString(), "bans"))),
                String.valueOf(SQL.get("reason", "uuid" , "=", player.getUniqueId().toString(), "bans")));
    }

    public static boolean isPlayerBanned(Player player) {
        if (SQL.exists("uuid", player.getUniqueId().toString(), "bans")) {
            return true;
        }
        return false;
    }

    public static void onPlayerJoin(PlayerJoinEvent e) {
        Bukkit.getScheduler().runTaskAsynchronously(RamunePvPCorePlugin.getPlugin(), () -> {
            if (!SQL.exists("uuid", e.getPlayer().getUniqueId().toString(), "players")) {

            }

        });
    }


}
