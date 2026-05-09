/**
 * GOOD: One factory per vendor. The data layer can't accidentally
 * mix a MySQL connection with a Postgres command.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== MySQL ===");
        new DataAccess(new MySqlFactory()).runReport();

        System.out.println("\n=== Postgres ===");
        new DataAccess(new PostgresFactory()).runReport();

        System.out.println("\nSuccess: vendor selection happens once, at startup.");
        System.out.println("Adding Oracle = 1 OracleFactory + Oracle Connection/Command.");
    }
}
