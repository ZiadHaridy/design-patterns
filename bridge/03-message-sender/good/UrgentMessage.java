public class UrgentMessage extends Message {

    public UrgentMessage(String body, MessageSender sender) {
        super(body, sender);
    }

    @Override
    public void send() {
        sender.sendMessage("URGENT", body);
    }
}
