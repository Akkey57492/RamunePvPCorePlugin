package tokyo.ramune.ramunepvpcoreplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import tokyo.ramune.ramunepvpcoreplugin.menu.MenuListener;

public final class RamunePvPCorePlugin extends JavaPlugin {

    private static JavaPlugin plugin;

    @Override
    public void onEnable() {
        plugin = this;

        getServer().getPluginManager().registerEvents(new MenuListener(), this);
        getLogger().info("The plugin has been enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("The plugin has been disabled.");
    }

    public static JavaPlugin getPlugin() {
        return plugin;
    }
}
