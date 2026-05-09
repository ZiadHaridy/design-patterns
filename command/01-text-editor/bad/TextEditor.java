/**
 * BAD EXAMPLE: Editor manages undo itself with giant if/else on a string type-tag.
 *
 * Problems:
 *  1. Every new operation (bold, indent, paste) adds another branch to undo().
 *  2. Undo state is a loose parallel set of variables, not encapsulated.
 *  3. The editor cannot be tested for undo without executing the operation first.
 */
public class TextEditor {

    private StringBuilder text = new StringBuilder();
    // parallel state for a poor-man's undo
    private String lastOp;
    private String lastValue;

    public void insert(String s) {
        text.append(s);
        lastOp = "insert";
        lastValue = s;
        System.out.println("[Editor] insert '" + s + "'  →  \"" + text + "\"");
    }

    public void delete(int count) {
        int start = Math.max(0, text.length() - count);
        lastValue = text.substring(start);
        text.delete(start, text.length());
        lastOp = "delete";
        System.out.println("[Editor] delete " + count + " chars  →  \"" + text + "\"");
    }

    public void undo() {
        if ("insert".equals(lastOp)) {
            text.delete(text.length() - lastValue.length(), text.length());
            System.out.println("[Editor] undo insert  →  \"" + text + "\"");
        } else if ("delete".equals(lastOp)) {
            text.append(lastValue);
            System.out.println("[Editor] undo delete  →  \"" + text + "\"");
        }
        lastOp = null;
    }
}
