/**
 * BAD: WeatherStation calls each display type directly.
 */
public class WeatherStation {

    private final PhoneDisplay phone = new PhoneDisplay();
    private final WindowDisplay window = new WindowDisplay();

    public void setMeasurements(double temp, double humidity, double pressure) {
        phone.update(temp, humidity, pressure);
        window.update(temp, humidity, pressure);
    }
}
