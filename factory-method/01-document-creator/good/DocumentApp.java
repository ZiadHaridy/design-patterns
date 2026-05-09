/**
 * Creator — defines the shared workflow but defers the choice of
 * concrete Document to subclasses through createDocument().
 */
public abstract class DocumentApp {

    /** Factory method — subclasses decide which document to create. */
    protected abstract Document createDocument();

    /** Shared workflow that doesn't care which concrete document it is. */
    public final void run() {
        Document doc = createDocument();
        doc.open();
        doc.edit();
        doc.save();
    }
}
