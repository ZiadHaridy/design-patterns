/**
 * BAD: A "group" of shapes is a different type from a "shape".
 * Recursive instanceof everywhere.
 */
public class Main {

    public static void main(String[] args) {
        GraphicEditor.Circle head = new GraphicEditor.Circle(50, 50, 20);
        GraphicEditor.Rectangle body = new GraphicEditor.Rectangle(40, 70, 20, 40);

        GraphicEditor.Group person = new GraphicEditor.Group("person");
        person.members.add(head);
        person.members.add(body);

        GraphicEditor.Group scene = new GraphicEditor.Group("scene");
        scene.members.add(person);
        scene.members.add(new GraphicEditor.Rectangle(0, 0, 200, 200)); // background

        GraphicEditor editor = new GraphicEditor();

        System.out.println("=== Draw scene ===");
        editor.draw(scene);

        System.out.println("\n=== Total area ===");
        System.out.println(editor.area(scene));

        System.out.println("\nProblem: every operation switches on shape type.");
    }
}
