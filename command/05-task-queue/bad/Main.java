public class Main {
    public static void main(String[] args) {
        new Scheduler().runAll(new String[]{"email", "report", "cleanup"});
        System.out.println("\nProblem: every new task type edits Scheduler.");
    }
}
