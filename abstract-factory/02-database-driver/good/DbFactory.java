/**
 * AbstractFactory — produces a matching Connection + Command pair for a vendor.
 */
public interface DbFactory {

    Connection createConnection();

    Command createCommand();
}
