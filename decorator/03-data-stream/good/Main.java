/**
 * GOOD: Layer data processing steps in any order at runtime.
 * The order of wrapping = the order of processing.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Plain write ===");
        DataStream plain = new FileDataStream();
        plain.write("Hello World");

        System.out.println("\n=== Encrypt then write ===");
        DataStream encrypted = new EncryptionDecorator(new FileDataStream());
        encrypted.write("Hello World");

        System.out.println("\n=== Compress then encrypt then write ===");
        DataStream compressAndEncrypt = new EncryptionDecorator(
                new CompressionDecorator(new FileDataStream()));
        compressAndEncrypt.write("Hello World");

        System.out.println("\n=== Encrypt then compress then write (different order!) ===");
        DataStream encryptAndCompress = new CompressionDecorator(
                new EncryptionDecorator(new FileDataStream()));
        encryptAndCompress.write("Hello World");

        System.out.println("\n=== Base64 + Compress + Encrypt (3 layers) ===");
        DataStream triple = new EncryptionDecorator(
                new CompressionDecorator(
                        new Base64Decorator(new FileDataStream())));
        triple.write("Hello World");

        System.out.println("\nSuccess: 3 decorator classes, any order, any combination.");
    }
}
