/**
 * GOOD: Stack notification channels at runtime using decorators.
 * Any combination is possible without creating new classes.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Email only ===");
        Notifier emailOnly = new EmailNotifier();
        emailOnly.send("Server is down!");

        System.out.println("\n=== Email + SMS ===");
        Notifier emailAndSms = new SMSDecorator(new EmailNotifier());
        emailAndSms.send("Server is down!");

        System.out.println("\n=== Email + Slack ===");
        Notifier emailAndSlack = new SlackDecorator(new EmailNotifier());
        emailAndSlack.send("Server is down!");

        System.out.println("\n=== Email + SMS + Slack (all channels) ===");
        Notifier allChannels = new SlackDecorator(
                new SMSDecorator(
                        new EmailNotifier()));
        allChannels.send("Server is down!");

        System.out.println("\nSuccess: 2 decorator classes handle ALL channel combinations.");
    }
}
