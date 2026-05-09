public class Main {
    public static void main(String[] args) {
        Button submitBtn = new Button();
        submitBtn.addListener(new FormValidator());
        submitBtn.addListener(new ApiService());
        submitBtn.addListener(new AnalyticsTracker());

        submitBtn.click();

        System.out.println("\nSuccess: Button doesn't know what handlers are attached.");
        System.out.println("The same Button class works for any combination of listeners.");
    }
}
