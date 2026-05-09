public class EmailTask implements Task {
    @Override public void run()     { System.out.println("[EmailTask]   sending newsletter"); }
    @Override public String name()  { return "EmailTask"; }
}
