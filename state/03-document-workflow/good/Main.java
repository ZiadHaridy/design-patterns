public class Main {
    public static void main(String[] args) {
        Document doc = new Document("Design Patterns Guide");

        doc.approve();  // invalid — still draft
        doc.submit();
        doc.reject();   // back to draft
        doc.submit();
        doc.approve();
        doc.archive();
        doc.submit();   // invalid — archived

        System.out.println("\nSuccess: each action is one line in each state class.");
        System.out.println("Adding 'Deprecated' state = 1 new class + update 2 transitions.");
    }
}
