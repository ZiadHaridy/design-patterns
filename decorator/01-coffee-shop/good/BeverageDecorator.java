/**
 * Base Decorator — wraps a Beverage and delegates to it.
 * All concrete decorators extend this class.
 */
public abstract class BeverageDecorator implements Beverage {

    protected Beverage wrapped;

    public BeverageDecorator(Beverage beverage) {
        this.wrapped = beverage;
    }
}
