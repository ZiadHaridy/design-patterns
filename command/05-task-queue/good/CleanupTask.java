public class CleanupTask implements Task {
    @Override public void run()     { System.out.println("[CleanupTask] removing temp files"); }
    @Override public String name()  { return "CleanupTask"; }
}
