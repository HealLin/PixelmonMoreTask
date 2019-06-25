package com.zeyilinxin.pixelmonmoretask.utils;

import org.bukkit.inventory.ItemStack;

import java.util.List;

public class Task {

    private String name;
    private ItemStack itemStack;
    private List<String> cmd;

    public Task(String name, ItemStack stack , List<String> cmd){
        this.name = name;
        this.itemStack = stack;
        this.cmd = cmd;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public String getName() {
        return name;
    }

    public List<String> getCmd() {
        return cmd;
    }

}
