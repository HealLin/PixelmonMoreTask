package com.zeyilinxin.pixelmonmoretask.utils;

import com.zeyilinxin.pixelmonmoretask.PixelmonMoreTask;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TaskUtils {

    private PixelmonMoreTask task;
    private Task[] tasks;

    public TaskUtils(PixelmonMoreTask task){
        this.task = task;
        Set<String> set = this.task.getConfig().getConfigurationSection("Task").getKeys(false);
        tasks = new Task[set.size()];
      //  for(){
    }

    private ItemStack getItemStack(String path){
        ItemStack itemStack = new ItemStack(Material.AIR);
        itemStack.setType(this.getMaterial(path));
        itemStack.setDurability(this.getDurability(path));
        ItemMeta meta = itemStack.getItemMeta();
        meta.setDisplayName(this.getName(path));
        meta.setLore(this.getLore(path));
        itemStack.setItemMeta(meta);
        return itemStack;
    }

    private Material getMaterial(String path){
        return Material.matchMaterial(this.task.getConfig().getString("Task." + path + ".Id" , "STONE"));
    }

    private short getDurability(String path){
        return (short) this.task.getConfig().getInt("Task." + path + ".Durability" , 0);
    }

    private String getName(String path){
        return this.task.getConfig().getString("Task." + path + ".Name" , "").replace("&" , "§");
    }

    private List<String> getLore(String path) {
        List<String> list = this.task.getConfig().getStringList("Task." + path + ".Lore");
        ArrayList<String> arrayList = new ArrayList<>();
        if (list == null) {
            list = new ArrayList<>();
        }
        for (String l : list) {
            arrayList.add(l.replace("& ", "§"));
        }
        return arrayList;
    }

}
