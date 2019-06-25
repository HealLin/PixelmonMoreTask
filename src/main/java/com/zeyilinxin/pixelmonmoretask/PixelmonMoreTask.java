package com.zeyilinxin.pixelmonmoretask;

import com.zeyilinxin.pixelmonmoretask.command.PixelmonMoreTaskCommand;
import com.zeyilinxin.pixelmonmoretask.config.PixelmonMoreTaskConfig;
import com.zeyilinxin.pixelmonmoretask.listener.PixelmonEventListener;
import com.zeyilinxin.pixelmonmoretask.listener.PixelmonMoreTaskListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class PixelmonMoreTask extends JavaPlugin {

    private PixelmonMoreTaskConfig pixelmonMoreTaskConfig;

    @Override
    public void onEnable() {
        this.putInfo("开始加载.....");
        if (!getDataFolder().exists()) {
            this.putInfo("未发现插件配置文件目录");
            getDataFolder().mkdir();
            this.putInfo("成功创建插件配置文件目录");
        }
        File file = new File(getDataFolder(), "config.yml");
        if (!file.exists()) {
            this.putInfo("未发现配置文件");
            this.putInfo("开始写入默认配置文件");
            saveDefaultConfig();
            this.putInfo("写入默认配置文件成功");
        }
        this.pixelmonMoreTaskConfig = new PixelmonMoreTaskConfig(this);
        Bukkit.getPluginManager().registerEvents(new PixelmonMoreTaskListener(this) , this);
        Bukkit.getPluginManager().registerEvents(new PixelmonEventListener(this) , this);
        getCommand("pixelmonmoretask").setExecutor(new PixelmonMoreTaskCommand(this));
    }

    public PixelmonMoreTaskConfig getPixelmonMoreTaskConfig() {
        return pixelmonMoreTaskConfig;
    }

    public void putInfo(String info){
        Bukkit.getConsoleSender().sendMessage("§c[§a神奇宝贝更多任务(免费版)——§bCatServer端§c]§b信息输出:§6" + info);
    }

}
