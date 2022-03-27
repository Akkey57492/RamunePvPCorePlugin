package tokyo.ramune.ramunepvpcoreplugin;

import org.bukkit.plugin.java.JavaPlugin;
import tokyo.ramune.ramunepvpcoreplugin.database.MySQL;
import tokyo.ramune.ramunepvpcoreplugin.database.config.ConfigManager;
import tokyo.ramune.ramunepvpcoreplugin.menu.MenuListener;

public final class RamunePvPCorePlugin extends JavaPlugin {

    private static JavaPlugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
        ConfigManager.loadConfig();
        getServer().getMessenger().registerOutgoingPluginChannel(RamunePvPCorePlugin.getPlugin(), "BungeeCord");

        MySQL.connect(true);
        if (!MySQL.isConnected()) {
            getPluginLoader().disablePlugin(this);
        }

        getServer().getPluginManager().registerEvents(new MenuListener(), this);
        getLogger().info("The plugin has been enabled.");
    }

    @Override
    public void onDisable() {
        MySQL.disconnect();
        getLogger().info("The plugin has been disabled.");
    }

    public static JavaPlugin getPlugin() {
        return plugin;
    }
}
