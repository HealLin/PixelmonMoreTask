package com.zeyilinxin.pixelmonmoretask.config;

import com.zeyilinxin.pixelmonmoretask.PixelmonMoreTask;
import com.zeyilinxin.pixelmonmoretask.storage.PlayerStorage;
import org.bukkit.entity.Player;

import java.io.File;

public class PixelmonMoreTaskConfig {

    private File dataFile;
    private PixelmonMoreTask task;

    public PixelmonMoreTaskConfig(PixelmonMoreTask task){
        this.task = task;
        this.dataFile = new File(this.task.getDataFolder() + "\\data");
        if (!this.dataFile.exists()) {
            this.dataFile.mkdir();
            task.putInfo("创建数据目录成功！");
        }
    }

    public PlayerStorage getPlayerStorage(Player player){
        return new PlayerStorage(player , this.task , dataFile);
    }
}
