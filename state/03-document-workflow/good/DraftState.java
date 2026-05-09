public class DraftState implements DocumentState {
    @Override public void submit(Document doc)  { System.out.println("[Draft] submitted for review."); doc.setState(new ReviewState()); }
    @Override public void approve(Document doc) { System.out.println("[Draft] submit for review first."); }
    @Override public void reject(Document doc)  { System.out.println("[Draft] nothing to reject."); }
    @Override public void archive(Document doc) { System.out.println("[Draft] only published docs are archived."); }
}
