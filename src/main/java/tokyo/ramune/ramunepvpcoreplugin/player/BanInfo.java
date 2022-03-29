package tokyo.ramune.ramunepvpcoreplugin.player;

import org.bukkit.entity.Player;
import tokyo.ramune.ramunepvpcoreplugin.database.SQLDateTime;

public class BanInfo {

    private final Player player;
    private final SQLDateTime unbanDate;
    private final String reason;

    public BanInfo(Player player, SQLDateTime unbanDate, String reason) {
        this.player = player;
        this.unbanDate = unbanDate;
        this.reason = reason;
    }

    public Player getPlayer() {
        return player;
    }

    public SQLDateTime getUnbanDate() {
        return unbanDate;
    }

    public String getReason() {
        return reason;
    }
}
