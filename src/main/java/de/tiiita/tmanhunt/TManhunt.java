package de.tiiita.tmanhunt;

import org.bukkit.plugin.java.JavaPlugin;

public final class TManhunt extends JavaPlugin {


    @Override
    public void onEnable() {
        // Plugin startup logic

        registerListener();
        registerCommands();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    private void registerCommands() {


    }
    private void registerListener() {


    }
}
