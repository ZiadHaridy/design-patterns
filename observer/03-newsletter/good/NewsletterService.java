import java.util.ArrayList;
import java.util.List;

public class NewsletterService {

    private final List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber s)   { subscribers.add(s); }
    public void unsubscribe(Subscriber s) { subscribers.remove(s); }

    public void publish(String edition) {
        System.out.println("[Publisher] Sending: " + edition);
        for (Subscriber s : subscribers) {
            s.receive(edition);
        }
    }
}
