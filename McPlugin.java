package com.ttp.mcplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import javax.swing.text.PlainDocument;

public final class McPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("插件已开启");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("插件已关闭");
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (command.getName().equals("healthy")) {
            if  (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage(ChatColor.DARK_BLUE + "生命回复系统：" + ChatColor.DARK_PURPLE + player.getName() + "您的生命已经回复到健康状态!");
                player.setHealth(20.0);
            }else {
                System.out.println("You can use this command throught console!");
            }

        }

        return false;
    }
}
