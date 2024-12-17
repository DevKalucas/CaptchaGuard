package de.kalucas.captchaGuard.Utils;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class guiItemCreater {

    /**
     * Creates a custom GUI item with specified properties.
     *
     * @param material The material type of the item.
     * @param amount The quantity of the item.
     * @param title The display name of the item.
     * @param lore Variable number of strings to be used as the item's lore.
     * @return An ItemStack object representing the created GUI item.
     */

    public ItemStack createGuiItem(final Material material, final int amount, final String title, final String... lore) {

        final ItemStack item = new ItemStack(material, amount);
        final ItemMeta meta = item.getItemMeta();

        //Set title
        meta.setDisplayName(title);

        // Clear any existing lore and set new lore
        meta.setLore(null);
        meta.setLore(java.util.Arrays.asList(lore));

        item.setItemMeta(meta);

        return item;
    }

}
