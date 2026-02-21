import java.util.HashMap;
import java.util.Map;

/**
 * GOOD EXAMPLE: Singleton ConfigurationManager.
 *
 * Benefits:
 *  1. Config is loaded only once.
 *  2. All modules share the same config — changes are visible everywhere.
 *  3. Single source of truth for application settings.
 */
public class ConfigurationManager {

    private static ConfigurationManager instance;

    private Map<String, String> config;

    private ConfigurationManager() {
        this.config = new HashMap<>();
        loadConfig();
        System.out.println(">>> ConfigurationManager instance created (only once).");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    private void loadConfig() {
        // Simulate loading configuration from a file or environment
        config.put("app.name", "MyApplication");
        config.put("app.version", "1.0.0");
        config.put("db.host", "localhost");
        config.put("db.port", "3306");
        config.put("log.level", "INFO");
    }

    public String get(String key) {
        return config.get(key);
    }

    public void set(String key, String value) {
        config.put(key, value);
        System.out.println("Config updated: " + key + " = " + value);
    }
}
