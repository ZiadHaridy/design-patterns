public class SmsSender implements MessageSender {
    @Override
    public void sendMessage(String priority, String body) {
        System.out.println("[SMS  ][" + priority + "] " + body);
    }
}
