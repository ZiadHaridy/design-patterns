public class NormalMessage extends Message {

    public NormalMessage(String body, MessageSender sender) {
        super(body, sender);
    }

    @Override
    public void send() {
        sender.sendMessage("Normal", body);
    }
}
