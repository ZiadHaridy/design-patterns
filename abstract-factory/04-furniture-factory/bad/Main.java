public class Main {
    public static void main(String[] args) {
        FurnitureShop s = new FurnitureShop();

        System.out.println("=== Modern ===");
        s.displayLivingRoom("modern");

        System.out.println("\n=== Victorian ===");
        s.displayLivingRoom("victorian");

        System.out.println("\nProblem: nothing forces a consistent style across the room.");
    }
}
