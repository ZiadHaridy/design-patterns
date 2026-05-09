public class ApiService implements EventListener {
    @Override
    public void onEvent(String eventType) {
        System.out.println("[ApiService] submitting data on '" + eventType + "'");
    }
}
