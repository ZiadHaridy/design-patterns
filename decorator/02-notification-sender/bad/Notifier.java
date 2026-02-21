/**
 * BAD EXAMPLE: Subclassing for every notification combination.
 *
 * Base notifier sends via Email. But what if we also want SMS?
 * Or Email + SMS + Slack? We'd need a class for each combo.
 */
public class Notifier {

    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
