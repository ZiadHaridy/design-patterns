/**
 * BAD: Separate class for Slack notification.
 */
public class SlackNotifier extends Notifier {

    @Override
    public void send(String message) {
        System.out.println("Sending SLACK: " + message);
    }
}
