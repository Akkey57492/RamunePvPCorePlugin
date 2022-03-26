package tokyo.ramune.ramunepvpcoreplugin.translate;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class TranslateListener implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        TranslateManager.onChat(e);
    }
}
