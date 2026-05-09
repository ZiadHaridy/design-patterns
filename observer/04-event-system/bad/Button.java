/**
 * BAD: Button is directly coupled to the specific action handler.
 */
public class Button {

    private final FormValidator validator = new FormValidator();
    private final ApiService apiService = new ApiService();

    public void click() {
        System.out.println("[Button] clicked");
        validator.onButtonClick();
        apiService.onButtonClick();
    }
}
