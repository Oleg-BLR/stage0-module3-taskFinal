package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {

    public static void main(String[] args) {
        toFahrenheit(1);
    }
    public static void toFahrenheit(float temperatureCelsius) {

        float temperatureFahrenheit;
        temperatureFahrenheit = ((temperatureCelsius * 9) / 5 + 32);
        System.out.println(temperatureFahrenheit);
    }
}
