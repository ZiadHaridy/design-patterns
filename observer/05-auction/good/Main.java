public class Main {
    public static void main(String[] args) {
        Auction auction = new Auction();

        Bidder alice = new Bidder("Alice", "phone");
        Bidder bob   = new Bidder("Bob",   "phone");
        Bidder carol = new Bidder("Carol", "email");

        auction.register(alice);
        auction.register(bob);
        auction.register(carol);

        auction.placeBid("Vintage Clock", 200.0, "Alice");
        auction.placeBid("Vintage Clock", 250.0, "Bob");

        System.out.println("\n[Carol drops out]");
        auction.unregister(carol);

        auction.placeBid("Vintage Clock", 300.0, "Alice");

        System.out.println("\nSuccess: bidders join/leave at runtime. Auction is unchanged.");
    }
}
