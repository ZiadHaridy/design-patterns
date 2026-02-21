/**
 * GOOD: All services share the same CacheManager instance.
 * Data cached by one service is immediately available to all others.
 */
public class Main {

    public static void main(String[] args) {
        // UserService caches user data
        CacheManager cache = CacheManager.getInstance();
        cache.put("user:alice", "Alice Smith");

        // OrderService uses the SAME cache
        CacheManager orderCache = CacheManager.getInstance();
        orderCache.put("order:101", "Laptop x1");

        // OrderService can find user data — HIT!
        System.out.println("\nOrderService looking for user data:");
        orderCache.get("user:alice"); // Cache HIT

        // UserService can find order data — HIT!
        System.out.println("\nUserService looking for order data:");
        cache.get("order:101");       // Cache HIT

        System.out.println("\nSame instance? " + (cache == orderCache)); // true
        System.out.println("Total cached items: " + cache.size());       // 2

        System.out.println("\nSuccess: All services share one cache with " + cache.size() + " items.");
    }
}
