public class ArchivedState implements DocumentState {
    @Override public void submit(Document doc)  { System.out.println("[Archived] archived docs cannot be resubmitted."); }
    @Override public void approve(Document doc) { System.out.println("[Archived] nothing to approve."); }
    @Override public void reject(Document doc)  { System.out.println("[Archived] nothing to reject."); }
    @Override public void archive(Document doc) { System.out.println("[Archived] already archived."); }
}
