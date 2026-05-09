public class EmailAlertService {
    public void onPriceChange(String symbol, double price) {
        System.out.println("[Email]    alert: " + symbol + " moved to $" + price);
    }
}
