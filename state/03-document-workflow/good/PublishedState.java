public class PublishedState implements DocumentState {
    @Override public void submit(Document doc)  { System.out.println("[Published] already published."); }
    @Override public void approve(Document doc) { System.out.println("[Published] already approved."); }
    @Override public void reject(Document doc)  { System.out.println("[Published] cannot reject a published doc."); }
    @Override public void archive(Document doc) { System.out.println("[Published] archived."); doc.setState(new ArchivedState()); }
}
