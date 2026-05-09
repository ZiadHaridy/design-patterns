public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(int x, int y, int r) {
        System.out.println("Raster:  draw circle at (" + x + "," + y + ") r=" + r + " [pixel grid]");
    }
    @Override
    public void renderSquare(int x, int y, int s) {
        System.out.println("Raster:  draw square at (" + x + "," + y + ") side=" + s + " [pixel grid]");
    }
}
