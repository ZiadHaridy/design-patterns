public class Main {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();
        for (int i = 0; i < 6; i++) {
            light.display();
            light.next();
        }
        System.out.println("\nSuccess: adding Flashing state = one new class.");
        System.out.println("Duration and sound logic lives inside each state class.");
    }
}
