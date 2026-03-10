/**
 * BAD: Hardcoded combo of encrypt + compress.
 * What about compress-then-encrypt vs encrypt-then-compress?
 * What about adding Base64 encoding? More classes needed!
 */
public class EncryptedCompressedFileWriter extends FileWriter {

    @Override
    public void write(String data) {
        String compressed = "ZIP(" + data + ")";
        String encrypted = "ENC(" + compressed + ")";
        System.out.println("Compressing data...");
        System.out.println("Encrypting data...");
        super.write(encrypted);
    }
}
