public class ZipCompression implements CompressionStrategy {

    @Override
    public void compress(String filename) {
        System.out.println("Reading file: " + filename);
        System.out.println("Applying DEFLATE compression...");
        System.out.println("Writing archive: " + filename + ".zip");
    }
}
