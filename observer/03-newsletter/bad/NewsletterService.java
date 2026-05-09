/**
 * BAD: Hardcoded subscriber list. Subscribe/unsubscribe is impossible.
 */
public class NewsletterService {

    public void publish(String edition) {
        // send to Alice
        System.out.println("[Email → alice@example.com] " + edition);
        // send to Bob
        System.out.println("[Email → bob@example.com]   " + edition);
        // send to Carol
        System.out.println("[SMS → +1-555-0100]         " + edition);
        // Adding Dave = editing this method.
    }
}
