/**
 * GOOD: TaskQueue is a generic invoker. Adding BackupTask = 1 new class.
 */
public class Main {

    public static void main(String[] args) {
        TaskQueue queue = new TaskQueue();

        queue.enqueue(new EmailTask());
        queue.enqueue(new ReportTask());
        queue.enqueue(new CleanupTask());

        System.out.println();
        queue.flush();

        System.out.println();
        queue.enqueue(new EmailTask());
        queue.enqueue(new ReportTask());
        queue.clear();  // abort before running

        System.out.println("\nSuccess: queue handles any Task. Scheduler never changes.");
    }
}
