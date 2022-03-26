package tokyo.ramune.ramunepvpcoreplugin.bungee;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import org.bukkit.entity.Player;
import tokyo.ramune.ramunepvpcoreplugin.RamunePvPCorePlugin;

public class PlayerSender {

    private final ByteArrayDataOutput out;

    public PlayerSender() {
        RamunePvPCorePlugin.getPlugin().getServer().getMessenger().registerOutgoingPluginChannel(RamunePvPCorePlugin.getPlugin(), "BungeeCord");
        out = ByteStreams.newDataOutput();
    }

    public void sendPlayer(Player player, String server) {
        out.writeUTF("Connect");
        out.writeUTF(server);
        player.sendPluginMessage(RamunePvPCorePlugin.getPlugin(),"BungeeCord", out.toByteArray());
    }
}
