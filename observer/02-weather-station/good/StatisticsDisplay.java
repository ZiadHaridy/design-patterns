public class StatisticsDisplay implements WeatherObserver {

    private double minTemp = Double.MAX_VALUE;
    private double maxTemp = Double.MIN_VALUE;

    @Override
    public void update(double temp, double humidity, double pressure) {
        if (temp < minTemp) minTemp = temp;
        if (temp > maxTemp) maxTemp = temp;
        System.out.println("[Statistics] min=" + minTemp + "°C  max=" + maxTemp + "°C");
    }
}
