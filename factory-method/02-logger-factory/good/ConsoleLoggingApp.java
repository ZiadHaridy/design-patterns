/**
 * ConcreteCreator — uses a ConsoleLogger.
 */
public class ConsoleLoggingApp extends Application {

    @Override
    protected Logger createLogger() {
        return new ConsoleLogger();
    }
}
