/**
 * GOOD: Demonstrates all four thread-safe Singleton approaches.
 * All threads get the same instance — no race conditions.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("=== 1. Synchronized Method ===");
        testThreadSafety(() -> SingletonSynchronized.getInstance());

        System.out.println("\n=== 2. Double-Checked Locking ===");
        testThreadSafety(() -> SingletonDoubleChecked.getInstance());

        System.out.println("\n=== 3. Eager Initialization ===");
        testThreadSafety(() -> SingletonEager.getInstance());

        System.out.println("\n=== 4. Bill Pugh (Best Approach) ===");
        testThreadSafety(() -> SingletonBillPugh.getInstance());
    }

    /**
     * Launches 3 threads that all call the supplier concurrently.
     * Verifies that all threads receive the same instance.
     */
    private static void testThreadSafety(java.util.function.Supplier<Object> supplier)
            throws InterruptedException {

        final Object[] instances = new Object[3];

        Thread t1 = new Thread(() -> instances[0] = supplier.get(), "Thread-1");
        Thread t2 = new Thread(() -> instances[1] = supplier.get(), "Thread-2");
        Thread t3 = new Thread(() -> instances[2] = supplier.get(), "Thread-3");

        t1.start(); t2.start(); t3.start();
        t1.join();  t2.join();  t3.join();

        boolean allSame = (instances[0] == instances[1]) && (instances[1] == instances[2]);
        System.out.println("All threads got same instance? " + allSame);
    }
}
