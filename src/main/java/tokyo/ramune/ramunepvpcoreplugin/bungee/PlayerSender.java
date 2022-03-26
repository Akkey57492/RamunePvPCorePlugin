package tokyo.ramune.ramunepvpcoreplugin.bungee;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import org.bukkit.entity.Player;
import tokyo.ramune.ramunepvpcoreplugin.RamunePvPCorePlugin;

public class PlayerSender {

    public void sendPlayer(Player player, String server) {
        final ByteArrayDataOutput out = ByteStreams.newDataOutput();
        out.writeUTF("Connect");
        out.writeUTF(server);
        player.sendPluginMessage(RamunePvPCorePlugin.getPlugin(),"BungeeCord", out.toByteArray());
    }
}
