/**
 * ConcreteDecorator — adds Slack notification on top of existing channels.
 */
public class SlackDecorator extends NotifierDecorator {

    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);  // Send via wrapped channels first
        System.out.println("Sending SLACK: " + message);
    }
}
