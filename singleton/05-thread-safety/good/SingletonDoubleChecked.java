/**
 * GOOD EXAMPLE — Approach 2: Double-Checked Locking.
 *
 * Optimization over synchronized method:
 *  - First check: avoids entering the synchronized block if instance exists.
 *  - Second check: inside the lock, ensures only one thread creates the instance.
 *  - 'volatile' keyword: ensures all threads see the updated instance immediately.
 *
 * This is the most commonly recommended approach for lazy thread-safe Singletons.
 */
public class SingletonDoubleChecked {

    // 'volatile' ensures visibility across threads
    private static volatile SingletonDoubleChecked instance;

    private SingletonDoubleChecked() {
        System.out.println(">>> SingletonDoubleChecked created by: " + Thread.currentThread().getName());
    }

    public static SingletonDoubleChecked getInstance() {
        if (instance == null) {                        // First check (no lock)
            synchronized (SingletonDoubleChecked.class) {
                if (instance == null) {                // Second check (with lock)
                    instance = new SingletonDoubleChecked();
                }
            }
        }
        return instance;
    }
}
