/**
 * Base Decorator — wraps a DataStream and delegates to it.
 */
public abstract class DataStreamDecorator implements DataStream {

    protected DataStream wrapped;

    public DataStreamDecorator(DataStream stream) {
        this.wrapped = stream;
    }
}
