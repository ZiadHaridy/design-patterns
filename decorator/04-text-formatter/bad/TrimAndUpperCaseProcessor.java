/**
 * BAD: Hardcoded combination of trim + uppercase.
 * What about trim + lowercase? trim + uppercase + addBrackets? Class explosion.
 */
public class TrimAndUpperCaseProcessor extends TextProcessor {

    @Override
    public String process(String text) {
        return text.trim().toUpperCase();
    }
}
