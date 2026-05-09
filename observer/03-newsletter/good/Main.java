public class Main {
    public static void main(String[] args) {
        NewsletterService nl = new NewsletterService();

        Subscriber alice = new EmailSubscriber("alice@example.com");
        Subscriber bob   = new EmailSubscriber("bob@example.com");
        Subscriber carol = new SmsSubscriber("+1-555-0100");

        nl.subscribe(alice);
        nl.subscribe(bob);
        nl.subscribe(carol);

        nl.publish("Weekly Digest #42");

        System.out.println("\n[Bob unsubscribes]");
        nl.unsubscribe(bob);

        nl.publish("Breaking News #43");

        System.out.println("\nSuccess: subscribe/unsubscribe at runtime, no changes to publish().");
    }
}
