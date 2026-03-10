/**
 * Context — compresses files using whichever CompressionStrategy is injected.
 */
public class FileCompressor {

    private CompressionStrategy strategy;

    public FileCompressor(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public void compress(String filename) {
        strategy.compress(filename);
    }
}
