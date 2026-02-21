/**
 * ConcreteDecorator — adds SMS notification on top of existing channels.
 */
public class SMSDecorator extends NotifierDecorator {

    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);  // Send via wrapped channels first
        System.out.println("Sending SMS: " + message);
    }
}
