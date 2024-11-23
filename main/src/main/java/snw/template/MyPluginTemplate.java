package snw.template;

import org.bukkit.plugin.java.JavaPlugin;
import snw.template.nms.AdapterRetriever;

import java.io.IOException;
import java.util.jar.JarFile;
import java.util.logging.Level;

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

    public boolean isDebugBuild() {
        try {
            try (final JarFile jarFile = new JarFile(getFile())) {
                return jarFile.getManifest().getAttributes("Dev-Build") != null;
            }
        } catch (IOException e) {
            getLogger().log(Level.SEVERE, "Error reading debug build attribute", e);
            return false;
        }
    }
}
