public class PhoneDisplay implements WeatherObserver {
    @Override
    public void update(double temp, double humidity, double pressure) {
        System.out.println("[Phone]      Temp=" + temp + "°C  Humidity=" + humidity + "%");
    }
}
