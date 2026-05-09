public class UrgentSmsMessage {
    private final String body;
    public UrgentSmsMessage(String body) { this.body = body; }
    public void send() { System.out.println("[SMS][URGENT] " + body); }
}
