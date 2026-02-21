/**
 * GOOD EXAMPLE — Approach 4: Bill Pugh Singleton (Initialization-on-Demand Holder).
 *
 * Considered the BEST approach for lazy thread-safe Singletons in Java.
 *
 * How it works:
 *  - The inner static class 'Holder' is not loaded until getInstance() is called.
 *  - When Holder is loaded, the JVM guarantees its static fields are initialized
 *    exactly once, in a thread-safe manner.
 *  - No synchronization needed, no volatile, no double-checked locking.
 *
 * This gives you BOTH lazy initialization AND thread safety for free.
 */
public class SingletonBillPugh {

    private SingletonBillPugh() {
        System.out.println(">>> SingletonBillPugh created by: " + Thread.currentThread().getName());
    }

    // Inner static class — not loaded until getInstance() is called
    private static class Holder {
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return Holder.INSTANCE;
    }
}
