/**
 * GOOD: Swap compression format at runtime with no class changes.
 */
public class Main {

    public static void main(String[] args) {
        FileCompressor compressor = new FileCompressor(new ZipCompression());
        compressor.compress("report.pdf");
        System.out.println();

        compressor.setStrategy(new GzipCompression());
        compressor.compress("data.csv");
        System.out.println();

        compressor.setStrategy(new TarCompression());
        compressor.compress("backup");

        System.out.println();
        System.out.println("Success: Adding Bzip2Compression = one new class, zero edits to FileCompressor.");
    }
}
