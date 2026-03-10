/**
 * Base Decorator — wraps a Notifier and delegates to it.
 * Concrete decorators ADD their channel on top of the wrapped one.
 */
public abstract class NotifierDecorator implements Notifier {

    protected Notifier wrapped;

    public NotifierDecorator(Notifier notifier) {
        this.wrapped = notifier;
    }

    @Override
    public void send(String message) {
        wrapped.send(message);
    }
}
