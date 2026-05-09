/**
 * Creator — owns the build → inspect → register → deliver workflow.
 * Subclasses decide which vehicle to make.
 */
public abstract class Dealership {

    /** Factory method. */
    protected abstract Vehicle createVehicle();

    public final void deliver() {
        Vehicle v = createVehicle();
        System.out.println("Build:    " + v.description());
        System.out.println("Inspect:  " + v.description());
        System.out.println("Register: " + v.description());
        System.out.println("Deliver:  " + v.description());
    }
}
