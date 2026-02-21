/**
 * GOOD EXAMPLE — Approach 3: Eager Initialization.
 *
 * The simplest thread-safe approach: create the instance when the class loads.
 * The JVM guarantees that static fields are initialized exactly once,
 * so no synchronization is needed.
 *
 * Trade-off: The instance is created even if it's never used (wastes memory
 * if the Singleton is heavy and unused). But if you know it will always be used,
 * this is the easiest and safest approach.
 */
public class SingletonEager {

    // Instance created at class loading time — JVM handles thread safety
    private static final SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager() {
        System.out.println(">>> SingletonEager created at class load time.");
    }

    public static SingletonEager getInstance() {
        return INSTANCE;
    }
}
