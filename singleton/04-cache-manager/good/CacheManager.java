import java.util.HashMap;
import java.util.Map;

/**
 * GOOD EXAMPLE: Singleton CacheManager.
 *
 * Benefits:
 *  1. One shared cache across the entire application.
 *  2. Data cached by one module is available to all others.
 *  3. Centralized cache invalidation and size management.
 */
public class CacheManager {

    private static CacheManager instance;

    private Map<String, Object> cache;

    private CacheManager() {
        this.cache = new HashMap<>();
        System.out.println(">>> CacheManager instance created (only once).");
    }

    public static CacheManager getInstance() {
        if (instance == null) {
            instance = new CacheManager();
        }
        return instance;
    }

    public void put(String key, Object value) {
        cache.put(key, value);
        System.out.println("Cached: " + key + " = " + value);
    }

    public Object get(String key) {
        Object value = cache.get(key);
        if (value != null) {
            System.out.println("Cache HIT: " + key + " = " + value);
        } else {
            System.out.println("Cache MISS: " + key);
        }
        return value;
    }

    public int size() {
        return cache.size();
    }

    public void clear() {
        cache.clear();
        System.out.println("Cache cleared.");
    }
}
