/**
 * BAD EXAMPLE: Boolean flags for every possible topping.
 *
 * Problems:
 *  1. Adding a new topping requires modifying this class (violates Open/Closed).
 *  2. Cost calculation is a messy chain of if-statements.
 *  3. Can't add double of a topping (e.g., extra cheese).
 */
public class Pizza {

    private boolean cheese;
    private boolean pepperoni;
    private boolean mushrooms;
    private boolean olives;

    public Pizza(boolean cheese, boolean pepperoni, boolean mushrooms, boolean olives) {
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.mushrooms = mushrooms;
        this.olives = olives;
    }

    public String getDescription() {
        StringBuilder sb = new StringBuilder("Pizza");
        if (cheese) sb.append(" + Cheese");
        if (pepperoni) sb.append(" + Pepperoni");
        if (mushrooms) sb.append(" + Mushrooms");
        if (olives) sb.append(" + Olives");
        return sb.toString();
    }

    public double getCost() {
        double cost = 8.0; // base price
        if (cheese) cost += 2.0;
        if (pepperoni) cost += 3.0;
        if (mushrooms) cost += 1.5;
        if (olives) cost += 1.0;
        return cost;
    }
}
