package com.bluedev.helloworld;

import org.bukkit.plugin.java.JavaPlugin;

public final class HelloWorld extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Hello World!");

        // Register our command "helloworld" (set an instance of your command class as executor)
        getCommand("안녕세계").setExecutor(new Command());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Goodbye World!");
    }


}
