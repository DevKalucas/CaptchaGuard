package de.kalucas.captchaGuard.Commands;

import de.kalucas.captchaGuard.Main;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class doCaptcha implements CommandExecutor {

    private Main main;

    public doCaptcha(Main main) {
        this.main = main;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

        // Check if sender instanceof player
        if(sender instanceof Player) {
            Player p = (Player) sender;
            if(p.hasPermission("captchaGuard.doCaptchaCMD")) {
                if(args.length == 0) {
                    p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_BASS, 1f, 1f);

                } else {
                 p.sendMessage(Main.prefix + main.getConfig().getString("doCaptcha.doCaptchaArgsError"));
                }
            } else {
                p.sendMessage(Main.prefix + main.getConfig().getString("doCaptcha.doCaptchaPermissionError"));
            }
        } else {
            System.out.println(Main.prefix + main.getConfig().getString("doCaptcha.doCaptchaSenderError"));
        }

        return false;
    }
}
