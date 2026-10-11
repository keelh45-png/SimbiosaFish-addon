
package id.simbiosa.fish;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Listener;

public final class SimbiosaFishPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(this, this);

        getLogger().info("SimbiosaFish enabled.");
        getLogger().warning(
            "Fishing quota and EvenMoreFish integration are not implemented yet."
        );
    }

    @Override
    public void onDisable() {
        getLogger().info("SimbiosaFish disabled.");
    }
}
