/**
 * ConcreteDecorator — encrypts data before passing it to the wrapped stream.
 */
public class EncryptionDecorator extends DataStreamDecorator {

    public EncryptionDecorator(DataStream stream) {
        super(stream);
    }

    @Override
    public void write(String data) {
        String encrypted = "ENC(" + data + ")";
        System.out.println("Encrypting data...");
        wrapped.write(encrypted);
    }
}
