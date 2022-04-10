package task3;

public class ConverterTest {
    public static void main(String[] args) {
        Celcius celcius = new Celcius(100);
        Kelvin kelvin = new Kelvin(0);
        Fahrenheit fahrenheit = new Fahrenheit(451);

        System.out.println(celcius.convertToFahrenheit());
        System.out.println(kelvin.convertToCelsius());
        System.out.println(fahrenheit.convertToKelvin());

    }
}


