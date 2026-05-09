public class EmailSubscriber implements Subscriber {

    private final String email;

    public EmailSubscriber(String email) { this.email = email; }

    @Override
    public void receive(String edition) {
        System.out.println("[Email → " + email + "] " + edition);
    }
}
