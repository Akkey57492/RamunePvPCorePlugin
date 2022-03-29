package tokyo.ramune.ramunepvpcoreplugin.menu;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import tokyo.ramune.ramunepvpcoreplugin.language.Language;
import tokyo.ramune.ramunepvpcoreplugin.language.LanguageManager;
import tokyo.ramune.ramunepvpcoreplugin.language.LanguageText;

public enum MenuItem {
    CLOSE,
    BACK;

    public static ItemStack getItem(MenuItem menuItem, LanguageText languageText) {
        switch (menuItem) {
            case CLOSE:
                ItemStack itemStack = new ItemStack(Material.BARRIER);
                ItemMeta itemMeta = itemStack.getItemMeta();
                itemMeta.setDisplayName(LanguageManager.getText(Language.JAPANESE, languageText));

            default:
                return null;
        }
    }
}
