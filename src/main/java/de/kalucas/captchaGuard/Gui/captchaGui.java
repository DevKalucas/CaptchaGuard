package de.kalucas.captchaGuard.Gui;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

public class captchaGui implements Listener {

    private final Inventory captchaInventory;

    public captchaGui(Inventory captchaGui) {
        // Create a new Inventory, with no owner, with a size of 9 Slots and the custom title
        captchaInventory = Bukkit.createInventory(null, 9, "§8• §cCaptcha");
    }
}
