public class FormValidator implements EventListener {
    @Override
    public void onEvent(String eventType) {
        System.out.println("[Validator]  validating form on '" + eventType + "'");
    }
}
