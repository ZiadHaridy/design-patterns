public class Main {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.approve();   // invalid — still draft
        doc.submit();
        doc.reject();    // back to draft
        doc.submit();
        doc.approve();
        doc.archive();

        System.out.println("\nProblem: every action method has an if/else for every state.");
    }
}
