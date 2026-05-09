public interface BidObserver {
    void onNewBid(String item, double amount, String bidderName);
}
