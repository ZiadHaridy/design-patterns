public class UpperCaseProcessor extends TextProcessor {

    @Override
    public String process(String text) {
        return text.toUpperCase();
    }
}
