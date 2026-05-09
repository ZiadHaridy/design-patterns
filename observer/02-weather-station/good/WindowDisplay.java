public class WindowDisplay implements WeatherObserver {
    @Override
    public void update(double temp, double humidity, double pressure) {
        System.out.println("[Window]     Pressure=" + pressure + " hPa  Temp=" + temp + "°C");
    }
}
