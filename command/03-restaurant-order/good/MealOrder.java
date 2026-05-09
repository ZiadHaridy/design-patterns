public class MealOrder implements Order {
    private final Cook cook;
    private final String meal;
    public MealOrder(Cook cook, String meal) { this.cook = cook; this.meal = meal; }
    @Override public void execute() { cook.prepareMeal(meal); }
}
