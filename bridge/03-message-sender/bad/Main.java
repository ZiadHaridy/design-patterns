/**
 * BAD: One class per message-type + channel combination.
 * Urgent/Normal × Email/SMS = 4 classes.
 */
public class Main {
    public static void main(String[] args) {
        new UrgentEmailMessage("Server is down!").send();
        new NormalEmailMessage("Weekly report ready.").send();
        new UrgentSmsMessage("Server is down!").send();
        new NormalSmsMessage("Weekly report ready.").send();

        System.out.println("\nProblem: adding Slack channel = 2 more classes.");
    }
}
