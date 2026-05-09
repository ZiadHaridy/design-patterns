public class Bidder implements BidObserver {

    private final String name;
    private final String channel; // "phone" or "email"

    public Bidder(String name, String channel) {
        this.name = name;
        this.channel = channel;
    }

    @Override
    public void onNewBid(String item, double amount, String bidderName) {
        if (!bidderName.equals(name)) {
            System.out.println("[" + channel + "→" + name + "] outbid on " + item + " — current: $" + amount);
        }
    }
}
