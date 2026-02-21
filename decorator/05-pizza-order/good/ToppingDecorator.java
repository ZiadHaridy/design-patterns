/**
 * Base Decorator — wraps a Pizza and delegates to it.
 */
public abstract class ToppingDecorator implements Pizza {

    protected Pizza wrapped;

    public ToppingDecorator(Pizza pizza) {
        this.wrapped = pizza;
    }
}
