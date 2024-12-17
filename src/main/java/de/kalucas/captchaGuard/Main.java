package de.kalucas.captchaGuard;

import de.kalucas.captchaGuard.Commands.doCaptcha;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static String prefix = "§b§lCaptcha§3§lGuard §8• ";

    @Override
    public void onEnable() {
        System.out.println("CaptchaGuard • Successfully enabled!");

        // Create a Config
        // Main.getConfig.get(Type)
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        // Commands
        getCommand("doCaptcha").setExecutor(new doCaptcha(this));

    }

    @Override
    public void onDisable() {
        System.out.println("CaptchaGuard • Successfully disabled!");

    }
}
