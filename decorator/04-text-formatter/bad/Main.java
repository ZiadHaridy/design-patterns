/**
 * BAD: Can't combine text transformations flexibly.
 */
public class Main {

    public static void main(String[] args) {
        String input = "   hello world   ";

        System.out.println("Original:       [" + input + "]");
        System.out.println("UpperCase:      [" + new UpperCaseProcessor().process(input) + "]");
        System.out.println("Trim+UpperCase: [" + new TrimAndUpperCaseProcessor().process(input) + "]");

        System.out.println("\nProblem: Need a new class for every combination of transformations.");
    }
}
