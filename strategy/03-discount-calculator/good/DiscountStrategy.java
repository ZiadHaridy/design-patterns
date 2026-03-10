/**
 * Strategy interface — defines the contract for all discount strategies.
 */
public interface DiscountStrategy {

    double apply(double price);
}
