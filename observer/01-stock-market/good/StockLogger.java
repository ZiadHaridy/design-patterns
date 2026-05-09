public class StockLogger implements StockObserver {
    @Override
    public void onPriceChange(String symbol, double price) {
        System.out.println("[Logger]   AUDIT " + symbol + " price=" + price);
    }
}
