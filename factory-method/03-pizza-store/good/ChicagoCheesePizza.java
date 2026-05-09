public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        super("Chicago-style Cheese (deep dish, plum tomato, mozzarella)");
    }

    @Override
    public void cut() {
        // Chicago cuts deep-dish into squares, not wedges.
        System.out.println("Cut: " + name + " into squares");
    }
}
