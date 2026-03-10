/**
 * BAD: Can't easily combine notification channels.
 * Each combination requires a dedicated subclass.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Email only ===");
        Notifier email = new Notifier();
        email.send("Server is down!");

        System.out.println("\n=== SMS only ===");
        Notifier sms = new SMSNotifier();
        sms.send("Server is down!");

        System.out.println("\n=== Email + SMS ===");
        Notifier emailAndSms = new EmailAndSMSNotifier();
        emailAndSms.send("Server is down!");

        System.out.println("\nProblem: What about Email + Slack? SMS + Slack? All three?");
        System.out.println("We'd need a new class for EVERY combination.");
    }
}
