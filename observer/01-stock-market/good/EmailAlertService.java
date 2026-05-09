public class EmailAlertService implements StockObserver {
    @Override
    public void onPriceChange(String symbol, double price) {
        System.out.println("[Email]    alert: " + symbol + " moved to $" + price);
    }
}
