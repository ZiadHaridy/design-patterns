public class Main {

    public static void main(String[] args) {
        new FileCompressor("ZIP").compress("report.pdf");
        System.out.println();
        new FileCompressor("GZIP").compress("data.csv");
        System.out.println();
        new FileCompressor("TAR").compress("backup");

        System.out.println();
        System.out.println("Problem: Adding BZIP2 = editing FileCompressor.");
    }
}
