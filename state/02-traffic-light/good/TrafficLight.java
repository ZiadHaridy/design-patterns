public class TrafficLight {

    private LightState state = new RedState();

    public void setState(LightState s) { this.state = s; }
    public void display() { state.display(); }
    public void next()    { state.next(this); }
}
