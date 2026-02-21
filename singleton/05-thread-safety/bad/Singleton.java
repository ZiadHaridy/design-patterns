/**
 * BAD EXAMPLE: Lazy Singleton that is NOT thread-safe.
 *
 * Problem:
 *  Two threads can call getInstance() at the same time.
 *  Both see instance == null and both create a new instance.
 *  Result: TWO instances exist — the Singleton guarantee is broken.
 *
 *  Thread A: if (instance == null)  → true
 *  Thread B: if (instance == null)  → true  (A hasn't assigned yet)
 *  Thread A: instance = new Singleton()     → creates instance #1
 *  Thread B: instance = new Singleton()     → creates instance #2  ← BUG!
 */
public class Singleton {

    private static Singleton instance;
    private int value;

    private Singleton() {
        this.value = 0;
        System.out.println(">>> Singleton instance created by: " + Thread.currentThread().getName());
    }

    // NOT thread-safe!
    public static Singleton getInstance() {
        if (instance == null) {
            // Simulate a small delay to make the race condition more visible
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            instance = new Singleton();
        }
        return instance;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
