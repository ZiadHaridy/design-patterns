import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Invoker — a generic FIFO queue of Tasks. Knows nothing about what tasks do.
 */
public class TaskQueue {

    private final Queue<Task> queue = new ArrayDeque<>();

    public void enqueue(Task task) {
        System.out.println("[Queue]   enqueued: " + task.name());
        queue.add(task);
    }

    public void flush() {
        System.out.println("[Queue]   flushing " + queue.size() + " task(s)...");
        while (!queue.isEmpty()) {
            queue.poll().run();
        }
    }

    public void clear() {
        System.out.println("[Queue]   cleared " + queue.size() + " pending task(s)");
        queue.clear();
    }
}
