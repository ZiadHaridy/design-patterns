public class Light {
    private final String location;
    public Light(String location) { this.location = location; }
    public void on()  { System.out.println("[" + location + " Light] ON"); }
    public void off() { System.out.println("[" + location + " Light] OFF"); }
}
