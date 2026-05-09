public class SmsSubscriber implements Subscriber {

    private final String phone;

    public SmsSubscriber(String phone) { this.phone = phone; }

    @Override
    public void receive(String edition) {
        System.out.println("[SMS → " + phone + "] " + edition);
    }
}
