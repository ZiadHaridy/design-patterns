public class StockLogger {
    public void onPriceChange(String symbol, double price) {
        System.out.println("[Logger]   AUDIT " + symbol + " price=" + price);
    }
}
