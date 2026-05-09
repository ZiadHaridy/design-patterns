public class EmailBidder {
    private final String name;
    public EmailBidder(String name) { this.name = name; }
    public void notifyBid(String item, double amount, String bidder) {
        if (!bidder.equals(name))
            System.out.println("[Email→" + name + "] outbid on " + item + " — current: $" + amount);
    }
}
