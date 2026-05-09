public class NormalSmsMessage {
    private final String body;
    public NormalSmsMessage(String body) { this.body = body; }
    public void send() { System.out.println("[SMS][Normal] " + body); }
}
