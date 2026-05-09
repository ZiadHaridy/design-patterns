import java.util.ArrayList;
import java.util.List;

/**
 * Subject — notifies all registered observers whenever the price changes.
 */
public class StockMarket {

    private final List<StockObserver> observers = new ArrayList<>();

    public void attach(StockObserver o) { observers.add(o); }
    public void detach(StockObserver o) { observers.remove(o); }

    public void setPrice(String symbol, double price) {
        System.out.println("\n[Market] " + symbol + " price updated to $" + price);
        for (StockObserver o : observers) {
            o.onPriceChange(symbol, price);
        }
    }
}
