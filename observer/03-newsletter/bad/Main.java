public class Main {
    public static void main(String[] args) {
        new NewsletterService().publish("Weekly Digest #42");
        System.out.println("\nProblem: no way to subscribe/unsubscribe without editing publish().");
    }
}
