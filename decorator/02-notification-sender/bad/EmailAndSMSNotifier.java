/**
 * BAD: Need a separate class for Email + SMS combo.
 * What about Email + Slack? SMS + Slack? Email + SMS + Slack?
 * This doesn't scale.
 */
public class EmailAndSMSNotifier extends Notifier {

    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
        System.out.println("Sending SMS: " + message);
    }
}
