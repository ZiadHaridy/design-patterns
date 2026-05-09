import java.util.ArrayList;
import java.util.List;

public class Button {

    private final List<EventListener> listeners = new ArrayList<>();

    public void addListener(EventListener l) { listeners.add(l); }
    public void removeListener(EventListener l) { listeners.remove(l); }

    public void click() {
        System.out.println("[Button] clicked");
        for (EventListener l : listeners) {
            l.onEvent("click");
        }
    }
}
