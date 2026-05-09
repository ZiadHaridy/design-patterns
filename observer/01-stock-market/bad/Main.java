/**
 * BAD: StockMarket is hard-wired to Display, Logger, and EmailAlertService.
 */
public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        market.setPrice("AAPL", 189.50);
        market.setPrice("GOOG", 140.30);

        System.out.println("\nProblem: adding MobileApp observer requires editing StockMarket.");
        System.out.println("Cannot unsubscribe an observer at runtime.");
    }
}
