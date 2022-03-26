package tokyo.ramune.ramunepvpcoreplugin.database.config;

import org.bukkit.configuration.file.FileConfiguration;
import tokyo.ramune.ramunepvpcoreplugin.RamunePvPCorePlugin;

public class ConfigManager {

    private static Config config;

    public static void loadConfig() {
        config = new Config(RamunePvPCorePlugin.getPlugin(), "config.yml");
    }

    public static FileConfiguration getConfig() {
        return config.getConfig();
    }

    public static boolean matchVersion() {
        if ((int) getValue(ConfigText.CONFIG_VERSION) != 1) {
            return false;
        }
        return true;
    }

    public static Object getValue(ConfigText configText) {
        switch (configText) {
            case CONFIG_VERSION:
                return getConfig().getInt("config.version", 1);

            case SPAWN_LOCATION_X:
                return getConfig().getDouble("config.spawn-location.x", 0.0);
            case SPAWN_LOCATION_Y:
                return getConfig().getDouble("config.spawn-location.y", 0.0);
            case SPAWN_LOCATION_Z:
                return getConfig().getDouble("config.spawn-location.z", 0.0);
            case SPAWN_LOCATION_YAW:
                return getConfig().getInt("config.spawn-location.yaw", 0);
            case SPAWN_LOCATION_PITCH:
                return getConfig().getInt("config.spawn-location.pitch", 0);

            case MYSQL_HOST:
                return getConfig().getString("config.mysql.host", "127.0.0.1");
            case MYSQL_PORT:
                return getConfig().getInt("config.mysql.port", 3306);
            case MYSQL_USER:
                return getConfig().getString("config.mysql.user", "dev");
            case MYSQL_PASSWORD:
                return getConfig().getString("config.mysql.password", "dev");
            case MYSQL_DATABASE:
                return getConfig().getString("config.mysql.database", "dev");

            default:
                return null;
        }
    }
}
