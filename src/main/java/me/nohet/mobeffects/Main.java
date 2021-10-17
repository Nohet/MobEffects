package me.nohet.mobeffects;

import me.nohet.mobeffects.events.MobKill;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new MobKill(), this);

        getServer().getLogger().info("""
                
                 __  __       _     ______  __  __          _      \s
                |  \\/  |     | |   |  ____|/ _|/ _|        | |     \s
                | \\  / | ___ | |__ | |__  | |_| |_ ___  ___| |_ ___\s
                | |\\/| |/ _ \\| '_ \\|  __| |  _|  _/ _ \\/ __| __/ __|
                | |  | | (_) | |_) | |____| | | ||  __/ (__| |_\\__ \\
                |_|  |_|\\___/|_.__/|______|_| |_| \\___|\\___|\\__|___/
                                                                   \s
                Plugin has been enabled!""".indent(1));
    }

    @Override
    public void onDisable() {
        getServer().getLogger().info("""
                                 
                 __  __       _     ______  __  __          _      \s
                |  \\/  |     | |   |  ____|/ _|/ _|        | |     \s
                | \\  / | ___ | |__ | |__  | |_| |_ ___  ___| |_ ___\s
                | |\\/| |/ _ \\| '_ \\|  __| |  _|  _/ _ \\/ __| __/ __|
                | |  | | (_) | |_) | |____| | | ||  __/ (__| |_\\__ \\
                |_|  |_|\\___/|_.__/|______|_| |_| \\___|\\___|\\__|___/
                                                                   \s
                Plugin has been disabled!""".indent(1));
    }
}
