/**
 * ConcreteDecorator — compresses data before passing it to the wrapped stream.
 */
public class CompressionDecorator extends DataStreamDecorator {

    public CompressionDecorator(DataStream stream) {
        super(stream);
    }

    @Override
    public void write(String data) {
        String compressed = "ZIP(" + data + ")";
        System.out.println("Compressing data...");
        wrapped.write(compressed);
    }
}
