package com.zeyilinxin.pixelmonmoretask.listener;

import com.zeyilinxin.pixelmonmoretask.PixelmonMoreTask;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PixelmonMoreTaskListener implements Listener {

    private PixelmonMoreTask pixelmonMoreTask;

    public PixelmonMoreTaskListener(PixelmonMoreTask pixelmonMoreTask) {
        this.pixelmonMoreTask = pixelmonMoreTask;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        this.pixelmonMoreTask.getPixelmonMoreTaskConfig().getPlayerStorage(player);
    }


}
