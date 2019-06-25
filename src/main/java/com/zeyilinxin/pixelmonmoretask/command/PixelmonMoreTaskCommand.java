package com.zeyilinxin.pixelmonmoretask.command;

import com.zeyilinxin.pixelmonmoretask.PixelmonMoreTask;
import com.zeyilinxin.pixelmonmoretask.storage.PlayerStorage;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PixelmonMoreTaskCommand implements CommandExecutor {

    private PixelmonMoreTask task;

    public PixelmonMoreTaskCommand(PixelmonMoreTask task) {
        this.task = task;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;

        }
        sender.sendMessage("§c控制台无法使用这个命令！");
        return true;
    }
}
