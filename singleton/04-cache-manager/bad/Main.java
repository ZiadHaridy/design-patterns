/**
 * BAD: Each service has its own cache.
 * Data cached by one service is invisible to another.
 */
public class Main {

    public static void main(String[] args) {
        // UserService caches user data
        CacheManager userCache = new CacheManager();
        userCache.put("user:alice", "Alice Smith");

        // OrderService creates its own cache
        CacheManager orderCache = new CacheManager();
        orderCache.put("order:101", "Laptop x1");

        // OrderService tries to get user data — MISS! It's in a different cache.
        System.out.println("\nOrderService looking for user data:");
        orderCache.get("user:alice"); // Cache MISS

        // UserService tries to get order data — MISS!
        System.out.println("\nUserService looking for order data:");
        userCache.get("order:101");   // Cache MISS

        System.out.println("\nProblem: Each service has its own cache ("
            + userCache.size() + " items and "
            + orderCache.size() + " items separately).");
        System.out.println("Data is duplicated or invisible across services.");
    }
}
