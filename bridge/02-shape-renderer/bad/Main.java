/**
 * BAD: One class per shape-renderer combination.
 * 2 shapes × 2 renderers = 4 classes. Scales as M×N.
 */
public class Main {
    public static void main(String[] args) {
        new VectorCircle().draw();
        new RasterCircle().draw();
        new VectorSquare().draw();
        new RasterSquare().draw();

        System.out.println("\nProblem: adding Triangle = VectorTriangle + RasterTriangle.");
        System.out.println("Adding OpenGL renderer = 2 more classes (OpenGLCircle, OpenGLSquare).");
    }
}
