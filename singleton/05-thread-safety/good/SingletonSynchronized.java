/**
 * GOOD EXAMPLE — Approach 1: Synchronized Method.
 *
 * The simplest thread-safe fix: add 'synchronized' to getInstance().
 * Only one thread can enter the method at a time.
 *
 * Trade-off: Every call to getInstance() acquires a lock, even after
 * the instance is already created. This adds unnecessary overhead
 * once initialization is done.
 */
public class SingletonSynchronized {

    private static SingletonSynchronized instance;

    private SingletonSynchronized() {
        System.out.println(">>> SingletonSynchronized created by: " + Thread.currentThread().getName());
    }

    // synchronized = only one thread can enter at a time
    public static synchronized SingletonSynchronized getInstance() {
        if (instance == null) {
            instance = new SingletonSynchronized();
        }
        return instance;
    }
}
