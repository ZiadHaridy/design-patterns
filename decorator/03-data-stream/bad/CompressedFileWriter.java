/**
 * BAD: Compresses then writes. Can't combine with encryption easily.
 */
public class CompressedFileWriter extends FileWriter {

    @Override
    public void write(String data) {
        String compressed = "ZIP(" + data + ")";
        System.out.println("Compressing data...");
        super.write(compressed);
    }
}
