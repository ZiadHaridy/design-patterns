import java.util.HashMap;
import java.util.Map;

/**
 * BAD EXAMPLE: No Singleton — multiple caches exist independently.
 *
 * Problems:
 *  1. Each module has its own cache — data isn't shared.
 *  2. Same data may be fetched and cached multiple times.
 *  3. Cache invalidation is impossible to coordinate.
 */
public class CacheManager {

    private Map<String, Object> cache;

    public CacheManager() {
        this.cache = new HashMap<>();
        System.out.println(">>> New CacheManager instance created!");
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
}
