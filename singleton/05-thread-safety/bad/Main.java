/**
 * BAD: Demonstrates the race condition with a non-thread-safe Singleton.
 * Multiple threads can create separate instances.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        // Store references from each thread
        final Singleton[] instances = new Singleton[3];

        Thread t1 = new Thread(() -> {
            instances[0] = Singleton.getInstance();
            instances[0].setValue(1);
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            instances[1] = Singleton.getInstance();
            instances[1].setValue(2);
        }, "Thread-2");

        Thread t3 = new Thread(() -> {
            instances[2] = Singleton.getInstance();
            instances[2].setValue(3);
        }, "Thread-3");
 
        // Start all threads simultaneously
        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to finish
        t1.join();
        t2.join();
        t3.join();

        // Check if all threads got the same instance
        System.out.println("\nResults:");
        System.out.println("Thread-1 instance: " + instances[0].hashCode() + " value=" + instances[0].getValue());
        System.out.println("Thread-2 instance: " + instances[1].hashCode() + " value=" + instances[1].getValue());
        System.out.println("Thread-3 instance: " + instances[2].hashCode() + " value=" + instances[2].getValue());

        System.out.println("\nt1 == t2? " + (instances[0] == instances[1]));
        System.out.println("t2 == t3? " + (instances[1] == instances[2]));

        if (instances[0] != instances[1] || instances[1] != instances[2]) {
            System.out.println("\nBUG: Multiple instances were created! Singleton is broken.");
        } else {
            System.out.println("\nLucky: Same instance this time, but it's NOT guaranteed.");
        }
    }
}
