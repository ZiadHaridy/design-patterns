/**
 * Product — what every document type must support.
 */
public interface Document {

    void open();

    void edit();

    void save();
}
