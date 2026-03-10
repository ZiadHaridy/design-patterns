/**
 * ConcreteDecorator — Base64 encodes data before passing it to the wrapped stream.
 */
public class Base64Decorator extends DataStreamDecorator {

    public Base64Decorator(DataStream stream) {
        super(stream);
    }

    @Override
    public void write(String data) {
        String encoded = "B64(" + data + ")";
        System.out.println("Base64 encoding data...");
        wrapped.write(encoded);
    }
}
