public class ChicagoPepperoniPizza extends Pizza {
    public ChicagoPepperoniPizza() {
        super("Chicago-style Pepperoni (deep dish, plum tomato, pepperoni)");
    }

    @Override
    public void cut() {
        System.out.println("Cut: " + name + " into squares");
    }
}
