/** Implementor — a payment processing backend. */
public interface PaymentGateway {
    void charge(double amount, String description);
}
