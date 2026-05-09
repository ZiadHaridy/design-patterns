public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.insert("Hello");
        editor.insert(", World");
        editor.undo();       // undo second insert
        editor.delete(2);
        editor.undo();       // undo delete

        System.out.println("\nProblem: undo() must know about every operation via if/else.");
        System.out.println("Only one level of undo — no real history stack.");
    }
}
