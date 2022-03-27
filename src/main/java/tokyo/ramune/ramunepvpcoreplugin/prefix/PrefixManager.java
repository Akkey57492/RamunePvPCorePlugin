package tokyo.ramune.ramunepvpcoreplugin.prefix;

import org.bukkit.entity.Player;
import tokyo.ramune.ramunepvpcoreplugin.database.SQL;

import java.util.UUID;

public class PrefixManager {

    public static Prefix getPrefix(Player player) {
        return Prefix.valueOf(String.valueOf(SQL.get("prefix", "uuid", "=", player.getUniqueId().toString(), "playets")));
    }

    public static Prefix getPrefix(UUID uuid) {
        return Prefix.valueOf(String.valueOf(SQL.get("prefix", "uuid", "=", uuid.toString(), "players")));
    }

    public static void setPrefix(Player player, Prefix prefix) {
        SQL.set("prefix", prefix, "uuid", "=", player.getUniqueId().toString(), "players");
    }

    public static void setPrefix(UUID uuid, Prefix prefix) {
        SQL.set("prefix", prefix, "uuid", "=", uuid.toString(), "players");
    }
}
