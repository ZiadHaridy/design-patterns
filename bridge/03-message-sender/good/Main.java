/**
 * GOOD: 2 message types + 2 channels = 4 classes total, not 4 combo classes.
 */
public class Main {

    public static void main(String[] args) {
        MessageSender email = new EmailSender();
        MessageSender sms   = new SmsSender();

        new UrgentMessage("Server is down!",     email).send();
        new NormalMessage("Weekly report ready.", email).send();
        new UrgentMessage("Server is down!",     sms).send();
        new NormalMessage("Weekly report ready.", sms).send();

        System.out.println("\nSuccess: adding Slack = 1 SlackSender. Existing messages unchanged.");
    }
}
