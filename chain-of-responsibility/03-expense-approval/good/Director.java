/**
 * ConcreteHandler — Director can approve up to $1,000.
 */
public class Director extends Approver {

    public Director() {
        super("Director", 1000);
    }
}
