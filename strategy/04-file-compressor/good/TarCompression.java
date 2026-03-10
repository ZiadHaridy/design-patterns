public class TarCompression implements CompressionStrategy {

    @Override
    public void compress(String filename) {
        System.out.println("Reading file: " + filename);
        System.out.println("Bundling into TAR archive (no compression)...");
        System.out.println("Writing archive: " + filename + ".tar");
    }
}
