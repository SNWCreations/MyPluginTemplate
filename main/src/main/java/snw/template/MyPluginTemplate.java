package snw.template;

import org.bukkit.plugin.java.JavaPlugin;
import snw.template.nms.AdapterRetriever;

// Don't use final modifier there if you use MockBukkit
public class MyPluginTemplate extends JavaPlugin {

    static {
        AdapterRetriever.init();
    }

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
