/**
 * ConcreteComponent — the base notifier that sends email.
 */
public class EmailNotifier implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
