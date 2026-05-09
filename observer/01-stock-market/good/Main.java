/**
 * GOOD: Observers register themselves. StockMarket knows nothing about their types.
 */
public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        StockObserver display = new StockDisplay();
        StockObserver logger  = new StockLogger();
        StockObserver email   = new EmailAlertService();

        market.attach(display);
        market.attach(logger);
        market.attach(email);

        market.setPrice("AAPL", 189.50);

        // Detach email alerts at runtime — market doesn't change.
        System.out.println("\n[Unsubscribed email alerts]");
        market.detach(email);

        market.setPrice("GOOG", 140.30);

        System.out.println("\nSuccess: new observers attach/detach without editing StockMarket.");
    }
}
