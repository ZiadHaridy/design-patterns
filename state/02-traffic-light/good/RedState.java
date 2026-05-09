public class RedState implements LightState {
    @Override public void display() { System.out.println("[Light] RED — Stop"); }
    @Override public void next(TrafficLight light) { light.setState(new GreenState()); }
}
