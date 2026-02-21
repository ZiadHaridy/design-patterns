import java.util.HashMap;
import java.util.Map;

/**
 * BAD EXAMPLE: No Singleton — every class loads its own config.
 *
 * Problems:
 *  1. Each instance loads config independently — wasteful.
 *  2. If one module changes a setting, others don't see it.
 *  3. No single source of truth for application configuration.
 */
public class ConfigurationManager {

    private Map<String, String> config;

    public ConfigurationManager() {
        this.config = new HashMap<>();
        loadConfig();
        System.out.println(">>> New ConfigurationManager instance created and config loaded!");
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
