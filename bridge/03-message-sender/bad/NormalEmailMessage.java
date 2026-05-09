public class NormalEmailMessage {
    private final String body;
    public NormalEmailMessage(String body) { this.body = body; }
    public void send() { System.out.println("[Email][Normal] " + body); }
}
