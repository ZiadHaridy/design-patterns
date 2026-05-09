public class Document {

    private DocumentState state = new DraftState();
    private String title;

    public Document(String title) { this.title = title; }

    public void setState(DocumentState s) { this.state = s; }
    public String getTitle() { return title; }

    public void submit()  { state.submit(this); }
    public void approve() { state.approve(this); }
    public void reject()  { state.reject(this); }
    public void archive() { state.archive(this); }
}
