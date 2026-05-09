/**
 * Observer — anything that wants to be notified of price changes.
 */
public interface StockObserver {
    void onPriceChange(String symbol, double price);
}
