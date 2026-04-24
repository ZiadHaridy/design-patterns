public class Main {
    public static void main(String[] args) {
        DataAccess da = new DataAccess();

        System.out.println("=== MySQL ===");
        da.runReport("mysql");

        System.out.println("\n=== Postgres ===");
        da.runReport("postgres");

        System.out.println("\nProblem: each step asks the same vendor question.");
        System.out.println("Nothing prevents pairing a MySQL connection with a Postgres query.");
    }
}
