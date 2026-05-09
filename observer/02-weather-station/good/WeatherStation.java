import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

    private final List<WeatherObserver> observers = new ArrayList<>();
    private double temp, humidity, pressure;

    public void attach(WeatherObserver o) { observers.add(o); }
    public void detach(WeatherObserver o) { observers.remove(o); }

    public void setMeasurements(double temp, double humidity, double pressure) {
        this.temp = temp; this.humidity = humidity; this.pressure = pressure;
        notifyObservers();
    }

    private void notifyObservers() {
        for (WeatherObserver o : observers) {
            o.update(temp, humidity, pressure);
        }
    }
}
