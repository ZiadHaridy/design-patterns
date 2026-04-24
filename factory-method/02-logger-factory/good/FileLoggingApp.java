/**
 * ConcreteCreator — uses a FileLogger.
 */
public class FileLoggingApp extends Application {

    @Override
    protected Logger createLogger() {
        return new FileLogger();
    }
}
