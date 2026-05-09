/**
 * BAD EXAMPLE: A data layer that picks the database vendor inline.
 *
 * Problems:
 *  1. Adding Oracle/SQLite means editing every method here.
 *  2. Connection and Command products can drift out of sync —
 *     the code can build a MySQL connection and a PostgreSQL command
 *     and there's no compiler help to prevent it.
 *  3. The domain workflow (open → run query → close) is tangled
 *     with vendor-specific logic.
 */
public class DataAccess {

    public void runReport(String vendor) {
        // open connection
        if (vendor.equals("mysql")) {
            System.out.println("[MySQL] open connection mysql://localhost:3306/app");
        } else if (vendor.equals("postgres")) {
            System.out.println("[Postgres] open connection postgres://localhost:5432/app");
        }

        // run command
        if (vendor.equals("mysql")) {
            System.out.println("[MySQL] execute: SELECT * FROM users LIMIT 10  (uses LIMIT syntax)");
        } else if (vendor.equals("postgres")) {
            System.out.println("[Postgres] execute: SELECT * FROM users LIMIT 10  (uses LIMIT/OFFSET syntax)");
        }

        // close
        if (vendor.equals("mysql")) {
            System.out.println("[MySQL] close connection");
        } else if (vendor.equals("postgres")) {
            System.out.println("[Postgres] close connection");
        }
    }
}
