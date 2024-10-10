import java.util.Scanner;

public class Temperature_conversion{

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        double celsius = fahrenheitToCelsius(fahrenheit);
        return celsiusToKelvin(celsius);
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        double celsius = kelvinToCelsius(kelvin);
        return celsiusToFahrenheit(celsius);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter the unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = scanner.next().toUpperCase().charAt(0);

        switch (unit) {
            case 'C':
                double fahrenheitFromC = celsiusToFahrenheit(temperature);
                double kelvinFromC = celsiusToKelvin(temperature);
                System.out.printf("%.2f°C is equal to %.2f°F and %.2fK%n", temperature, fahrenheitFromC, kelvinFromC);
                break;
            case 'F':
                double celsiusFromF = fahrenheitToCelsius(temperature);
                double kelvinFromF = fahrenheitToKelvin(temperature);
                System.out.printf("%.2f°F is equal to %.2f°C and %.2fK%n", temperature, celsiusFromF, kelvinFromF);
                break;
            case 'K':
                double celsiusFromK = kelvinToCelsius(temperature);
                double fahrenheitFromK = kelvinToFahrenheit(temperature);
                System.out.printf("%.2fK is equal to %.2f°C and %.2f°F%n", temperature, celsiusFromK, fahrenheitFromK);
                break;
            default:
                System.out.println("Invalid unit. Please enter C, F, or K.");
                break;
        }

        scanner.close();
    }
}
