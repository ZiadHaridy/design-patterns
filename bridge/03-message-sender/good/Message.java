/**
 * Abstraction — message type (priority) delegates delivery to the sender bridge.
 */
public abstract class Message {

    protected final MessageSender sender;
    protected final String body;

    protected Message(String body, MessageSender sender) {
        this.body = body;
        this.sender = sender;
    }

    public abstract void send();
}
