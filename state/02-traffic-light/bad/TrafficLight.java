/**
 * BAD: Traffic light transitions are a chain of if/else inside one method.
 */
public class TrafficLight {

    private String color = "RED";

    public void display() {
        System.out.println("[Light] " + color);
    }

    public void next() {
        if (color.equals("RED")) {
            color = "GREEN";
        } else if (color.equals("GREEN")) {
            color = "YELLOW";
        } else if (color.equals("YELLOW")) {
            color = "RED";
        }
    }
}
