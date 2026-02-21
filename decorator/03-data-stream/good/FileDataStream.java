/**
 * ConcreteComponent — writes raw data to a file.
 */
public class FileDataStream implements DataStream {

    @Override
    public void write(String data) {
        System.out.println("Writing to file: " + data);
    }
}
