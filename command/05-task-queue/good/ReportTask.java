public class ReportTask implements Task {
    @Override public void run()     { System.out.println("[ReportTask]  generating daily report"); }
    @Override public String name()  { return "ReportTask"; }
}
