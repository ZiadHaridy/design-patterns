public class DrinkOrder implements Order {
    private final Cook cook;
    private final String drink;
    public DrinkOrder(Cook cook, String drink) { this.cook = cook; this.drink = drink; }
    @Override public void execute() { cook.prepareDrink(drink); }
}
