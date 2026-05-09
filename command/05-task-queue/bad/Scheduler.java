/**
 * BAD: Scheduler knows every concrete task type and how to run them.
 */
public class Scheduler {

    public void runAll(String[] tasks) {
        for (String task : tasks) {
            if (task.equals("email")) {
                System.out.println("[Scheduler] sending email newsletter");
            } else if (task.equals("report")) {
                System.out.println("[Scheduler] generating daily report");
            } else if (task.equals("cleanup")) {
                System.out.println("[Scheduler] cleaning up temp files");
            } else {
                System.out.println("[Scheduler] unknown task: " + task);
            }
        }
    }
}
