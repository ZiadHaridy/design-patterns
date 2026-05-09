public interface DocumentState {
    void submit(Document doc);
    void approve(Document doc);
    void reject(Document doc);
    void archive(Document doc);
}
