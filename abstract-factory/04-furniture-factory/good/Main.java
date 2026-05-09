/**
 * GOOD: Pick a style, get a coordinated set.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Modern showroom ===");
        new FurnitureShop(new ModernFurnitureFactory()).displayLivingRoom();

        System.out.println("\n=== Victorian showroom ===");
        new FurnitureShop(new VictorianFurnitureFactory()).displayLivingRoom();

        System.out.println("\nSuccess: chair, sofa, and table always match in style.");
    }
}
