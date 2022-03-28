package tokyo.ramune.ramunepvpcoreplugin.prefix;

import org.bukkit.entity.Player;
import tokyo.ramune.ramunepvpcoreplugin.database.SQL;

import java.util.UUID;

public class PrefixManager {

    public static void createPrefix(String prefix, String color) {
        if (!SQL.exists("name", prefix, "prefixes")) {
            SQL.insertData("name, color", "", "prefixes");
        }
    }

    public static void removePrefix(String prefix) {
        SQL.deleteData("name", "=", prefix, "prefixes");
    }

    public static String getPrefixColor(String prefix) {
        
    }

    public static String getPlayerPrefix(Player player) {
        return String.valueOf(SQL.get("prefix", "uuid", "=", player.getUniqueId().toString(), "playets"));
    }

    public static String getPlayerPrefix(UUID uuid) {
        return String.valueOf(SQL.get("prefix", "uuid", "=", uuid.toString(), "players"));
    }

    public static void setPlayerPrefix(Player player, String prefix) {
        SQL.set("prefix", prefix, "uuid", "=", player.getUniqueId().toString(), "players");
    }

    public static void setPlayerPrefix(UUID uuid, String prefix) {
        SQL.set("prefix", prefix, "uuid", "=", uuid.toString(), "players");
    }

    public static void updatePlayerPrefix(Player player) {
        player.setCustomName(getPrefixColor(getPlayerPrefix(player)) + getPlayerPrefix(player) + "§8 ╏ " + getPrefixColor(getPlayerPrefix(player)) + player.getName());
    }
}
