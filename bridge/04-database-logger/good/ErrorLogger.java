public class ErrorLogger extends Logger {
    public ErrorLogger(LogTarget target) { super(target); }
    @Override public void log(String msg) { target.write("ERROR  ", msg); }
}
