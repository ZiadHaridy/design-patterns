public class StockDisplay implements StockObserver {
    @Override
    public void onPriceChange(String symbol, double price) {
        System.out.println("[Display]  " + symbol + " → $" + price);
    }
}
