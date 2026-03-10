public class GzipCompression implements CompressionStrategy {

    @Override
    public void compress(String filename) {
        System.out.println("Reading file: " + filename);
        System.out.println("Applying GZIP compression...");
        System.out.println("Writing archive: " + filename + ".gz");
    }
}
