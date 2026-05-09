public class Main {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();
        for (int i = 0; i < 6; i++) {
            light.display();
            light.next();
        }
        System.out.println("\nProblem: adding a FLASHING state means editing next().");
        System.out.println("Actions per state (e.g. duration, sound) would bloat next() further.");
    }
}
