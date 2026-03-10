/**
 * BAD: Separate class for SMS notification.
 * But this REPLACES email — it doesn't add to it.
 */
public class SMSNotifier extends Notifier {

    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
