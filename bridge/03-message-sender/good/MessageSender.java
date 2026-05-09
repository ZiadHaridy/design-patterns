/**
 * Implementor — a delivery channel.
 */
public interface MessageSender {
    void sendMessage(String priority, String body);
}
