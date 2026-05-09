public class Main {
    public static void main(String[] args) {
        SmartHomeRemote remote = new SmartHomeRemote();
        remote.pressSlot(1);
        remote.pressSlot(3);
        remote.pressSlot(2);

        System.out.println("\nProblem: remote.pressSlot() has an if/else for every slot.");
        System.out.println("Adding a Fan device = editing the remote.");
    }
}
