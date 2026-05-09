public class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String priority, String body) {
        System.out.println("[Email][" + priority + "] " + body);
    }
}
