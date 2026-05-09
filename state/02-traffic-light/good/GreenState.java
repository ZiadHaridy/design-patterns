public class GreenState implements LightState {
    @Override public void display() { System.out.println("[Light] GREEN — Go"); }
    @Override public void next(TrafficLight light) { light.setState(new YellowState()); }
}
