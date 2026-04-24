/**
 * GOOD: Shapes and groups share Graphic. Nesting works for free.
 */
public class Main {

    public static void main(String[] args) {
        ShapeGroup person = new ShapeGroup("person")
            .add(new Circle(50, 50, 20))
            .add(new Rectangle(40, 70, 20, 40));

        ShapeGroup scene = new ShapeGroup("scene")
            .add(person)
            .add(new Rectangle(0, 0, 200, 200));

        System.out.println("=== Draw scene ===");
        scene.draw();

        System.out.println("\n=== Total area ===");
        System.out.println(scene.area());

        // The same calls work on a single shape.
        Graphic loneCircle = new Circle(0, 0, 5);
        System.out.println("\n=== Lone circle ===");
        loneCircle.draw();
        System.out.println("Area: " + loneCircle.area());

        System.out.println("\nSuccess: groups and shapes share one type. No instanceof.");
    }
}
