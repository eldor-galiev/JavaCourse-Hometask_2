package task3;

public class Fahrenheit implements Converter{
    private double degrees;

    public Fahrenheit(double degrees) {
        this.degrees = degrees;
    }

    @Override
    public double convertToCelsius() {
        return (degrees - 32) / 1.8;
    }

    @Override
    public double convertToFahrenheit() {
        return degrees;
    }

    @Override
    public double convertToKelvin() {
        return (degrees + 459.67) / 1.8;
    }
}
