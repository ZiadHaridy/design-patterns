public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(int x, int y, int r) {
        System.out.println("Vector: draw circle at (" + x + "," + y + ") r=" + r + " [bezier]");
    }
    @Override
    public void renderSquare(int x, int y, int s) {
        System.out.println("Vector: draw square at (" + x + "," + y + ") side=" + s + " [line segments]");
    }
}
