/**
 * BAD: Document workflow has a nested if/else for every action × state pair.
 */
public class Document {

    private String state = "DRAFT"; // DRAFT | REVIEW | PUBLISHED | ARCHIVED

    public void submit() {
        if (state.equals("DRAFT"))          { state = "REVIEW";    System.out.println("Submitted for review."); }
        else if (state.equals("REVIEW"))    { System.out.println("Already under review."); }
        else if (state.equals("PUBLISHED")) { System.out.println("Already published."); }
        else                                { System.out.println("Archived docs can't be submitted."); }
    }

    public void approve() {
        if (state.equals("REVIEW"))         { state = "PUBLISHED"; System.out.println("Document published!"); }
        else if (state.equals("DRAFT"))     { System.out.println("Submit for review first."); }
        else                                { System.out.println("Nothing to approve."); }
    }

    public void archive() {
        if (state.equals("PUBLISHED"))      { state = "ARCHIVED";  System.out.println("Document archived."); }
        else                                { System.out.println("Only published docs can be archived."); }
    }

    public void reject() {
        if (state.equals("REVIEW"))         { state = "DRAFT";     System.out.println("Sent back to draft."); }
        else                                { System.out.println("Nothing to reject in state: " + state); }
    }
}
