/**
 * GOOD: Combine text transformations freely at runtime.
 */
public class Main {

    public static void main(String[] args) {
        String input = "   hello world   ";

        // Plain — no transformation
        TextComponent plain = new PlainText();
        System.out.println("Plain:                   [" + plain.process(input) + "]");

        // Trim only
        TextComponent trimmed = new TrimDecorator(new PlainText());
        System.out.println("Trim:                    [" + trimmed.process(input) + "]");

        // UpperCase only
        TextComponent upper = new UpperCaseDecorator(new PlainText());
        System.out.println("UpperCase:               [" + upper.process(input) + "]");

        // Trim then UpperCase
        TextComponent trimAndUpper = new UpperCaseDecorator(new TrimDecorator(new PlainText()));
        System.out.println("Trim + UpperCase:        [" + trimAndUpper.process(input) + "]");

        // Trim then UpperCase then Brackets
        TextComponent full = new BracketDecorator(
                new UpperCaseDecorator(
                        new TrimDecorator(new PlainText())));
        System.out.println("Trim + Upper + Brackets: " + full.process(input));

        System.out.println("\nSuccess: 3 decorator classes handle any combination of text formatting.");
    }
}
