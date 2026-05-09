public class UrgentEmailMessage {
    private final String body;
    public UrgentEmailMessage(String body) { this.body = body; }
    public void send() { System.out.println("[Email][URGENT] " + body); }
}
