/**
 * GOOD: 2 shapes + 2 renderers = 4 classes total (not 4 combo classes).
 * Adding Triangle = 1 class. Adding OpenGL renderer = 1 class.
 */
public class Main {

    public static void main(String[] args) {
        Renderer vector = new VectorRenderer();
        Renderer raster = new RasterRenderer();

        Shape c1 = new Circle(0, 0, 10, vector);
        Shape c2 = new Circle(0, 0, 10, raster);
        Shape s1 = new Square(5, 5, 20, vector);
        Shape s2 = new Square(5, 5, 20, raster);

        c1.draw();
        c2.draw();
        s1.draw();
        s2.draw();

        System.out.println("\nSuccess: any shape works with any renderer — no combo classes.");
    }
}
