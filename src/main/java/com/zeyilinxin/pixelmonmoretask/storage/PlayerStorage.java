package com.zeyilinxin.pixelmonmoretask.storage;

import com.zeyilinxin.pixelmonmoretask.PixelmonMoreTask;
import com.zeyilinxin.pixelmonmoretask.config.PixelmonMoreTaskConfig;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;

public class PlayerStorage {

    private Player player;
    private PixelmonMoreTask task;
    private File config;
    private File file;
    private YamlConfiguration yamlConfiguration;

    public PlayerStorage(Player player , PixelmonMoreTask task , File config) {
        this.player = player;
        this.task = task;
        this.config = config;
        file = new File(config.getPath(), player.getUniqueId() + ".yml");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                task.putInfo("创建玩家数据文件失败");
            }
        }
        yamlConfiguration = YamlConfiguration.loadConfiguration(file);
    }

    public YamlConfiguration getYamlConfiguration(){
        return this.yamlConfiguration;
    }

    public File getFile(){
        return this.file;
    }

    public void save(){
        try {
            this.yamlConfiguration.save(this.file);
        }
        catch (IOException ex) {}
    }
}
