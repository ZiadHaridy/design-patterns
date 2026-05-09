public class WarningLogger extends Logger {
    public WarningLogger(LogTarget target) { super(target); }
    @Override public void log(String msg) { target.write("WARNING", msg); }
}
