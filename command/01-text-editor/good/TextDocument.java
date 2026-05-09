/**
 * Receiver — the document that commands operate on.
 */
public class TextDocument {

    private final StringBuilder text = new StringBuilder();

    public void append(String s)           { text.append(s); }
    public void deleteLast(int count)      { int s = Math.max(0, text.length() - count); text.delete(s, text.length()); }
    public String getLast(int count)       { int s = Math.max(0, text.length() - count); return text.substring(s); }
    public int    length()                 { return text.length(); }
    @Override public String toString()     { return text.toString(); }
}
