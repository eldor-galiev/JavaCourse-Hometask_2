package task3;

public class Kelvin implements Converter{
    private double degrees;

    public Kelvin(double degrees) {
        this.degrees = degrees;
    }

    @Override
    public double convertToCelsius() {
        return degrees - 273.15;
    }

    @Override
    public double convertToFahrenheit() {
        return (degrees * 1.8) - 459.67;
    }

    @Override
    public double convertToKelvin() {
        return degrees;
    }
}
