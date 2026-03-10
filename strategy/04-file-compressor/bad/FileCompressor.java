/**
 * BAD EXAMPLE: Compression algorithm chosen via if/else.
 *
 * Problems:
 *  1. Adding a new format (e.g., BZIP2) requires editing this class.
 *  2. All compression logic is tangled inside one class.
 *  3. Can't choose algorithm at runtime after construction.
 */
public class FileCompressor {

    private String format;

    public FileCompressor(String format) {
        this.format = format;
    }

    public void compress(String filename) {
        if (format.equals("ZIP")) {
            System.out.println("Reading file: " + filename);
            System.out.println("Applying DEFLATE compression...");
            System.out.println("Writing archive: " + filename + ".zip");

        } else if (format.equals("GZIP")) {
            System.out.println("Reading file: " + filename);
            System.out.println("Applying GZIP compression...");
            System.out.println("Writing archive: " + filename + ".gz");

        } else if (format.equals("TAR")) {
            System.out.println("Reading file: " + filename);
            System.out.println("Bundling into TAR archive (no compression)...");
            System.out.println("Writing archive: " + filename + ".tar");

        } else {
            throw new IllegalArgumentException("Unknown format: " + format);
        }
    }
}
