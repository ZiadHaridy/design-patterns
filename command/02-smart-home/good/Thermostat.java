public class Thermostat {
    private int temp = 20;
    public void setTemp(int t) { temp = t; System.out.println("[Thermostat] set to " + t + "°C"); }
    public int getTemp() { return temp; }
}
