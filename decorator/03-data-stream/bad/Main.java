/**
 * BAD: Every processing combination is a separate class.
 * Order of operations is fixed at compile time.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Plain write ===");
        new FileWriter().write("Hello World");

        System.out.println("\n=== Encrypted write ===");
        new EncryptedFileWriter().write("Hello World");

        System.out.println("\n=== Compressed write ===");
        new CompressedFileWriter().write("Hello World");

        System.out.println("\n=== Encrypted + Compressed write ===");
        new EncryptedCompressedFileWriter().write("Hello World");

        System.out.println("\nProblem: Can't change processing order at runtime.");
        System.out.println("Each new processing step doubles the number of classes.");
    }
}
