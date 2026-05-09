public class Main {
    public static void main(String[] args) {
        Auction auction = new Auction();
        auction.newBid("Vintage Clock", 200.0, "Alice");
        auction.newBid("Vintage Clock", 250.0, "Bob");
        System.out.println("\nProblem: Auction hardcodes Alice, Bob, Carol.");
    }
}
