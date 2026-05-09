/**
 * BAD EXAMPLE: StockMarket directly references every concrete observer.
 *
 * Problems:
 *  1. Adding a new observer type (e.g. MobileApp) means editing StockMarket.
 *  2. Observers cannot be added or removed at runtime.
 *  3. StockMarket is tightly coupled to every consumer of its data.
 */
public class StockMarket {

    private double price;
    private final StockDisplay display = new StockDisplay();
    private final StockLogger logger = new StockLogger();
    private final EmailAlertService alertService = new EmailAlertService();

    public void setPrice(String symbol, double price) {
        this.price = price;
        // must call every concrete observer by hand
        display.onPriceChange(symbol, price);
        logger.onPriceChange(symbol, price);
        alertService.onPriceChange(symbol, price);
    }
}
