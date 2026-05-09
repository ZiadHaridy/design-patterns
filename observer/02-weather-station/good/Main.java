public class Main {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();

        ws.attach(new PhoneDisplay());
        ws.attach(new WindowDisplay());
        ws.attach(new StatisticsDisplay());

        System.out.println("=== Reading 1 ===");
        ws.setMeasurements(22.5, 65.0, 1013.0);

        System.out.println("\n=== Reading 2 ===");
        ws.setMeasurements(18.0, 70.0, 1008.5);

        System.out.println("\nSuccess: StatisticsDisplay added without touching WeatherStation.");
    }
}
