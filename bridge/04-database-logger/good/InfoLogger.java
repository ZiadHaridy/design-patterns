public class InfoLogger extends Logger {
    public InfoLogger(LogTarget target) { super(target); }
    @Override public void log(String msg) { target.write("INFO   ", msg); }
}
