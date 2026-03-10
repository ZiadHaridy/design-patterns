/**
 * BAD: Encrypts then writes. But what if we want to compress too?
 */
public class EncryptedFileWriter extends FileWriter {

    @Override
    public void write(String data) {
        String encrypted = "ENC(" + data + ")";
        System.out.println("Encrypting data...");
        super.write(encrypted);
    }
}
