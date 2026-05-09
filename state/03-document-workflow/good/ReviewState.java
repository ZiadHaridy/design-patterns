public class ReviewState implements DocumentState {
    @Override public void submit(Document doc)  { System.out.println("[Review] already under review."); }
    @Override public void approve(Document doc) { System.out.println("[Review] approved and published!"); doc.setState(new PublishedState()); }
    @Override public void reject(Document doc)  { System.out.println("[Review] rejected — back to draft."); doc.setState(new DraftState()); }
    @Override public void archive(Document doc) { System.out.println("[Review] cannot archive while under review."); }
}
