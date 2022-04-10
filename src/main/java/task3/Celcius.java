package task3;

public class Celcius implements Converter{
    private double degrees;

    public Celcius(double degrees) {
        this.degrees = degrees;
    }

    @Override
    public double convertToCelsius() {
        return degrees;
    }

    @Override
    public double convertToFahrenheit() {
        return (degrees * 1.8) + 32;
    }

    @Override
    public double convertToKelvin() {
        return degrees + 273.15;
    }
}
