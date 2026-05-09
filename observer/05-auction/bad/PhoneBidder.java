public class PhoneBidder {
    private final String name;
    public PhoneBidder(String name) { this.name = name; }
    public void notifyBid(String item, double amount, String bidder) {
        if (!bidder.equals(name))
            System.out.println("[Phone→" + name + "] outbid on " + item + " — current: $" + amount);
    }
}
