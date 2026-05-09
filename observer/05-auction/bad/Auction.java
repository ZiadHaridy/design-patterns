/**
 * BAD: Auction directly references each bidder type.
 */
public class Auction {

    private final PhoneBidder alice = new PhoneBidder("Alice");
    private final PhoneBidder bob   = new PhoneBidder("Bob");
    private final EmailBidder carol  = new EmailBidder("Carol");

    public void newBid(String item, double amount, String bidder) {
        System.out.println("[Auction] new bid: " + bidder + " → $" + amount + " for " + item);
        alice.notifyBid(item, amount, bidder);
        bob.notifyBid(item, amount, bidder);
        carol.notifyBid(item, amount, bidder);
    }
}
