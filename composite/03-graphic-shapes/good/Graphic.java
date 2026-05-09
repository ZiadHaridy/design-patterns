/**
 * Component — anything drawable in the editor.
 * Shapes and groups of shapes share this interface.
 */
public interface Graphic {

    void draw();

    double area();
}
