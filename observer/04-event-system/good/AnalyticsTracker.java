public class AnalyticsTracker implements EventListener {
    @Override
    public void onEvent(String eventType) {
        System.out.println("[Analytics]  tracking event '" + eventType + "'");
    }
}
