/**
 * BAD EXAMPLE: Hardcoded data processing in subclasses.
 *
 * Each combination of processing (encrypt, compress) needs its own class.
 */
public class FileWriter {

    public void write(String data) {
        System.out.println("Writing to file: " + data);
    }
}
