public class YellowState implements LightState {
    @Override public void display() { System.out.println("[Light] YELLOW — Caution"); }
    @Override public void next(TrafficLight light) { light.setState(new RedState()); }
}
