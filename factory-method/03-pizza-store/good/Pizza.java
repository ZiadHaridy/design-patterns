/**
 * Product — every pizza shares the same prepare/bake/cut/box steps,
 * but with region- and type-specific behavior.
 */
public abstract class Pizza {

    protected final String name;

    protected Pizza(String name) {
        this.name = name;
    }

    public void prepare() { System.out.println("Prepare: " + name); }
    public void bake()    { System.out.println("Bake: "    + name); }
    public void cut()     { System.out.println("Cut: "     + name); }
    public void box()     { System.out.println("Box: "     + name); }

    public String getName() { return name; }
}
