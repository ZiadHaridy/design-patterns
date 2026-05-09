import java.util.ArrayList;
import java.util.List;

public class Auction {

    private final List<BidObserver> observers = new ArrayList<>();

    public void register(BidObserver o)   { observers.add(o); }
    public void unregister(BidObserver o) { observers.remove(o); }

    public void placeBid(String item, double amount, String bidder) {
        System.out.println("\n[Auction] " + bidder + " bid $" + amount + " on " + item);
        for (BidObserver o : observers) {
            o.onNewBid(item, amount, bidder);
        }
    }
}
