public class StockDisplay {
    public void onPriceChange(String symbol, double price) {
        System.out.println("[Display]  " + symbol + " → $" + price);
    }
}
